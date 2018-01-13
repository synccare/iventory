<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" href="/styles/login-page.css" rel="stylesheet">
		<script src="/scripts/login.js"></script>
		<link rel="shortcut icon" href="/images/temp/favicon.png"/>
		<title>I-Ventory</title>
	</head>
<body>


<p class="card-text">Visitors</p>
	<div class="wrapper">
		<div class="container">
			<h1>Welcome</h1>

			<font color="red">
			<c:if test="${error != null}">
            	<span><spring:message code="login.error" /></span>
			</c:if>
			</font>
			<c:if test="${message != null}">
				<span><spring:message code="login.message" /></span>
			</c:if>
			
		<form method="POST" action="${contextPath}/login" class="form-signin">
	        <div class="form-group ${error != null ? 'has-error' : ''}">
	            
	            <input name="username" type="text" class="form-control" placeholder="Username" />
	            <input name="password" type="password" class="form-control" placeholder="Password"/>
	            
	            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	
	            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
				
				</br>
	            <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a></h4>
	        </div>
		</form>


<%-- 			<form method="post" action="/login" class="form"> --%>
<!-- 				<input type="text" placeholder="Username" name="username" /> <input -->
<!-- 					type="password" placeholder="Password" name="password" /> -->
<!-- 				<button type="submit" id="login-button">Login</button> -->
				
				<div>
				<footer class="footer">
                    <div class="container-fluid clearfix">
                      <span class="float-right">
                          <a href="#">Powered by Synclones</a> &copy; 2017
                      </span>
                    </div>
                </footer>
<!-- 				<p class="name">Are you not registered yet? Register <a href="/registration">here</a></p> -->
				</div>
			
<%-- 			</form> --%>
		</div>

		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>

</body>


</html>

