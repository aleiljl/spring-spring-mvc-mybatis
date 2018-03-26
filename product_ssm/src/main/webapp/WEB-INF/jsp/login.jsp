<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/3/7
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>A Lei System Login Page</title>
</head>
<script src="../js/jquery-3.3.1.min.js"></script>
<script src="../js/login_page.js"></script>
<body>
<div style="margin-left:auto;margin-top:auto;">
    <div>
        <b>Login Name</b>
        <input type="text" id="login_name" align="right"/>
    </div>
    <div>
        <b>PassWord</b>
        <input type="text" id="password" align="right"/>
    </div>
    <div>
        <input type="button"id="login_button"value="login" />
        <p id = 'failure' style="display: none; color: red; font-size: 18px">login is failure</p>
    </div>
</div>
</body>

</html>
