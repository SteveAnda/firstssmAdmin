<%--
  Created by IntelliJ IDEA.
  User: wanganda
  Date: 18-3-20
  Time: 上午9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form action="login" method="post">
            <table align="center">
                <tr>
                    <td colspan="2" align="center"><h3>登录</h3></td>
                </tr>
                <tr>
                    <td>登录名:</td>
                    <td><input type="text" name="username" id="username"/></td>
                </tr>
                <tr>
                    <td>密码:</td>
                    <td><input type="password" id="password" name="password"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" name="submit" id="submit" value="登录"></td>
                </tr>
            </table>
    </form>
</body>
</html>
