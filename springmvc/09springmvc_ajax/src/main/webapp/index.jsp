<%--
  Created by IntelliJ IDEA.
  User: KangXW
  Date: 2020-07-23
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <script type="application/javascript" src="js/jquery.js"></script>
      <script type="application/javascript">
          $(function () {
              $("#txtName").blur(function () {
                $.post("ajax.do", {'name': $('#txtName').val()}, function (data) {
                    alert(data)
                })
              })
          })
      </script>
  </head>
  <body>
    用户名：<input type="text" id="txtName" />
  </body>
</html>
