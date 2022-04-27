<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="cdn.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section class="vh-100" style="background-color: #212529;">
	  <div class="container py-5 h-100">
	    <div class="row d-flex justify-content-center align-items-center h-100">
	      <div class="col col-xl-10">
	        <div class="card" style="border-radius: 1rem;">
	          <div class="row g-0">
	            <div class="col-md-6 col-lg-5 d-none d-md-block">
	              <img src="https://blog.kakaocdn.net/dn/UOZ0D/btqLJVL7riU/7n1jarJNvXhcwrSx9z0Dmk/img.jpg"
	                alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;"/>
	            </div>
	            <div class="col-md-6 col-lg-7 d-flex align-items-center">
	              <div class="card-body p-2 p-lg-2 text-black">
	
	                <form action="newsign" method="post">

	                  <div align="center"  class="h3 fw-bold mb-0">회원가입</div>
	                  
	
	                  <div class="form-outline mb-1">
	                  <label class="form-label" for="form2Example17">아이디</label>
	                    <input name="id" class="form-control form-control-md" />
	                    
	                  </div>
	
	                  <div class="form-outline mb-1">
	                  <label class="form-label" for="form2Example27">비밀번호</label>
	                    <input type="password" name="pw" class="form-control form-control-md" />
	                    
	                  </div>
	                  
	                  <div class="form-outline mb-1">
	                   <label class="form-label" for="form2Example27">이름</label>
	                    <input  name="name" class="form-control form-control-md" />
	                  </div>
	                  
	                  <div class="form-outline mb-1">
	                  <label class="form-label" for="form2Example27">부서</label>
	                    <select  name="team" class="form-control form-control-md" >
	                    	<option value="">부서선택</option>
						    <option value="개발">개발</option>
						    <option value="마케팅">마케팅</option>
						    <option value="인사">인사</option>
						    <option value="디자인">디자인</option>
						    <option value="기타">기타</option>
	                    </select>
	                    
	                  </div>
	                  
	                  <div class="form-outline mb-1">
	                   <label class="form-label" for="form2Example27">입사 년도</label>
	                    <input type="date" name="joindate" class="form-control form-control-md" />
	                   
	                  </div>
	                  
	                  <div class="form-outline mb-1">
	                  <label class="form-label" for="form2Example27">직급</label>
	                    <select  name="jobgrade" class="form-control form-control-md" >
	                    	<option value="">직급선택</option>
						    <option value="사원">사원</option>
						    <option value="대리">대리</option>
						    <option value="팀장">팀장</option>
						    <option value="이사">이사</option>
						    <option value="CEO">CEO</option>
						    <option value="외부인력">외부인력</option>
	                    </select>
	                    
	                  </div>
	                  <div class="d-grid gap-2 d-md-flex justify-content-md-end">
	                  <input class="btn btn-danger mt-3" type="button" onclick="location.href='login'" value="취소">
	                  <input class="btn btn-dark mt-3" type="submit" value="가입">
	                  </div>
	                </form>
	
	              </div>
	            </div>
	          </div>
	        </div>
	      </div>
	    </div>
	  </div>
	</section>
</body>
</html>