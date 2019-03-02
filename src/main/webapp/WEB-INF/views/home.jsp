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
    <%@ include file="include/header.jsp" %>
</head>

<body>
    <%@ include file="include/menu.jsp" %>
    <h1>Hello world!~</h1>

    <P>The time on the server is ${serverTime}. </P>
    <p>web.xml : 웹 프로젝트의 환경설정</p>
    <p>서버 startup -> web.xml -> dispatcherServlet -> servlet-context.xml (컨트롤러 등록, url mapping)</p>
    <p>http://localhost/spring01/ 로 들어오면 "/"이므로 HomeController.java의 home() method가 실행되도록 되어 있음</p>
    <p></p>
    <p>root-context.xml : 서블릿 이외의 설정(DBCP)</p>
    <p>servlet-context.xml : 서블릿에 관련된 설정</p>
    <p></p>
    <p>tomcat에 내장된 서블릿</p>
    <p>DefaultServlet : 서블릿 클래스 매핑</p>
    <p>JspServlet : *.jsp 페이지 매핑</p>
    <p> * @Controller : 컨트롤러 bean</p>
    <p> * @Repository : DAO(데이터베이스 관련 작업) bean</p>
    <p> * @Service : 서비스(비지니스 관련 로직) bean</p>
    <p> * @Inject : 의존관계 주입 bean</p>
    <p>.jsp -> JspServlet 경유</p>
    <p>서블릿 -> DispatcherServlet 경유</p>
    <p></p>
    <p>forward : 주소 그대로, 화면 이동, 데이터 전달</p>
    <p>redirect : 주소 변경, 화면 이동, get방식의 소량의 데이터</p>
    <p></p>
    <p>Controller, DAO, Service 는 스프링에서 관리</p>
    <p>스프링에서 관리하는 bean</p>
    <p>single-ton(서버가 구동중 일 때는 한 개만 쓰는 것...??) 객체</p>
    <p>전체사용자가 공유할 수 있는 Instance</p>
    <p></p>
    <p>java code, mapper 변경 -> 자동으로 서버 재시작</p>
    <p>jsp 변경 -> 새로고침만으로도 됨</p>
    <p></p>
    <p>설정파일 변경 -> 재시작해야 함!</p>
    <p></p>
</body>

</html>