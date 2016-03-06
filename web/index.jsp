<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="path" value="${requestScope.ContextPath}"/>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="">
    <script type="text/javascript" src="js/jquery.js"></script>
</head>
<body>
<form action="index.jsp" id="f1" method="post">
    用户名：<input type="text" name="username"/>
    密码 ：<input type="password" name="password">
    <input type="button" value="提交"/>
</form>
</body>
<script>
    $(function () {
        $("input[type='button']").click(function () {
            var a = $("input[type='text']").val();
            var b = $("input[type='password']").val();
            $.post("/login.action", {username: a, password: b}, function (data, textStatus) {
                if (data == "error") {
                    alert("用户名或密码错误！");
                } else {
                    $("#f1").submit();
                }
            });
        });
    })
</script>
</html>