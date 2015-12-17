<%@ page language="java" contentType="text/html; charset=utf-8" isELIgnored="false"%><!--isELIgnored 설정을 켜줘야한다. 옛날에 EL나오기전에 옛날 버전에서도 $문법을 사용해서 충돌이 있을수가 있어서 꺼져있다.  -->
<!DOCTYPE html>
<html>
<head>
<h2>두번째 요청에 대한 결과 페이지 입니다.</h2>
첫번째 파라미터:${param1}<br/><!-- EL기능 활성화 시켜줘야한다. -->
두번째 파라미터:${param2}<br/><!-- EL로 setAttribute로 저장한 값을 출력한다. -->
입력받은 텍스트 값 : ${id}<br/>
</head>
<body>
</body>
</html>