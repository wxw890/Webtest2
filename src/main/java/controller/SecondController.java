package controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	@RequestMapping("/second.action")
	public ModelAndView pageMove3(HttpServletRequest req){//index.jsp에서 보낸 param 값들은 request로 받아와야하는데 여거서 annotation을 통해 이미 requset가 설정되있다.
		String param1 = req.getParameter("param1");//requset로 파라미터 값을 받아온다.
		String param2 = req.getParameter("param2");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("WEB-INF/views/secondResult.jsp");
		mav.addObject("param1", param1);
		mav.addObject("param2", param2);
		return mav;
		/*
		req.setAttribute("param1", param1);//secondResult.jsp에 값을 출력해야하므로
		req.setAttribute("param2", param2);//setAtrribute로 파라미터 값을 저장한다.
		System.out.println("결과:"+param1+" "+param2);
		return "WEB-INF/views/secondResult.jsp";*/
	}
	
	@RequestMapping(value="/second.action", method=RequestMethod.POST)//원래 RequestMapping에는 value라는 속성을 넣고 사용할수 있다, method속성은 RequestMethod.POST를 통해 위에 같은 second.action은 기본 GET방식이므로
	public ModelAndView secondRequestPost(HttpServletRequest req) throws UnsupportedEncodingException{		  //POST방식으로 호출이 될수 있도록 해주는 역할을 가지고 있다.
		//req.setCharacterEncoding("utf-8");//한글이 깨지므로 해줘야함, 예외처리도 해줘야함
		//ModelAndView를 사용해야만
		System.out.println("secondRequestPost 호출됨");
		String id = req.getParameter("id");
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("WEB-INF/views/secondResult.jsp");
		mav.addObject("id", id);
		return mav;
		/*
		req.setAttribute("id", id); //ModelAndView를 사용하면 이것을 사용할 필요가 없어진다
		System.out.println("결과:"+id);
		return "WEB-INF/views/secondResult.jsp";*/
	}
}
