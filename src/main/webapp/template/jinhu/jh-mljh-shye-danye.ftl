<!DOCTYPE html>
    <html>
    <head lang="en">
        <#include "/template/jh-meta.ftl">
        <title>${site.displayName}</title>
        <link href="/html/jinhu-static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="/html/jinhu-static/css/style.ts.css" rel="stylesheet">
        <!--[if lt IE 9]>
        <script src="/html/jinhu-static/js/html5shiv.min.js"></script>
        <script src="/html/jinhu-static/js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
    <#include "/template/jh-head.ftl">
        <#include "/template/jh-daohang.ftl">
        <div class="container bg-white">
            <#include "/template/jh-current.ftl">
        <div class="jh-main">
            <div class="row">
                <div class="col-md-4">
                    <div class="panel panel-default panel1">
    		 <@channelDirective channelId=channel.pid>
                        <div class="panel-heading panel1-t"><a href="${channel.url!}" class="panel1-ton fontSize18">${channel.displayName!}</a></div>
                        <ul class="fontSize16 zmhd-wsdc-list">
                      
                                 <@channelListDirective channelId=channel.id order=1 >
                                  <#list channels as channel>
                                              <li class="${(channel.id==own)?string('active','')}">
                                     <a href="${channel.url}"><span class="glyphicon glyphicon-play-circle"></span>${channel.displayName}</a> </li>
                                            </#list> 
                                 </@channelListDirective> 
                            </ul>   
                       </@channelDirective>  
                </div>
              </div>
                <div class="col-md-8">
			<@contentListDirective channelId =own pageSize=1 pageNum=1>
			<@channelDirective channelId=own>
                      <div class="fontSize18 new-list2-t">${channel.displayName!}</div>
		      </@channelDirective>
			<#list contents as cmsContent>
                      <#if cmsContent.titleImageUrl?length gt 0>
                             <div class="thumbnail jh-article-thumbnail">
                          <img src="${cmsContent.titleImageUrl!}">
                      </div>
                      </#if>
                        <div class="jh-article-p">
                            <p>${cmsContent.contentText!}</p>
                        </div>
			</#list>
                     </@contentListDirective>
                </div>
            </div>
        </div>
        </div>
        <#include "/template/jh-footer.ftl">
    <script type="text/javascript" src="/html/jinhu-static/js/jquery-1.12.1.min.js"></script>
    <script type="text/javascript" src="/html/jinhu-static/js/jquery.placeholder.min.js"></script>
    <script type="text/javascript" src="/html/jinhu-static/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/html/jinhu-static/js/js.js"></script>
    <script type="text/javascript">
        $(function () {
            $('input, textarea').placeholder();
        });
    </script>
    </body>
    </html>
    
   
  
 