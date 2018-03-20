<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>新闻列表</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="SunnyNews">
                <meta name="description" content="SunnyNews 向阳小队旗舰之作">
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/global.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
        </head>
        <body>

                <script src="${pageContext.request.contextPath}/comm/layui/layui.js"></script>
                <script>

                    layui.use(['laypage', 'layer'], function () {
                        var laypage = layui.laypage
                                , layer = layui.layer;
                        laypage.render({
                            elem: 'pageDiv'
                            , count: ${newsSize}
                            , theme: '#1E9FFF'
                            , layout: ['count', 'prev', 'page', 'next', 'skip']
                            , limit: 10
                            , curr: ${newsPage}
                            , jump: function (obj) {
                                if (obj.curr != ${newsPage}) {
                                    location.href = "${pageContext.request.contextPath}/NewsAction.do?method=queryAll&page=" + obj.curr;
                                }
                            }
                        });
                    });
                    //注意：导航 依赖 element 模块，否则无法进行功能性操作
                    layui.use('element', function () {
                        var element = layui.element;

                        //…
                    });
                </script>

        </body>
</html>