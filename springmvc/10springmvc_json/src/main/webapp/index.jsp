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
              $("#btn").click(function () {
                $.post("json.do", function (data) {
                    var html = ''
                    for (var i=0; i < data.length; i++) {
                        html += "<tr><td>" + data[i].id +"</td><td>" + data[i].name +"</td><td>" + data[i].gender +"</td></tr>"
                    }

                    $('#content').html(html)
                })
              })
          })
      </script>
  </head>
  <body>
    <input id="btn" value="获取数据" type="button"/>
  <table width="80%" align="center">
      <tr>
          <td>编号</td>
          <td>姓名</td>
          <td>性别</td>
      </tr>
      <tbody id="content">

      </tbody>
  </table>
  </body>
</html>
