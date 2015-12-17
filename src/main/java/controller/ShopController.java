package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {
	
	@RequestMapping("/admin.action")//경로를/**/**/admin.action 하면 자동으로 **안에 어느경로가 들어오거나 없어도 된다는 뜻이다.
	public ModelAndView adminPageMove(){
		ModelAndView mav = new ModelAndView("/WEB-INF/views/adminResult.jsp");
		return mav;
	}
	
	@RequestMapping("/shop.action")//index.jsp에서 시작되서 shop.action요청이 되면 admin.jsp쪽으로 보내지므로 위에  /shop/admin/admin.action 경로로 하면 이미 그경로에 있으므로 실행이
	public String shopPageMove(){	//안된다. 그러므로 /admin.action으로 해줘야한다.
		return "/shop/admin/admin.jsp";
	}
}
