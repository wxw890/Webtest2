<%@ page language="java" contentType="text/html; charset=utf-8" isELIgnored="false"%><!--isELIgnored 설정을 켜줘야한다. 옛날에 EL나오기전에 옛날 버전에서도 $문법을 사용해서 충돌이 있을수가 있어서 꺼져있다.  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<h2>세번째 요청에 대한 결과 페이지 입니다.</h2>
요리 메뉴 : ${foodList}<br/>
과일 메뉴 <br/> 
<li>${f1}</li>
<li>${f2}</li>
<li>${f3}</li>
가능 요일<br/>
${day}, <br/>${day[0]}, ${day[1]}, ${day[2]} <br/>

<h2>jstl로 출력</h2>
<ul>
<c:forEach var="days" items="${day}">
	<li>${days}</li>
</c:forEach>
</ul>

</body>
</html>