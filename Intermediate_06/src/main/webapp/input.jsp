<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
</head>
<body>
	<h1>氏名と年齢を入力してください</h1>
	<form action="InputServlet" method="post">
		氏名：<input type="text" name="name" value="">
		年齢：<input type="text" name="age" value="">
		<input type="submit" value="送信">
	</form>

</body>
</html>