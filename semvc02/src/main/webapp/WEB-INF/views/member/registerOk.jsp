<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/mvc02/resources/style.css" />
</head>
<body>
      <h1 class="text-center">입력정보</h1>
      <div class="container">
          <ul class="register">
              <li>
                  <label for="userId">ID : </label>
                  ${register.userId }
              </li>
              <li>
                  <label for="userPass">Password : </label>
                  ${register.userPass }
              </li>
              <li>
                  <label for="userName">Name : </label>
                  ${register.userName }
              </li>
              <li>
                  <label for="userEmail">Email : </label>
                 ${register.userEmail }
              </li>
              <li>
                  <label for="userMobile">Mobile : </label>
                 ${register.userMobile }
              </li>

          </ul>

   </div>
</body>
</html>