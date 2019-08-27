<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/27/2019
  Time: 8:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style type="text/css">
      .login {
        height: 180px;
        width: 320px;
        padding: 10px;
        margin: 0;
        border: 1px#CCCCCC solid;
      }
      .login.input {
        padding: 5px;
        margin: 5px;
      }
    </style>
  </head>
  <body>

  <form method="post" action="/login">
    <div class="login">
      <h2>Login</h2>
      <input type="text" name="usename" size="30" placeholder="usename" />
      <input type="password" name="password" size="30" placeholder="password" />
      <input type="submit" value="singin" />
    </div>
  </form>
  </body>
</html>
