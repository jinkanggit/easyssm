<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
 
div#container{width:100%;height:100%}
div#header {background-color:#438eb9;}
div#menu {background-color:#F2F2F2;height:93%;width:5%;float:left;clear:both}
div#content {background-color:#FFFFFF;height:93%;width:92%;float:left;}
div#footer {background-color:#99bbbb;clear:both;text-align:center;height:33px;}
div#menu {background-color:#999999;height:93%;width:8%;}
	body,html {
			margin:0;
			height:99%;
			color: #000;
			font-size: 12px;
			font-family: "Helvetica Neue",Helvetica,STheiti,微软雅黑,宋体,Arial,Tahoma,sans-serif,serif;
		}
		
		 
		/*左侧菜单*/
		.sidebar-menu{
			border-right: 1px solid #c4c8cb;
		}
		/*一级菜单*/
		.menu-first{
			height:35px;
			line-height:35px;
			background-color: #e9e9e9;
			border-top: 1px solid #efefef;
			border-bottom: 1px solid #e1e1e1;
			padding: 0;
			font-size: 20px;
			font-weight: normal;
			text-align: center;
		}
		/*一级菜单鼠标划过状态*/
		.menu-first:hover{
			text-decoration: none;
			background-color: #d6d4d5;
			border-top: 1px solid #b7b7b7;
			border-bottom: 1px solid #acacac;
		}
		/*二级菜单*/
		.menu-second li a{
			background-color: #f6f6f6;
			height:31px;
			line-height:31px;
			border-top: 1px solid #efefef;
			border-bottom: 1px solid #efefef;
			font-size: 12px;
			text-align:center;
		}
		/*二级菜单鼠标划过样式*/
		.menu-second li a:hover {
			text-decoration: none;
			background-color: #66c3ec;
			border-top: 1px solid #83ceed;
			border-bottom: 1px solid #83ceed;
			border-right: 3px solid #f8881c;
			border-left: 3px solid #66c3ec;
		}
		/*二级菜单选中状态*/
		.menu-second-selected {
			background-color: #66c3ec;
			height:31px;
			line-height:31px;
			border-top: 1px solid #83ceed;
			border-bottom: 1px solid #83ceed;
			border-right: 3px solid #f8881c;
			border-left: 3px solid #66c3ec;
			text-align:center;
		}
		/*覆盖bootstrap的样式*/
		.nav-list,.nav-list li a{
			padding: 0px;
			margin: 0px;
		} 
 
</style>
    <link rel="stylesheet" href="http://www.huosen.net/demo/bootstrap-menu/css/bootstrap.min.css">
	 
	<link rel="stylesheet" href="http://www.huosen.net/demo/bootstrap-menu/css/font-awesome.min.css">
	
	<script src="http://www.huosen.net/demo/bootstrap-menu/js/jquery-1.8.2.min.js"></script>
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://www.huosen.net/demo/bootstrap-menu/js/bootstrap.min.js"></script>
	
	<style type="text/css">
		/*手动调节的样式*/
		.nav-list>li>a {
    		padding: 5px 20px 0px 0px;
		}
	</style>
	
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"></head>
<body>
<div id="container">
  <div id="header"> <img src="/easyssm/src/main/webapp/images/1.jpg" alt="1" /> </div>
  <div id="menu"> 
	    
		   <div class="row-fluid">
			<div class="offset span12">
			   <!--Sidebar content-->
			   <div class="sidebar-menu"> <a href="#userMeun" style="padding-top:13px;padding-left:0px" class="nav-header menu-first collapsed" data-toggle="collapse"><i class="icon-user-md icon-large"></i> 用户管理</a>
				<ul id="userMeun" class="nav nav-list collapse menu-second">
				   <li><a href="#"><i class="icon-user"></i> 增加用户</a></li>
				   <li><a href="#"><i class="icon-edit"></i> 修改用户</a></li>
				   <li><a href="#"><i class="icon-trash"></i> 删除用户</a></li>
				   <li><a href="#"><i class="icon-list"></i> 用户列表</a></li>
				 </ul>
				<a href="#articleMenu" style="padding-top:13px;padding-left:0px" class="nav-header menu-first collapsed" data-toggle="collapse"><i class="icon-book icon-large"></i> 文章管理</a>
				<ul id="articleMenu" class="nav nav-list collapse menu-second">
				   <li><a href="#"><i class="icon-pencil"></i> 添加文章</a></li>
				   <li><a href="#"><i class="icon-list-alt"></i> 文章列表</a></li>
				 </ul>
			  </div>
			 </div>
		  </div>
	 
  </div>
   <div id="content">
    <iframe style="width:100%;height:100%;" scrolling="no"  frameborder="0"  src="note.jsp"></iframe>
  </div>
  <div id="footer">Copyright W3School.com.cn</div>
</div>
 
</body>
</html>
