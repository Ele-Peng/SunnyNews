<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>404 - Fly社区</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="fly,layui,前端社区">
                <meta name="description" content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
                <link rel = "stylesheet" type = "text/css" href = "${pageContext.request.contextPath}/comm/layui/css/layui.css"/>
                <link rel = "stylesheet" type = "text/css" href = "${pageContext.request.contextPath}/comm/layui/global.css"/>
        </head>
        <body>

                <c:import url="/user/top.jsp" />
                <div class="layui-container fly-marginTop">
                        <div class="fly-panel">
                                <div class="fly-none">
                                        <h2><i class="iconfont icon-404"></i></h2>
                                        <p>页面或者数据被<a href="http://fly.layui.com/u/336" target="_blank"> 纸飞机 </a>运到火星了，啥都看不到了…</p>
                                </div>
                        </div>
                </div>

                <div class="fly-footer">
                        <p><a href="https://github.com/xyxd0522" target="_blank">SunnyNews</a> 2018 &copy; <a href="https://github.com/xyxd0522" target="_blank">向阳出品</a></p>
                        <p>
                                <a href="https://github.com/xyxd0522" target="_blank">微信公众号</a>
                        </p>
                </div>



        </body>
</html>