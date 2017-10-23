!
function(a) {
    "function" == typeof define && define.amd ? define(["jquery"], a) : a(jQuery)
} (function(a) {
    a.cxScroll = function() {
        var b, c, d, h, i, e = {
            dom: {},
            api: {},
            lockState: !1
        },
        f = function(a) {
            return a && ("function" == typeof HTMLElement || "object" == typeof HTMLElement) && a instanceof HTMLElement ? !0 : a && a.nodeType && 1 === a.nodeType ? !0 : !1
        },
        g = function(a) {
            return a && a.length && ("function" == typeof jQuery || "object" == typeof jQuery) && a instanceof jQuery ? !0 : !1
        };
        for (h = 0, i = arguments.length; i > h; h++) g(arguments[h]) ? b = arguments[h] : f(arguments[h]) ? b = a(arguments[h]) : "function" == typeof arguments[h] ? d = arguments[h] : "object" == typeof arguments[h] && (c = arguments[h]);
        b.length && (e.init = function() {
            var e = this;
            e.dom.el = b,
            e.settings = a.extend({},
            a.cxScroll.defaults, c),
            e.build(),
            e.api = {
                play: function() {
                    e.settings.auto = !0,
                    e.play()
                },
                stop: function() {
                    e.settings.auto = !1,
                    e.stop()
                },
                prev: function(a) {
                    a = parseInt(a, 10),
                    ("number" != typeof a || 0 > a) && (a = e.settings.speed),
                    e.goto(e.prevVal, a)
                },
                next: function(a) {
                    a = parseInt(a, 10),
                    ("number" != typeof a || 0 > a) && (a = e.settings.speed),
                    e.goto(e.nextVal, a)
                }
            },
            "function" == typeof d && d(e.api)
        },
        e.build = function() {
            var b = this;
            if (b.dom.box = b.dom.el.find(".box"), b.dom.list = b.dom.box.find(".list"), b.dom.items = b.dom.list.find("li"), b.itemSum = b.dom.items.length, !(b.itemSum <= 1)) {
                if (b.dom.prevBtn = b.dom.el.find(".prev"), b.dom.nextBtn = b.dom.el.find(".next"), b.itemWidth = b.dom.items.outerWidth(), b.itemHeight = b.dom.items.outerHeight(), "left" === b.settings.direction || "right" === b.settings.direction) {
                    if (b.itemWidth * b.itemSum <= b.dom.box.outerWidth()) return;
                    b.prevVal = "left",
                    b.nextVal = "right",
                    b.moveVal = b.itemWidth
                } else {
                    if (b.itemHeight * b.itemSum <= b.dom.box.outerHeight()) return;
                    b.prevVal = "top",
                    b.nextVal = "bottom",
                    b.moveVal = b.itemHeight
                }
                b.dom.list.append(b.dom.list.html()),
				
				//替换按钮图片位置
                b.settings.prevBtn && !b.dom.prevBtn.length && (b.dom.prevBtn = a("<a class='prev'><img src=\'/picture/0/1611301117166501198.png\'></a>", {
                    "class": "prev"     
                }).prependTo(b.dom.el)),
				
				//替换按钮图片位置
                b.settings.nextBtn && !b.dom.nextBtn.length && (b.dom.nextBtn = a("<a class='next'><img src=\'/picture/0/1611301123153426148.png\'></a>", {
                    "class": "next"
                }).prependTo(b.dom.el)),
                b.settings.nextBtn && b.dom.prevBtn.length && b.dom.nextBtn.bind("click",
                function() {
                    b.lockState || b.goto(b.nextVal, b.settings.accel)
                }),
                b.settings.prevBtn && b.dom.prevBtn.length && b.dom.prevBtn.bind("click",
                function() {
                    b.lockState || b.goto(b.prevVal, b.settings.accel)
                }),
                b.settings.hoverLock && (b.dom.box.on("mouseenter",
                function() {
                    b.stop()
                }), b.dom.box.on("mouseleave",
                function() {
                    b.play()
                })),
                b.play()
            }
        },
        e.play = function() {
            var a = this;
            a.settings.auto && (a.stop(), a.run = setTimeout(function() {
                a.goto()
            },
            a.settings.time))
        },
        e.stop = function() {
            "undefined" != typeof this.run && clearTimeout(this.run)
        },
        e.goto = function(b, c) {
            var e, f, d = this,
            g = c || d.settings.speed;
            switch ("string" != typeof b && (b = d.settings.direction), d.stop(), d.lockState = !0, b) {
            case "left":
            case "top":
                e = 0,
                "left" === b ? (0 === parseInt(d.dom.box.scrollLeft(), 10) && d.dom.box.scrollLeft(d.itemSum * d.moveVal), f = d.dom.box.scrollLeft() - d.moveVal * d.settings.step, f % d.itemWidth > 0 && (f -= f % d.itemWidth - d.itemWidth), e > f && (f = e), d.dom.box.animate({
                    scrollLeft: f
                },
                g, d.settings.easing,
                function() {
                    parseInt(d.dom.box.scrollLeft(), 10) <= e && d.dom.box.scrollLeft(0)
                })) : (0 === parseInt(d.dom.box.scrollTop(), 10) && d.dom.box.scrollTop(d.itemSum * d.moveVal), f = d.dom.box.scrollTop() - d.moveVal * d.settings.step, f % d.itemHeight > 0 && (f -= f % d.itemHeight - d.itemHeight), e > f && (f = e), d.dom.box.animate({
                    scrollTop: f
                },
                g, d.settings.easing,
                function() {
                    parseInt(d.dom.box.scrollTop(), 10) <= e && d.dom.box.scrollTop(0)
                }));
                break;
            case "right":
            case "bottom":
                e = d.itemSum * d.moveVal,
                "right" === b ? (f = d.dom.box.scrollLeft() + d.moveVal * d.settings.step, f % d.itemWidth > 0 && (f -= f % d.itemWidth), f > e && (f = e), d.dom.box.animate({
                    scrollLeft: f
                },
                g, d.settings.easing,
                function() {
                    parseInt(d.dom.box.scrollLeft(), 10) >= e && d.dom.box.scrollLeft(0)
                })) : (f = d.dom.box.scrollTop() + d.moveVal * d.settings.step, f % d.itemHeight > 0 && (f -= f % d.itemHeight), f > e && (f = e), d.dom.box.animate({
                    scrollTop: f
                },
                g, d.settings.easing,
                function() {
                    parseInt(d.dom.box.scrollTop(), 10) >= e && d.dom.box.scrollTop(0)
                }));
                break;
            default:
                return
            }
            d.dom.box.queue(function() {
                d.lockState = !1,
                d.play(),
                a(this).dequeue()
            })
        },
        e.init())
    },
    a.cxScroll.defaults = {
        direction: "right",
        easing: "swing",
        step: 1,
        accel: 500,  //按钮点击后图片切换速度   （使用帮助请看，如需调整请对照注释来修改）
        speed: 500,  //图片自动切换的速度
        time: 2000,  //图片每轮等待时间
        auto: !0,
        hoverLock: !0,
        prevBtn: !0,
        nextBtn: !0
    },
    a.fn.cxScroll = function(b, c) {
        return this.each(function() {
            a.cxScroll(this, b, c)
        }),
        this
    }
});