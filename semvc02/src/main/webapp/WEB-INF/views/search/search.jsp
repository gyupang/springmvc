<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action=""  name="form" method="post">
<input type="search" name="search" placeholder="검색어를 입력하세요" />
</form>

<div id="contents" style="margin-top:40px; width: 800; border: 1px solid #ddd; padding: 30px">
Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illo deleniti mollitia! Dolorum asperiores minima non quos veritatis aliquam rerum eligendi at ab cum fuga in voluptatum laboriosam provident deserunt consequuntur.
</div>
<script src="//code.jquery.com/jquery.min.js"></script>
<script>
$(function() {
  let search = '${search}';
  if (search) {
    $("#contents:contains('" + search + "')").each(function() {
      let regex = new RegExp(search, 'gi');
      $(this).html($(this).text().replace(regex, "<span style='color:red;font-weight:bold;'>" + search + "</span>"));
    });
  }
});
</script>

</body>
</html>