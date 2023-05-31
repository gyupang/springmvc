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
      <h1 class="text-center">회원가입</h1>
      <div class="container">
      <form  action="registerOk.do" method="post">
          <ul class="register">
              <li>
                  <label for="userId">ID :</label>
                  <input type="text" id="userId" name="userId" required>
              </li>
              <li>
                  <label for="userPass">Password :</label>
                  <input type="password" id="userPass" name="userPass" required>
              </li>
              <li>
                  <label for="userName">Name :</label>
                  <input type="text" id="userName" name="userName" required>
              </li>
              <li>
                  <label for="userEmail">Email :</label>
                  <input type="email" id="userEmail" name="userEmail" required>
              </li>
              <li>
                  <label for="userMobile">Mobile :</label>
                  <input type="tel" id="userMobile" name="userMobile" required>
              </li>
              <li>
                  <input  class="btn" type="submit" value="Register">
              </li>
          </ul>
      </form>
   </div>
</body>
</html>