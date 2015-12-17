package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//이번 예제는 요청이 여러게 있는데 이 요청들을 어떻게 구분해서 보낼것인지, SecondController에서는 GET방식과 POST방식을 구분해서 여러개의 요청을 구분해서 받을 수 있었는데
//이번에는 모두 GET방식으로 요청하는데 구분하는 방법에 관한 예제이다.
@Controller
public class FourthController {
	
	@RequestMapping(value="/fourth.action", params={"cart=list"})//요청, params 속성으로 이때 파라미터로 구분할해서 요청을 할 수 있다.
	public ModelAndView pageMove5(){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/views/fourthResult1.jsp");
		return mav;
	}
	@RequestMapping(value="/fourth.action", params={"cart=delete"})//요청
	public ModelAndView pageMove6(){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/views/fourthResult2.jsp");
		return mav;
	}
	@RequestMapping(value="/fourth.action", params={"cart=create"})//요청
	public ModelAndView pageMove7(){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/views/fourthResult3.jsp");
		return mav;
	}
}
