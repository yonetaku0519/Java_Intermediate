<%@ page import="model.Human" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output</title>
</head>
<body>
	
	<p>現在のメンバー</p>
	<%
		ArrayList<Human> list = (ArrayList<Human>)request.getAttribute("list");
		for(int i = 0; i < list.size(); i++) {
			Human human = list.get(i);
	%>
		<p><%= (i + 1) %>人目</p>
		<p>名前：<%= human.getName() %></p>
		<p>年齢：<%= human.getAge() %></p>
	<%
		}
	%>
</body>
</html>