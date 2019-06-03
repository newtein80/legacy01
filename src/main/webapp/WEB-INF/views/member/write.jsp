<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script> -->
    <%@ include file="../include/header.jsp" %>
</head>

<body>
    <%@ include file="../include/menu.jsp" %>
    <h2>회원등록</h2>
    <form name="form1" method="post" action="${path}/member/insert.do">
        <table border="1" style="width: 400px;">
            <tr>
                <td>아이디</td>
                <td><input name="userid"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input name="passwd" type="password"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input name="name"></td>
            </tr>
            <tr>
                <td>이메일</td>
                <td><input name="email"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="확인">
                </td>
            </tr>
        </table>
    </form>
</body>

</html>