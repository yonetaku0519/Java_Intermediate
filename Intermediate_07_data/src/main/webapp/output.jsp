<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>スコープに登録されている値</h3>
	
	<%
		String applicationScopeData = (String)application.getAttribute("data");
		String requestScopeData = (String)request.getAttribute("data");
		String sessionScopeData = (String)session.getAttribute("data");	
	%>
	
	<p>アプリケーションスコープの値：<%=applicationScopeData %></p>
	<p>リクエストスコープの値：<%=requestScopeData %></p>
	<p>セッションスコープの値：<%=sessionScopeData %></p>
	
	<a href="Input.jsp">戻る</a>

</body>
</html>