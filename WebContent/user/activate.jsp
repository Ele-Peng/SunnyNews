<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>激活邮箱</title>
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

                <c:import url="/user/top.jsp" />

                <div class="layui-container fly-marginTop fly-user-main">
                        <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="user">
                                <li class="layui-nav-item">
                                        <a href="home.jsp">
                                                <i class="layui-icon">&#xe609;</i>
                                                我的主页
                                        </a>
                                </li>
                                <li class="layui-nav-item layui-this">
                                        <a href="index.jsp">
                                                <i class="layui-icon">&#xe612;</i>
                                                用户中心
                                        </a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="set.jsp">
                                                <i class="layui-icon">&#xe620;</i>
                                                基本设置
                                        </a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="message.jsp">
                                                <i class="layui-icon">&#xe611;</i>
                                                我的消息
                                        </a>
                                </li>
                        </ul>

                        <div class="site-tree-mobile layui-hide">
                                <i class="layui-icon">&#xe602;</i>
                        </div>
                        <div class="site-mobile-shade"></div>

                        <div class="site-tree-mobile layui-hide">
                                <i class="layui-icon">&#xe602;</i>
                        </div>
                        <div class="site-mobile-shade"></div>

                        <div class="fly-panel fly-panel-user" pad20 >
                                <div class="layui-tab layui-tab-brief" lay-filter="user" >
                                        <ul class="layui-tab-title">
                                                <li class="layui-this">
                                                        激活邮箱
                                                </li>
                                        </ul>
                                        <div class="layui-tab-content" id="LAY_ucm" style="padding: 20px 0;">
                                                <ul class="layui-form">
                                                        <li class="layui-form-li">
                                                                <label for="activate">您的邮箱：</label>
                                                                <span class="layui-form-text">xx@xx.com
                                                                        <!-- <em style="color:#999;">（已成功激活）</em> -->
                                                                        <em style="color:#c00;">（尚未激活）</em>
                                                                </span>
                                                        </li>
                                                        <li class="layui-form-li" style="margin-top: 20px; line-height: 26px;">
                                                                <div>
                                                                        1. 如果您未收到邮件，或激活链接失效，您可以
                                                                        <a class="layui-form-a" style="color:#4f99cf;" id="LAY-activate" href="javascript:;" email="{{user.email}}">重新发送邮件</a>，或者
                                                                        <a class="layui-form-a" style="color:#4f99cf;" href="set.jsp">更换邮箱</a>；
                                                                </div>
                                                                <div>
                                                                        2. 如果您始终没有收到 SunnyNews 发送的邮件，请注意查看您邮箱中的垃圾邮件；
                                                                </div>
                                                                <div>
                                                                        3. 如果你实在无法激活邮件，您还可以联系：linglian@aliyun.com
                                                                </div>
                                                        </li>
                                                </ul>
                                        </div>
                                </div>
                        </div>

                </div>

                <div class="fly-footer">
                        <p><a href="https://github.com/xyxd0522" target="_blank">SunnyNews</a> 2018 &copy; <a href="https://github.com/xyxd0522" target="_blank">向阳出品</a></p>
                        <p>
                                <a href="https://github.com/xyxd0522" target="_blank">微信公众号</a>
                        </p>
                </div>

                <script src="${pageContext.request.contextPath}/comm/layui/layui.js"></script>
                <script>
layui.cache.page = '';
layui.cache.user = {
    username: '游客'
    , uid: -1
    , avatar: '${pageContext.request.contextPath}/img/logo.jpg'
    , experience: 83
    , sex: '男'
};
layui.config({
    version: "3.0.0"
    , base: '${pageContext.request.contextPath}/comm/mods/'
}).extend({
    fly: 'index'
}).use(['fly', 'face'], function () {
    var $ = layui.$
            , fly = layui.fly;
    //如果你是采用模版自带的编辑器，你需要开启以下语句来解析。

    $('.detail-body').each(function () {
        var othis = $(this), html = othis.html();
        othis.html(fly.content(html));
    });

});
                </script>
        </body>
</html>