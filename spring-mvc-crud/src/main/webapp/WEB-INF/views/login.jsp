<%@ page contentType="text/html;charset=utf-8"%>
<%
    request.setCharacterEncoding("utf-8");
%>
<html>
<body>
<br>
使用POJO对吸那个绑定请求参数
<br>
<form action="/login" method="POST">
    <input type="text" name="username" placeholder="输入用户名" >
    <input type="password" name="password" placeholder="输入密码" >
    <button type="submit">提交</button>
</form>
</body>
</html>
