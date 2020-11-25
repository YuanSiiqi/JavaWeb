<%@ page import="utils.CookieUtils" %><%--
  Created by IntelliJ IDEA.
  User: Y
  Date: 2020/11/19
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div>
    <a href="/goods?name=car"><img src="img/car.jpg"> </a>
  </div>
  <div>
    <a href="/goods?name=grape"><img src="img/grape.jpg"> </a>
  </div>
  <div>
    <a href="/goods?name=sausage"><img src="img/sausage.jpg"> </a>
  </div>
  <div>
    <a href="/goods?name=toy"><img src="img/toy.jpg"> </a>
  </div>
  <div>
    <a href="/goods?name=wash"><img src="img/wash.jpg"> </a>
  </div>
  <div>
      <table>
<%
  Cookie[] cookies = request.getCookies();
  Cookie goods = CookieUtils.findCookie("goods", cookies);
  String goodsname = goods.getValue();
  String[] names = goodsname.split("&");
  for (String name : names) {
    %>
      <tr>
          <td>
              <%=name%>

          </td>
      </tr>

      <%
  }
%>
      </table>
  </div>
  </body>
</html>
