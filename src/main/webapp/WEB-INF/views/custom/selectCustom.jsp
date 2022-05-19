<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form>
			<label>사업자번호</label>	<input type="text" name="busi_num" placeholder="사업자 번호를 입력하세요."><br>
			<label>거래처명</label>	<input type="text" name="custom" placeholder="거래처명을 입력하세요."><br>
			<input type="submit" value="조회">
		</form>
	</div>
	<div>
		<table>
			<tr>
				<th>사업자번호</th>
				<th>거래처명</th>
			</tr>
			<tr>
				<td>111-11-1111</td>
				<td>롯데마트</td>
			</tr>
		</table>
	</div>
</body>
</html>