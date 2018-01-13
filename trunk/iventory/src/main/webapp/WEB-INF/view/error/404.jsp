<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <div class="content-wrapper full-page-wrapper d-flex align-items-center text-center error-page">
          <div class="col-lg-6 offset-lg-3">
            <h1 class="display-1">404</h1>
            <h2>The page you are looking for was not found!</h2>
            <button class="btn btn-primary mt-5">Back to home</button>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>