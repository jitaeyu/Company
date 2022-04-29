<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
    <jsp:include page="cdn.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="/company/index">XXX컴퍼니</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarColor01">
      
        <s:forEach items="${userinfo}" var="team">
		<s:choose>
			<s:when test="${team.team eq '개발'}">
		        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		          <li class="nav-item">
		            <a class="nav-link active" aria-current="page" href="#">개발팀 게시판</a>
		          </li>
		          <li class="nav-item">
		            <a class="nav-link active" aria-current="page" href="#">개발팀 휴가일정</a>
		          </li>
		        </ul>
        	</s:when>
        	<s:when test="${team.team eq '마케팅'}">
		        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		          <li class="nav-item">
		            <a class="nav-link active" aria-current="page" href="#">마케팅팀 게시판</a>
		          </li>
		          <li class="nav-item">
		            <a class="nav-link active" aria-current="page" href="#">마케팅팀 휴가일정</a>
		          </li>
		        </ul>
        	</s:when>
        	<s:when test="${team.team eq '인사'}">
		        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		          <li class="nav-item">
		            <a class="nav-link active" aria-current="page" href="#">인사팀 게시판</a>
		          </li>
		          <li class="nav-item">
		            <a class="nav-link active" aria-current="page" href="#">인사팀 휴가일정</a>
		          </li>
		        </ul>
        	</s:when>
        	<s:when test="${team.team eq '디자인'}">
		        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		          <li class="nav-item">
		            <a class="nav-link active" aria-current="page" href="#">디자인팀 게시판</a>
		          </li>
		          <li class="nav-item">
		            <a class="nav-link active" aria-current="page" href="#">디자인팀 휴가일정</a>
		          </li>
		        </ul>
        	</s:when>
        	<s:when test="${team.team eq '기타'}">
		        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		          <li class="nav-item">
		            <a class="nav-link active" aria-current="page" href="#">외주팀 게시판</a>
		          </li>
		           <li class="nav-item">
		            <a class="nav-link active" aria-current="page" href="#">외주팀 휴가일정</a>
		          </li>
		        </ul>
        	</s:when>
        </s:choose>
      </s:forEach>
        <span class="d-flex">
          
          <s:forEach items="${userinfo}" var="user">
         		 <span style="color: white;" class="me-2">
          				${user.name}&nbsp;<span>${user.jobgrade}님 환영합니다.</span>
          	         </span>
          
 
          <button class="btn btn-outline-light" onclick="location.href='myinfo?id=${user.id}'" >내정보 수정</button>
       		
       		<button class="btn btn-outline-light"  onclick="location.href='login'" >로그아웃</button>
        </s:forEach>
        </span>
      </div>
    </div>
  </nav>
</body>
</html>