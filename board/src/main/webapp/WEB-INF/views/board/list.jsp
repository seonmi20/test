<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		 <thead>
			 <tr>
			  <th>��ȣ</th>
			  <th>����</th>
			  <th>�ۼ���</th>
			  <th>�ۼ���</th>
			  <th>��ȸ��</th>
			 </tr>
		 </thead>	 
		 <tbody>
		 	<c:forEach items="${list}" var="list">	
				<tr>
					<td>${list.bno}</td>
					<td>${list.title}</td>
					<td>${list.regDate}</td>
					<td>${list.writer}</td>
					<td>${list.viewCnt}</td>
				</tr>
			</c:forEach>
		 </tbody>	
	</table>

</body>
</html>