<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Registration Successful</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<tr>
		<th>PostID</th>
		<th>Title</th>
		<th>Body</th>
	</tr>
	<tbody style="text-align:center;">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<c:forEach items="${post}" var="detail">

			<tr>
				<td>${detail.postId}</td>
				<td>${detail.title}</td>
				<td>${detail.body}</td>
			
			</tr>
		</c:forEach> 
	</tbody>
</table>
</body>
</html>
