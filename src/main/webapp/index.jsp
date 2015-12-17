<%@ page contentType="text/html; charset=utf-8" %>
<html>
<body>
<li><a href="first.action">첫번째 요청</a>
<li><a href="second.action?param1=food&param2=fruit">첫번째 요청중에서 팔미터 전달</a><!--컨트롤러에 파라미터 값을 보낸다. -->
<li>
	<form method="post" action="second.action">
		<input type="text" name="id"><!-- text는 name을 id로한다. -->
		<input type="submit" value="두번째 요청 중 포스트 방식"/>
	</form>
</li>
<li><a href="third.action">세번째 요청</a></li>
<li><a href="fourth.action?cart=list">네번째 요청1</a></li>
<li><a href="fourth.action?cart=delete"">네번째 요청2</a></li>
<li><a href="fourth.action?cart=create">네번째 요청3</a></li>
<li>
	<form action="fifth.action" method="POST">
		이름:<input tyep="text" name="name"/><br/><br/><!-- dto에 해당 이름과 같은 변수를 가지면 spring에서 자체적으로 값을 자동으로 저장해준다. -->
		나이:<input tyep="text" name="age"/><br/><br/>
		점수:<input tyep="text" name="point"/><br/><br/>
		<input type="checkbox" name="chk" value="test"/>test체그해줨<br/><br/>
		<input type="submit" value="다섯번째 요청"/>
	</form>
</li>
<li><a href="shop.action">쇼핑몰 관리자 페이지로 이동</a></li>
</body>
</html>
