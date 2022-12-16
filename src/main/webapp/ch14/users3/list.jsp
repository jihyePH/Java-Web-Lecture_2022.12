<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>사용자 목록</title>
    <style>
        td {text-align: center; padding: 3px;}
    </style>
</head>
<body style="margin: 40px;">
    <h1>사용자 목록  </h1>
 <c:if test="${not empty uid }">
<%-- if (sessionUid != null) { 	//로그인 된 상태 --%> 	
		    <button onclick="location.href='/jw/ch14/users3/logout'">로그아웃</button>
	  <%-- <%= session.getAttribute("uname") %>님 환영합니다.--%>
	   ${uname}님 환영합니다.
 </c:if>
 <c:if test="${empty uid }">
		<%--<%} else { %>--%>
	  <button onclick="location.href='/jw/ch14/users3/login'">로그인</button>
	    <%-- } --%>
</c:if>
   <hr>
    <table border="1">
        <tr>
            <th>UID</th><th>PWD</th><th>NAME</th>
            <th>EMAIL</th><th>등록일</th><th>액션</th>
        </tr>
        <c:forEach var="user" items="${userList}">
        <%-- for (User u: list) { --%>
       		 <tr>
                <td> ${user.uid}</td>
                <td>${user.pwd}</td>
                <td>${user.uname}</td>
                <td>${user.email}</td>
                <td>${user.regDate}</td>
                <td>
                <%--본인만이 수정 권한 있음 --%>
                <c:if test="${(empty uid) or (not (uid eq user.uid))}">
                <%-- if (sessionUid == null || ! sessionUid.equals(u.getUid())) { --%>
                   	<button disabled>수정</button>
                </c:if>
                <c:if test="${(not empty uid)and (uid eq user.uid)}">
                <%--} else { --%>
                    <button onclick="location.href='/jw/ch14/users3/update?uid=${user.uid}'">수정</button>
                <%-- } --%>
                </c:if>
                
                <%-- 관리자(admin)만이 삭제 권한 있음 --%>
                <c:if test="${(empty uid) or (not(uid eq 'admin'))}">
                <%-- if (sessionUid == null || ! sessionUid.equals("admin")) { --%>
                	 <button disabled>삭제</button>
                </c:if>
                <%-- } else { --%>
                <c:if test="${(not empty uid) and (uid eq 'admin')}">
                    <button onclick="location.href='/jw/ch14/users3/delete?uid=${user.uid}'" >삭제</button>
                <%-- } --%>
                </c:if>
                </td>
         	</tr>
        <%--  <% } %>--%>
     </c:forEach>
    </table>
    <br>
    <a href="/jw/ch14/users3/register">회원 가입</a>
</body>
</html>