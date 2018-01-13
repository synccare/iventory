<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

  <head>
      <!-- Required meta tags -->
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <title>I-Ventory</title>
      <link rel="stylesheet" href="${contextPath}/template/font-awesome/css/font-awesome.min.css" />
      <link rel="stylesheet" href="${contextPath}/template/perfect-scrollbar.min.css" />
      <link rel="stylesheet" href="${contextPath}/template/style.css"/>
      <link rel="shortcut icon" href="${contextPath}/images/temp/favicon.png"/>
  </head>

<body>
  <div class="container-scroller">
    <div class="container-fluid">
      <div class="row">
        <div class="content-wrapper full-page-wrapper d-flex align-items-center">
          <div class="card col-lg-4 offset-lg-4">
            <div class="card-block">
              <h3 class="card-title text-primary text-left mb-5 mt-4">Create your account</h3>
				<form:form method="POST" modelAttribute="userForm" class="form-signin">
					<spring:bind path="firstName">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<form:input type="text" path="firstName" class="form-control p_input"
									placeholder="First Name" autofocus="true"></form:input>
								<form:errors class="error-msg" path="firstName"></form:errors>
							</div>
						</div>
					</spring:bind>
					
					<spring:bind path="lastName">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<form:input type="text" path="lastName" class="form-control p_input"
									placeholder="Last Name" autofocus="true"></form:input>
								<form:errors class="error-msg" path="lastName"></form:errors>
							</div>
						</div>
					</spring:bind>
					
					<spring:bind path="email">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<form:input type="text" path="email" class="form-control p_input"
									placeholder="email" autofocus="true"></form:input>
								<form:errors class="error-msg" path="email"></form:errors>
							</div>
						</div>
					</spring:bind>
					
					<spring:bind path="phoneNumber">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<form:input type="text" path="phoneNumber" class="form-control p_input"
									placeholder="Phone Number" autofocus="true"></form:input>
								<form:errors class="error-msg" path="phoneNumber"></form:errors>
							</div>
						</div>
					</spring:bind>

					<spring:bind path="username">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<form:input type="text" path="username" class="form-control p_input"
									placeholder="Username" autofocus="true"></form:input>
								<form:errors class="error-msg" path="username"></form:errors>
							</div>
						</div>
					</spring:bind>

					<spring:bind path="password">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-lock"></i></span>
								<form:input type="password" path="password"
									class="form-control p_input" placeholder="Password"></form:input>
								<form:errors class="error-msg" path="password"></form:errors>
							</div>
						</div>
					</spring:bind>

					<spring:bind path="passwordConfirm">
						<div class="form-group ${status.error ? 'error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-lock"></i></span>
								<form:input type="password" path="passwordConfirm"
									class="form-control p_input" placeholder="Confirm your password"></form:input>
								<form:errors class="error-msg" path="passwordConfirm"></form:errors>
							</div>
						</div>
					</spring:bind>

					<spring:bind path="address.address">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<form:input type="text" path="address.address" class="form-control p_input"
									placeholder="Address" autofocus="true"></form:input>
								<form:errors class="error-msg" path="address.address"></form:errors>
							</div>
						</div>
					</spring:bind>

					<spring:bind path="address.city">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<form:input type="text" path="address.city" class="form-control p_input"
									placeholder="City" autofocus="true"></form:input>
								<form:errors class="error-msg" path="address.city"></form:errors>
							</div>
						</div>
					</spring:bind>

					<spring:bind path="address.province">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<form:input type="text" path="address.province" class="form-control p_input"
									placeholder="Province" autofocus="true"></form:input>
								<form:errors class="error-msg" path="address.province"></form:errors>
							</div>
						</div>
					</spring:bind>

					<spring:bind path="address.country">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<form:input type="text" path="address.country" class="form-control p_input"
									placeholder="Country" autofocus="true"></form:input>
								<form:errors class="error-msg" path="address.country"></form:errors>
							</div>
						</div>
					</spring:bind>

					<spring:bind path="address.postalCode">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<form:input type="text" path="address.postalCode" class="form-control p_input"
									placeholder="Postal Code" autofocus="true"></form:input>
								<form:errors class="error-msg" path="address.postalCode"></form:errors>
							</div>
						</div>
					</spring:bind>

					<spring:bind path="address.district">
						<div class="form-group ${status.error ? 'has-error' : ''}">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user"></i></span>
								<form:input type="text" path="address.district" class="form-control p_input"
									placeholder="District" autofocus="true"></form:input>
								<form:errors class="error-msg" path="address.district"></form:errors>
							</div>
						</div>
					</spring:bind>

					<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
				</form:form>
            </div>
			<p class="name">Already registered, Login <a href="/login">here</a></p>
          </div>
        </div>
      </div>
    </div>
  </div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="/template/bootstrap.min.js"></script>
</body>
</html>