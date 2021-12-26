<%@page import="model.Human"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
</head>
<body>
	<%
		// セッションスコープの情報
		ArrayList<Human> humanList = (ArrayList<Human>)session.getAttribute("list");
		if (humanList != null) {
	%>
	<p>セッションスコープの値</p>
	<table>
		<tr>
			<th>No.</th><th>氏名</th><th>年齢</th>
		</tr>
		<%
			for (int i = 0; i < humanList.size(); i++) {
		%>
		<tr>
			<td><%=(i+1)%></td>
			<td><%=humanList.get(i).getName()%></td>
			<td><%=humanList.get(i).getAge()%></td>
		</tr>
		<%
			}
		}
		%>
	</table>
	<br/>
	<p>セッションに登録する情報を入力してください</p>
	<form action="InputServlet" method="post">
		名前：<input type="text" name="name"/><br/>
		年齢：<input type="text" name="age"/><br/>
		<input type="submit" value="送信">
	</form>
	<p>セッションのデータを破棄します</p>
	<form action="InputServlet">
		<input type="submit" value="破棄">
	</form>

</body>
</html>