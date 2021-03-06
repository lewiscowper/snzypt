<!doctype html>
<html>
<head>
<#include "/template/sn_head.ftl">
<link rel="stylesheet" type="text/css" href="/html/sn-static/static/css/jquery.treemenu.css">
<style type="text/css">
/*树结构样式设置开始*/
.tree {color:#46CFB0; padding-left:0px;}
.tree li,
.tree li > a,
.tree li > span {
    padding: 4px;
    border-radius: 4px;
}
.tree li a {
    color:#000;
    text-decoration: none;
    line-height: 20pt;
    border-radius: 4px;
}
.tree li a:hover {
    background-color: #0e82d9;
    color: #fff;
}
.active {
    background-color: #0e82d9;
    color:#fff;
}
.active a {
    color: #fff;
}
.tree li a.active:hover {
    background-color: #34BC9D;
}
.catalog_table td{
	border: solid #3B3B3B 1px;
}
#dataSourceTree{
	padding:8px;
	padding-right:0;
}
.treemenu{
	padding-left: 8px;
}
/*树结构样式设置结束*/
</style>
</head>

<body>
	<#include "/template/sn_header.ftl">
    <div class="wrapper">
    	<div class="container">
        	<div class="row mgt15">
            	<div class="col-md-3 col-lg-3">
                	<div class="tree-title">数据目录</div>
                    <div class="tree-con">
                    	<div class="panel-body" id="dataSourceTree" style="padding-top:0px;">
                        	
                         </div>
                    </div>
                </div>
                <div class="col-md-9 col-lg-9" style="padding-left:0px;">
                	<div class="interact-item">
                    	<div class="position-info">
                         
                        </div>
                        <div class="catalog-con mgt10">
                   
			<#list tables as table>
                        	<div class="panel-body">
                            	<h1>
                                	<p style="font-size:18px;"><#if (tables?size gt 1)>${type.gridName!} - </#if>${table.gridName!}</p>
                                    <div class="otherInfo pdb10" id="otherInfo">
                                        <!--<span style="font-size:14px; color:#000;">数据来源：<i id="sourceone">${table.origin}</i></span>-->
                                        <!--<span style="font-size:14px;">更新频次：<i id="read">5</i></span>-->
                                           <#if (table_index==0)>
                                             <a href='../export/${tableId}' style="color:red;font-size:16px">下载</a>
                                             </#if>
                                    </div>
                                </h1>
                                </div>
                                	<ul class="catalog-list">
					<#if (table_index==0)>
                                    	<li>
                                        	<span>数据来源：<span>
                                            <span id="one1">${table.origin!""}</span>
                                        </li>
					
                                       <li>
                                        	<span>数据总数：<span>
                                            <span id="one2"><span id="datacount">${type.dataCount!""}</span>条</span>
                                            
                                        </li>
                                        <!--<li>
                                        	<span>更新频次：<span>
                                            <span id="one4">每天一次</span>
                                        </li>-->
					<li>
                                        	<span>所属部门：<span>
                                            <span id="one5">${table.org!""}</span>
                                        </li>
					<!--<li>dmPlatform@163.com
                                        	<span>采集时间：<span>
                                            <span id="one6">${table.dataTime!}</span>
                                        </li>-->
					<li>
                                        	<span>访 问 量  ：<span>
                                            <span id="one6">${table.visitCount!}</span>
                                        </li>
                                       <li>
                                        <span>数 据 项  ：<span>
                                            <span id="one7"></span>
                                        </li>
					
					</#if>
					
                                        <li>
                                        	<span>数据说明：<span>
                                            <span id="one3">${table.info!}</span>
                                        </li>
                                        <li class="clearfix">
                                        	<span style="float:left;">数据实例：</span>
                                            <div id="one8" class="catalog_table">
						<@mongoDataListDirective tableId=table.id pageNum=1 pageSize=8>
						
				<#if (table_index==0)>
					<script>
					//$("#datacount").html(${grid.page.total!"0"});
						
				</script>
				</#if>
				
							
				<#list grid.formItem as item>
					
						<#if (item.type!='hidden')>
					<script>
							var s = $("#one7").html();
							s+='${item.label!}，';	
							$("#one7").html(s);
						</script>
						</#if>

				</#list>
				<#if (grid.fields?size &lt; 10)> <!--总列数小于10 直接一个表 -->
                                            	<table>					
							<thead>
                                                    	<tr>
							<#list grid.fields as field>
								<td >${field.title!}
								<#if field.format??>
									<script>
										var f${field.field} = function(data){${field.format}};<!--有需要格式化的列调用-->
									</script>
								</#if>
								</td>
								

							</#list>
							 </tr>
                                                    </thead>
							<tbody>
								<#list grid.page.list as item>
                                                    	<tr>
								<#list grid.fields as field>
								<td title='${item[field.field]?default("")}'>
								<#if field.format??>
									<script>
										var data = {${field.field}:${item[field.field]?default("")}};
										var s = f${field.field}(data);
										document.write(s);
											
									</script>
								<#else>
									<#if ((field.type)=="datepicker")>
									<#else>
										<script>
										var data ='${item[field.field]?default("")?trim}';
										if(data.length>20){
											data=data.substring(0,10)+"...";
											}
										document.write(data);
									</script>
										
									</#if>
								</#if>
								</td>
								</#list>
							</tr>
							 <#if !item_has_next>
								<tr>
								<#list grid.fields as field>
									<#if field_index==0>
										<td>...</td>
									<#else>
										<td></td>
									</#if>
								</#list>
								</tr>
							 </#if>
							</#list>
						</tbody>					
                                                </table>
				<#else><!--总列数大于10 拆成两个表 -->
					<#assign ind = grid.fields?size/2>
					<table>					
							<thead>
                                                    	<tr>
							<#list grid.fields as field>
								<#if (field_index lte ind)><!--前半个表-->
								<td  >${field.title!}</td>
								</#if>
							</#list>
							 </tr>
                                                    </thead>
							<tbody>
								<#list grid.page.list as item>
                                                    	<tr>
								<#list grid.fields as field>
									<#if (field_index lte ind)><!--前半个表-->
									<td title='${item[field.field]?default("")}'><#if field.format??>
									<script>
										var data = {${field.field}:${item[field.field]?default("")}};
										var s = f${field.field}(data);
										document.write(s);
											
									</script>
								<#else>
									<#if field.type=="datepicker">
										${item[field.field]?string("yyyy-MM-dd")}
									<#else>
									<script>
										var data ='${item[field.field]?default("")}';
										if(data.length>20){
											data=data.substring(0,10)+"...";
											}
										document.write(data);
									</script>
										
									</#if>
								</#if></td>
									</#if>
								</#list>
							</tr>
							<#if !item_has_next><!--最后一行加。。。-->
								<tr>
								<#list grid.fields as field>
									<#if field_index lte ind>
										<#if field_index==0>
											<td>...</td>
										<#else>
											<td></td>
										</#if>
									</#if>
								</#list>
								</tr>
							 </#if>
							</#list>
						</tbody>					
                                                </table>
						<table class="mgt15">	<!--后半个表-->				
							<thead>
                                                    	<tr>
							<#list grid.fields as field>
								<#if (field_index gt ind)><!--后半个表-->
								<td >${field.title!}</td>
								</#if>
							</#list>
							 </tr>
                                                    </thead>
							<tbody>
								<#list grid.page.list as item>
                                                    	<tr>
								<#list grid.fields as field>
									<#if (field_index gt ind)>
									<td title='${item[field.field]?default("")}'><#if field.format??>
									<script>
										var data = {${field.field}:${item[field.field]?default("")}};
										var s = f${field.field}(data);
										document.write(s);
											
									</script>
								<#else>
									<#if field.type=="datepicker">
										${item[field.field]?string("yyyy-MM-dd")}
									<#else>
										<script>
										var data ='${item[field.field]?default("")}';
										if(data.length>20){
											data=data.substring(0,10)+"...";
											}
										document.write(data);
									</script>
									</#if>
								</#if></td>
									</#if>
								</#list>
							</tr>
							<#if !item_has_next><!--最后一行-->
								<tr>
								<#list grid.fields as field>
									<#if (field_index gt ind)>
										<#if (field_index==(ind+1))>
											<td>...</td>
										<#else>
											<td></td>
										</#if>
									</#if>
								</#list>
								</tr>
							 </#if>
							</#list>
						</tbody>					
                                                </table>
					
				</#if>
						</@mongoDataListDirective>
                                            </div>
                                        </li>
                                    </ul>
                                
				</#list>
				</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
   <#include "/template/sn_footer.ftl">
    <script type="text/javascript" src="/html/sn-static/static/js/jquery.treemenu.js"></script>
   <script type="text/javascript">
   function dateTostr(utc)
{
	if(utc)
		{
     var date = new Date(utc);
     return date.getFullYear()+"-"+((date.getMonth()+1)>=10?date.getMonth()+1:"0"+(date.getMonth()+1))+"-"+(date.getDate()>=10?date.getDate():"0"+date.getDate())+" "+(date.getHours()>=10?date.getHours():"0"+date.getHours())+":"+(date.getMinutes()>=10?date.getMinutes():"0"+date.getMinutes())+":"+(date.getSeconds()>=10?date.getSeconds():"0"+date.getSeconds());
   }
};

					
   $(function(){
			mytree(zNodes);
            $(".tree").treemenu({delay:300}).openActive();
	    var current = "所属分类-";
	    current = getCurrent(current);
	    $('.position-info').html(current + " > ${type.gridName!}");
	    
        });
	<@tableListDirective type=1 >
		var zNodes = ${tablesStr!};
	</@tableListDirective>
	function  getCurrent(current){
		var c = $("#dataSourceTree").find('a[class="active"]');
		var name = c.html();
		//current = name + " - "+current;
		//console.log(current);
		return  getp(c.parent() , current);
	}
	function getp(li , current){
		var pid = li.data("pid");
		var parent = $("#dataSourceTree").find("li[data-id="+pid+"]");
				if(parent.length>0){
					current = getp(parent , current);
				}
				var s = li.children("a").html();
		return  current +" > "+ s;
	}
		function mytree(list){
			var $root = $('<ul class="tree"><ul>');
			for(var i=0;i<list.length;i++){
				$root.append(toli(list[i]));
			}
			$root.children().each(function(i,ele){
				var pid = $(ele).data("pid");
				var parent = $root.find("#tree_"+pid);
				if(parent.length>0){
					parent.append($("<p>").append($(this).clone()).html());
					$(ele).remove();
				}
				
			})
			$root.find("ul").each(function(i,ele){
				if($(ele).find("li").length==1){
					ele.remove();
				}
			});
			
			$("#dataSourceTree").append($root);
		}
		var currentTable = "${typeId!}";

		function toli(data){
			var active="";
			if(data.id==currentTable){
				active = "active";
			}
			var count = "";
			var title ="";
			if(!data.pId){
				count ="<m style='font-size:12px;'>("+data.dataCount+")</m>";
			}//else{
				title='共'+data.dataCount+'条数据';
			//}
			
			return $('<li data-pid="'+data.pId+'" data-id="'+data.id+'" title="'+title+'"><a class="'+active+'" href="/${application!}/portal/data/grid/'+data.id+'_1.htm">'+data.gridName+count+'</a><ul id="tree_'+data.id+'"><ul><li>');
		}
		function formatSTR(se){
		if(se){
			if(se.length>200){
				
			}	
		}
	}
											
	var s = $("#one7").html();
	s=s.substr(0,s.length-1);	
	$("#one7").html(s);
    </script>
</body>
</html>
