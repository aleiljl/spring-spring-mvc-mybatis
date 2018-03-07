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
<script>
    $(document).ready(function(){
        var login_name;
        var password;
        $("#login_button").click(function(){
            login_name = $('#login_name').val();
            password = $('#password').val();
            console.log(login_name+"----"+password)
            $.ajax({
                url:'loginAction.do',
                data: {'loginName':login_name,'password':password},
                success:function (result) {
                    if (result.success){
                        $('#success').show().fadeOut(3000);
                        window.location.href='http://localhost:8080/index/index.do';
                    }else{
                        $('#failure').show().fadeOut(3000);
                    }
                }
            })
        });
    });
</script>
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
        <p id="login_button" >login</p>
    </div>
</div>
<p id = 'success' style="display: none">login is failure</p>
<p id = 'failure' style="display: none">login is success</p>
</body>

</html>
