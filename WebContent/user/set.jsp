<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>帐号设置</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="SunnyNews">
                <meta name="description" content="SunnyNews 向阳小队旗舰之作">
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/global.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
                <c:if test="${not empty info}">
                    <script>layer.msg('${info}')</script>
                    <c:remove var="info" />
                </c:if>
        </head>
        <body>

                <c:import url="/user/top.jsp" />
                <div class="layui-container fly-marginTop fly-user-main">
                        <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="user">
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${identity.userId}">
                                                <i class="layui-icon">&#xe609;</i>
                                                我的主页
                                        </a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/UserAction.do?method=index">
                                                <i class="layui-icon">&#xe612;</i>
                                                用户中心
                                        </a>
                                </li>
                                <li class="layui-nav-item layui-this">
                                        <a href="${pageContext.request.contextPath}/user/set.jsp">
                                                <i class="layui-icon">&#xe620;</i>
                                                基本设置
                                        </a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/EmailAction.do?method=getEmail">
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

                        <div class="fly-panel fly-panel-user" pad20>
                                <div class="layui-tab layui-tab-brief" lay-filter="user">
                                        <ul class="layui-tab-title" id="LAY_mine">
                                                <li class="layui-this"  lay-id="info">我的资料</li>
                                                <li lay-id="avatar">头像</li>
                                                <li lay-id="pass">密码</li>
                                        </ul>
                                        <div class="layui-tab-content" style="padding: 20px 0;">
                                                <div class="layui-form layui-form-pane layui-tab-item layui-show">
                                                        <form action="${pageContext.request.contextPath}/UserAction.do?method=update" method="post">		
                                                                <div class="layui-form-item">
                                                                        <label for="L_email" class="layui-form-label">邮箱</label>
                                                                        <div class="layui-input-inline">
                                                                                <input type="text" id="L_email" name="email" required lay-verify="email" autocomplete="off" value="${identity.email}" class="layui-input">
                                                                        </div>
                                                                        <!--<div class="layui-form-mid layui-word-aux">如果您在邮箱已激活的情况下，变更了邮箱，需<a href="activate.jsp" style="font-size: 12px; color: #4f99cf;">重新验证邮箱</a>。</div>-->
                                                                </div>
                                                                <div class="layui-form-item">
                                                                        <label for="L_username" class="layui-form-label">昵称</label>
                                                                        <div class="layui-input-inline">
                                                                                <input type="text" id="L_username" name="username" required lay-verify="required" autocomplete="off" value="${identity.name}" class="layui-input">
                                                                        </div>
                                                                        <div class="layui-inline">
                                                                                <div class="layui-input-inline">
                                                                                        <c:if test="${identity.sex == '男'}">
                                                                                            <input type="radio" name="sex" value="男" checked title="男">
                                                                                            <input type="radio" name="sex" value="女" title="女">
                                                                                        </c:if>
                                                                                        <c:if test="${identity.sex == '女'}">
                                                                                            <input type="radio" name="sex" value="男" title="男">
                                                                                            <input type="radio" name="sex" value="女" checked title="女">
                                                                                        </c:if>
                                                                                </div>
                                                                        </div>
                                                                </div>
                                                                <div class="layui-form-item layui-form-text">
                                                                        <label for="L_sign" class="layui-form-label">签名</label>
                                                                        <div class="layui-input-block">
                                                                                <textarea placeholder="随便写些什么刷下存在感" id="L_sign"  name="sign" autocomplete="off" class="layui-textarea" style="height: 80px;">${identity.signature}</textarea>
                                                                        </div>
                                                                </div>
                                                                <div class="layui-form-item">
                                                                        <button class="layui-btn" key="set-mine" lay-submit>确认修改</button>
                                                                </div>
                                                        </form>
                                                </div>

                                                <div class="layui-form layui-form-pane layui-tab-item">
                                                        <div class="layui-form-item">
                                                                <div class="avatar-add">
                                                                        <p>建议尺寸168*168，支持jpg、png、gif，最大不能超过1.5MB</p>
                                                                        <button type="button" class="layui-btn upload-img" id="test1">
                                                                                <i class="layui-icon">&#xe67c;</i>上传头像
                                                                        </button>
                                                                        <img src="${pageContext.request.contextPath}/${sessionScope.identity.image}" id="demo1">
                                                                        <span class="loading"></span>
                                                                </div>
                                                        </div>
                                                </div>

                                                <div class="layui-form layui-form-pane layui-tab-item">
                                                        <form action="${pageContext.request.contextPath}/UserAction.do?method=updatePassword" method="post">
                                                                <div class="layui-form-item">
                                                                        <label for="L_nowpass" class="layui-form-label">当前密码</label>
                                                                        <div class="layui-input-inline">
                                                                                <input type="password" id="L_nowpass" name="nowpass" required lay-verify="required" autocomplete="off" class="layui-input">
                                                                        </div>
                                                                </div>
                                                                <div class="layui-form-item">
                                                                        <label for="L_pass" class="layui-form-label">新密码</label>
                                                                        <div class="layui-input-inline">
                                                                                <input type="password" id="L_pass" name="pass" required lay-verify="required" autocomplete="off" class="layui-input">
                                                                        </div>
                                                                        <div class="layui-form-mid layui-word-aux">6到16个字符</div>
                                                                </div>
                                                                <div class="layui-form-item">
                                                                        <label for="L_repass" class="layui-form-label">确认密码</label>
                                                                        <div class="layui-input-inline">
                                                                                <input type="password" id="L_repass" name="repass" required lay-verify="required" autocomplete="off" class="layui-input">
                                                                        </div>
                                                                </div>
                                                                <div class="layui-form-item">
                                                                        <button class="layui-btn" key="set-mine" lay-submit>确认修改</button>
                                                                </div>
                                                        </form>
                                                </div>
                                        </div>
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
                        layui.use('upload', function () {
                            var upload = layui.upload;

                            //执行实例
                            var uploadInst = upload.render({
                                elem: '#test1' //绑定元素
                                , url: '${pageContext.request.contextPath}/UserAction.do?method=updateImg' //上传接口
                                , size: 1500 //最大允许上传的文件大小
                                , accept: 'image' //允许上传的文件类型
                                , before: function (obj) {
                                    //预读本地文件示例，不支持ie8
                                    obj.preview(function (index, file, result) {
                                        $('#demo1').attr('src', result); //图片链接（base64）
                                        $('#touxiang').attr('src', result); //图片链接（base64）
                                    });
                                }
                                , done: function (res) {
                                    layer.msg(res.msg)
                                    //上传完毕回调
                                }
                                , error: function () {
                                    layer.msg(res.msg)
                                    //请求异常回调
                                }
                            });
                        });
        </script>
</body>
</html>