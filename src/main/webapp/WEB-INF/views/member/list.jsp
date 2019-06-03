<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge; charset=UTF-8">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script> -->
    <%@ include file="../include/header.jsp" %>
</head>

<body>
    <%@ include file="../include/menu.jsp" %>
    <h2>회원목록</h2>
    <input type="button" value="회원등록" onclick="location.href='${path}/member/write.do'">
    <table border="1" style="width:700px">
        <tr>
            <th>ID</th>
            <th>이름</th>
            <th>E-mail</th>
            <th>ID</th>
        </tr>
        <c:forEach var="row" items="${list}">
            <tr>
                <td>${row.userid }</td>
                <td><a href="${path}/member/view.do?userid=${row.userid}">${row.name}</a></td>
                <td>${row.email }</td>
                <td>
                    <fmt:formatDate value="${row.join_date }" pattern="yyyy-MM-dd HH:mm:ss" />
                </td>
            </tr>
        </c:forEach>
    </table>
</body>

</html>