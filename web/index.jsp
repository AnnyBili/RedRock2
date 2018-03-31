<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/3/27
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>register.JSP Page</title>
    <style type="text/css">
      #body {
        background-color: #FFD2BD;
        text-align:center;
        alignment-baseline:  middle;
        text-align-last:  center;
      }
      #right{
        text-align:right;
      }
    </style>
  </head>
  <body id="body">
    <h1 id="body">欢迎注册，你将很快完成简单的注册!</h1>
    <form action="servletdemo" id="body" method="get">
      请输入用户名：<input type="text" name="user"><br><br>
      请输入密码：<input type="password" name="pass"><br><br>
      请输入姓名：<input type="text" name="name" > <br><br>
      请输入年龄：<input type="text" name="age" > <br><br>
      请输入学号：<input type="text" name="stuNum" > <br><br>

      </select><br><br>
    <input type="submit" value="注册">
    <input type="reset" value="重置">
  </form>

  </body>
</html>
