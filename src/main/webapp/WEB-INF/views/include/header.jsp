<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Jsp Standard Tag Library (jstl) -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- var="변수명" valuse="값" -->
<c:set var="path" value="${pageContext.request.contextPath }" />
<script src="${path}/include/jquery-3.3.1.min.js"></script>