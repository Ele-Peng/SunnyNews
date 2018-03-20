<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>故障公告页</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="apple-mobile-web-app-status-bar-style" content="black"> 
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="format-detection" content="telephone=no">
  <link rel="stylesheet" type="text/css" href="../comm/layui/css/layui.css" />
  <link rel="stylesheet" type="text/css" href="../comm/layui/global.css" />
  <link rel="stylesheet" type="text/css" href="../comm/layui/css/modules/layer/default/layer.css" />
  <script src="../comm/layui/layui.js" charset="utf-8"></script>
  <script src="../comm/layer/layer.js"></script>
  <script src="../comm/jquery/jquery-2.1.4.js"></script>
  <style>
  .notice{width: 600px; margin: 30px auto; padding: 30px 15px; border-top: 5px solid #009688; line-height: 30px;  text-align: center; font-size: 16px; font-weight: 300; background-color: #f2f2f2;}
  
  @media screen and (max-width: 750px) {
    html body{margin-top: 0;}
    .notice{width: auto; margin: 20px 15px; padding: 30px 0;}
  }
  </style>
</head>

<body>

<div class="fly-none" style="min-height: 0; padding: 0;">
  <i class="iconfont icon-tishilian"></i>
</div>

<div class="notice layui-text">
	非常抱歉，社区正在维护，稍后恢复 <br> <a href="../index.jsp" target="_blank">SunnyNews首页</a> <span style="padding:0 5px;"></span> <a href="../case.jsp" target="_blank">SunnyNews 2017最精彩新闻</a> <span style="padding:0 5px;"></span>
</div>

</body>
</html>