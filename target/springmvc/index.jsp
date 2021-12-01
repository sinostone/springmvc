<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <a href="adduser.jsp">注 册 用 户</a>
        <br/>
        <p>用户登录</p>
        <form action="login.do" method="post">
            <table>
                <tr>
                    <td>用户名</td>
                    <td><input type="text"/></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input type="password"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit"/><input type="reset"/></td>
                </tr>
            </table>
        </form>

    </body>
</html>
