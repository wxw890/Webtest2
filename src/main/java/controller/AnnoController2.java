package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnnoController2 {
	@RequestMapping("/first.action")
	public String pageMove2(){
		return "WEB-INF/views/firstResult.jsp";
	}
	
}
