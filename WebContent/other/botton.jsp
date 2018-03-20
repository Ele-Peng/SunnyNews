<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>新闻详情</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="SunnyNews">
                <meta name="description" content="SunnyNews 向阳小队旗舰之作">
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/global.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
                <script>
                    function search22() {
                        layer.prompt({
                            maxlength: 25,
                            value: '',
                            title: '请输入关键字',
                        }, function (val, index) {
                            location.href = '${pageContext.request.contextPath}/NewsAction.do?method=queryAll&likeStr=title&likeWord=' + val;
                            ayer.close(index);
                        });
                    }
                </script>
        </head>
        <body>
                <div class="fly-panel fly-column">
                        <div class="layui-container">
                                <ul class="layui-clear" >
                                        <li class="layui-hide-xs layui-this" ><a href="/" >首页</a>
                                        </li>  
                                        <c:if test="${not empty identity}">
                                            <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block">
                                                    <span class="fly-mid"></span>
                                            </li> 
                                            <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block">
                                                    <a href="${pageContext.request.contextPath}/UserAction.do?method=index">我发表的贴</a>
                                            </li> 
                                            <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block">
                                                    <a href="${pageContext.request.contextPath}/UserAction.do?method=index">我收藏的贴</a>
                                            </li>
                                        </c:if>
                                </ul> 
                                <div class="fly-column-right layui-hide-xs"> 
                                        <span onclick='search22()'><i class="layui-icon" style='font-size: 18px;'>  </i></span> 
                                        <a href="${pageContext.request.contextPath}/NewsAction.do?method=readyPost" class="layui-btn">发表新闻</a> 
                                </div> 
                                <div class="layui-hide-sm layui-show-xs-block" style="margin-top: -10px; padding-bottom: 10px; text-align: center;"> 
                                        <a href="${pageContext.request.contextPath}/NewsAction.do?method=readyPost" class="layui-btn">发表新闻</a> 
                                </div> 
                        </div>
                </div>
        </body>
</html>