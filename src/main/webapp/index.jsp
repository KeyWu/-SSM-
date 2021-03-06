<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>登录页</title>
    <link rel="stylesheet" href="css/A.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

    <style>
        .bg {
            position: absolute;
            background: url("images/bgT(1).png");
            background-attachment: fixed;
            background-position: center;
            background-size: cover;
            width: 100%;
            height: 100%;
        }
        .login{
            padding: 20px;

            width:400px;
            height: 350px;
            /*background:green;*/
            position: absolute;
            left:50%;
            top:50%;
            margin-left:-200px;
            margin-top:-150px;
            border-radius:5px;
            background: white;
            background-color: rgba(0, 0, 0, 0.3);
            box-shadow: 0 15px 25px rgba(0, 0, 0, 0.3);
        }
        /*h1{*/
        /*    position: absolute;*/
        /*    left:50%;*/
        /*    top:50%;*/
        /*    margin-left:-230px;*/
        /*    margin-top:-230px;*/
        /*}*/
        .form-group{
            color: #fff;
            background-color: transparent !important;
            outline: none;
            border: none;
            border-bottom: 1px solid #fff;
        }
        .login .form-control{

            color: black;
            background-color: transparent !important;
            outline: none;
            border: none;
            border-bottom: 1px solid #fff;
        }
        .login .Mybutton{
            font-weight: bold;
            text-align: center;
            width: 100%;
            background-color: transparent !important;
        }
    </style>
</head>

<body>

<div class="bg"></div>
<!--登录框-->
<%--<div class="login">--%>

<%--    <form action="${pageContext.request.contextPath}/login" method="POST" name="actionForm">--%>
<%--        <h2 style="text-align: center;color: white;margin-bottom: 20px">桂电书籍管理系统</h2>--%>
<%--        <div class="form-group">--%>
<%--            <label>用户名</label>--%>
<%--            <input name="username" type="text" class="form-control" required="required">--%>
<%--              </div>--%>
<%--        <div class="form-group">--%>
<%--            <label>密码</label>--%>
<%--            <input name="password" type="password" class="form-control" required="required">--%>
<%--        </div>--%>
<%--          <p><button type="submit" class="btn btn-primary">登录</button></p>--%>

<%--    </form>--%>
<%--</div>--%>

<div class="login">
    <form action="${pageContext.request.contextPath}/login" method="POST" name="actionForm">
<%--        <fieldset>--%>
            <h2 style="text-align: center;color: white;margin-bottom: 20px">桂电书籍管理系统</h2>
            <label style="color: white;" for="UserName">用户名</label></br>
            <input id="UserName" type="text" class="form-control" name="userName" required="required"></br>
            <label style="color: white;" for="Password">密码</label></br>
            <input id="Password" type="text" class="form-control" name="password" required="required"></br>

            <input type="submit" class="btn btn-primary Mybutton" value="进入书籍系统">
    </form>
</div>

<%--<div class="form-group" style="width: 500px; position: absolute; left: 50%;margin-left: -250px;">--%>
<%--    <form action="${pageContext.request.contextPath}/login" method="POST" name="actionForm">--%>
<%--        <fieldset>--%>
<%--            <legend style="color: #03e9f4;margin-left:30%;font-size: 30px;">书籍管理系统</legend>--%>
<%--            <label for="UserName">用户名</label></br>--%>
<%--            <input id="UserName" type="text" class="form-control" name="userName" required="required"></br>--%>
<%--            <label for="Password">密码</label></br>--%>
<%--            <input id="Password" type="text" class="form-control" name="password" required="required"></br>--%>

<%--            <div class="start" style="margin-left:10%">--%>
<%--                <a href="javascript:document.actionForm.submit()" style="padding: 0px 0px;">--%>
<%--                <input class="ABtn" type="submit" value="进入书籍系统" style="padding: 10px 20px;font-size: 30px;">--%>
<%--                    <span></span>--%>
<%--                    <span></span>--%>
<%--                    <span></span>--%>
<%--                    <span></span>--%>
<%--                </a>--%>
<%--            </div>--%>
<%--        </fieldset>--%>
<%--    </form>--%>
<%--</div>--%>

<%--<div class="start">--%>
<%--  <a href="${pageContext.request.contextPath}/book/AllBook">--%>
<%--    进入书籍系统--%>
<%--    <span></span>--%>
<%--    <span></span>--%>
<%--    <span></span>--%>
<%--    <span></span>--%>
<%--  </a>--%>
<%--</div>--%>
</body>

</html>
