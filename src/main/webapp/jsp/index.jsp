<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
 

 
</style>
	<link href="css/index.css" rel="stylesheet" type="text/css" />
	
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
  <div id="header"> <img src="images/1.jpg" alt="1" /> </div>
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
    <iframe style="width:100%;height:100%;" scrolling="no"  frameborder="0"  src="jsp/note.jsp"></iframe>
  </div>
  <div id="footer">Copyright 838812905@qq.com</div>
</div>
 
</body>
</html>
