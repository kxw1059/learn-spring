<%--
  Created by IntelliJ IDEA.
  User: KangXW
  Date: 2020-07-24
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <table width="80%" align="center">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>密码</td>
        </tr>
        <c:forEach items="${list}" var="bean">
            <tr>
                <td>${bean.id}</td>
                <td>${bean.username}</td>
                <td>${bean.password}</td>
            </tr>
        </c:forEach>
    </table>
  </body>
</html>
