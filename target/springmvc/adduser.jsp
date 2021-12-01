<%--
  Created by IntelliJ IDEA.
  User: ZHANGLEI
  Date: 2021-08-11
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<div align="center">
    <p>用户注册</p>
    <form action="test.do" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>操作：</td>
                <td><input type="submit" value="注册"></td>
            </tr>
        </table>
    </form>

</div>
</body>
</html>
