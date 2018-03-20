<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>注册</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="SunnyNews">
                <meta name="description" content="SunnyNews 向阳小队旗舰之作">
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/global.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layui/css/modules/layer/default/layer.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/comm/layer/theme/default/layer.css" />
                <script src="${pageContext.request.contextPath}/comm/layui/layui.js" charset="utf-8"></script>
                <script src="${pageContext.request.contextPath}/comm/jquery/jquery-2.1.4.js"></script>
                <script src="${pageContext.request.contextPath}/comm/layer/layer.js"></script>
                <c:if test="${not empty info}">
                    <script>layer.msg('${info}')</script>
                    <c:remove var="info" />
                </c:if>
                <script>
                    function reset() {
                        layui.form.render();
                    }
                    $(document).ready(function () {
                        $.get("${pageContext.request.contextPath}/WXAction.do?method=getCity").done(function (data) {
                            // alert(data);
                            data = JSON.parse(data);
                            $("#quiz11").html("<option value=''>请选择省</option>");
                            for (i = 0; i < data.length; i++) {
                                $("#quiz11").append("<option value='" + data[i].name + "'>" + data[i].name + "</option>\n");
                            }
                            reset();
                        });
                    });

                </script>
        </head>
        <body>
                <c:import url="/user/top.jsp" />

                <div class="layui-container fly-marginTop">
                        <div class="fly-panel fly-panel-user" pad20>
                                <div class="layui-tab layui-tab-brief" lay-filter="user">
                                        <ul class="layui-tab-title">
                                                <li><a href="login.jsp">登入</a></li>
                                                <li class="layui-this">注册</li>
                                        </ul>
                                        <div class="layui-form layui-tab-content" id="LAY_ucm" style="padding: 20px 0;">
                                                <div class="layui-tab-item layui-show">
                                                        <div class="layui-form layui-form-pane">
                                                                <form action="${pageContext.request.contextPath}/UserAction.do?method=insert"  method="post">
                                                                        <div class="layui-form-item">
                                                                                <label for="L_email" class="layui-form-label">邮箱</label>
                                                                                <div class="layui-input-inline">
                                                                                        <input type="text" id="L_email" name="email" required lay-verify="email" autocomplete="off" class="layui-input">
                                                                                </div>
                                                                                <div class="layui-form-mid layui-word-aux">将会成为您唯一的登入名</div>
                                                                        </div>
                                                                        <div class="layui-form-item">
                                                                                <label for="L_username" class="layui-form-label">昵称</label>
                                                                                <div class="layui-input-inline">
                                                                                        <input type="text" id="L_username" name="username" required lay-verify="required" autocomplete="off" class="layui-input">
                                                                                </div>
                                                                        </div>
                                                                        <div class="layui-form-item">
                                                                                <label for="L_pass" class="layui-form-label">密码</label>
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
                                                                                <label class="layui-form-label">联动选择框</label>
                                                                                <div class="layui-input-inline">
                                                                                        <select name="quiz1" id="quiz11" lay-filter="test">
                                                                                                <option value="">请选择省</option>
                                                                                        </select>
                                                                                </div>
                                                                                <div class="layui-input-inline">
                                                                                        <select name="quiz2" id="quiz22" lay-filter="test2">
                                                                                                <option value="">请选择市</option>
                                                                                        </select>
                                                                                </div>
                                                                                <div class="layui-input-inline">
                                                                                        <select name="quiz3" id="quiz33" lay-filter="test3">
                                                                                                <option value="">请选择县/区</option>
                                                                                        </select>
                                                                                </div>
                                                                                <div class="layui-form-mid layui-word-aux">此处只是演示联动排版，并未做联动交互</div>
                                                                        </div>
                                                                        <div class="layui-form-item">
                                                                                <label for="L_vercode" class="layui-form-label">人类验证</label>
                                                                                <div class="layui-input-inline">
                                                                                        <input type="text" id="L_vercode" name="vercode" required lay-verify="required" placeholder="请回答后面的问题" autocomplete="off" class="layui-input">
                                                                                </div>
                                                                                <div class="layui-form-mid">
                                                                                        <span style="color: #c00;"><img src="${pageContext.request.contextPath}/token.do"></span>
                                                                                </div>
                                                                        </div>
                                                                        <div class="layui-form-item">
                                                                                <button class="layui-btn"  lay-submit>立即注册</button>
                                                                        </div>
                                                                        <div class="layui-form-item fly-form-app">
                                                                                <span>或者直接使用社交账号快捷注册</span>
                                                                                <a href="" onclick="layer.msg('正在通过QQ登入', {icon: 16, shade: 0.1, time: 0})" class="iconfont icon-qq" title="QQ登入"></a>
                                                                                <a href="" onclick="layer.msg('正在通过微博登入', {icon: 16, shade: 0.1, time: 0})" class="iconfont icon-weibo" title="微博登入"></a>
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
                </script>
                <script>
                    function changeProvince(data2) {
                        $.get("${pageContext.request.contextPath}/WXAction.do?method=getCity&province=" + $("#quiz11").val()).done(function (data) {
                            // alert(data);
                            data = JSON.parse(data);
                            $("#quiz22").html("<option value=''>请选择市</option>");
                            for (i = 0; i < data.length; i++) {
                                $("#quiz22").append("<option value='" + data[i].name + "'>" + data[i].name + "</option>\n");
                            }
                            reset();
                        });
                    }

                    function changeCity(data2) {
                        $.get("${pageContext.request.contextPath}/WXAction.do?method=getCity&city=" + $("#quiz22").val()).done(function (data) {
                            // alert(data);
                            data = JSON.parse(data);
                            $("#quiz33").html("<option value=''>请选择区域</option>");
                            for (i = 0; i < data.length; i++) {
                                $("#quiz33").append("<option value='" + data[i].name + "'>" + data[i].name + "</option>\n");
                            }
                            reset();
                        });
                    }

                    layui.use(['form', 'layedit', 'laydate'], function () {
                        var form = layui.form
                                , layer = layui.layer
                                , layedit = layui.layedit
                                , laydate = layui.laydate;

                        //日期
                        laydate.render({
                            elem: '#date'
                        });
                        laydate.render({
                            elem: '#date1'
                        });

                        //创建一个编辑器
                        var editIndex = layedit.build('LAY_demo_editor');

                        //自定义验证规则
                        form.verify({
                            title: function (value) {
                                if (value.length < 5) {
                                    return '标题至少得5个字符啊';
                                }
                            }
                            , pass: [/(.+){6,12}$/, '密码必须6到12位']
                            , content: function (value) {
                                layedit.sync(editIndex);
                            }
                        });

                        form.on('select(test)', function (data) {
                            changeProvince(data);
                        });

                        form.on('select(test2)', function (data) {
                            changeCity(data);
                        });
                        //监听指定开关
                        form.on('switch(switchTest)', function (data) {
                            layer.msg('开关checked：' + (this.checked ? 'true' : 'false'), {
                                offset: '6px'
                            });
                            layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
                        });

                        //监听提交
                        form.on('submit(demo1)', function (data) {
                            layer.alert(JSON.stringify(data.field), {
                                title: '最终的提交信息'
                            })
                            return false;
                        });


                    });
                </script>
        </body>
</html>