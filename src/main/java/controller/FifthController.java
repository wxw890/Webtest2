package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.UserDto;

@Controller
public class FifthController {

//req을 이용해 getParamter을 이용하지 않고 다른 방법을 이용해보자
	
//첫번째 예제	
	/*
	@RequestMapping("/fifth.action")
	public ModelAndView pageMove(@RequestParam("name") String name1, @RequestParam int age, @RequestParam double point){
								//정식으로는 @RequestParam("name") String name 라고 써준다. 그리고 이것을 통해 원래 그동안 했던 req을 이용해 getParamter를
								//안해도 된다. 그리고 파라미터 id와 @RequestParam 이름을 같이 하면 @RequestParam String name으로 생략이 가능하다.
		ModelAndView mav = new ModelAndView("WEB-INF/views/fifthResult.jsp");//setViewName메서드 안사용하고 이렇게 사용해도 된다.
		//mav.setViewName("WEB-INF/views/fifthResult.jsp");
		String msg = "다섯번째요청에 대한 결과입니다.";
		mav.addObject("msg", msg);
		System.out.println(name1+","+age+","+point);
		return mav;
	}*/
	
	
	
//두번째 예제//default는 잠시 보류
	/*
	@RequestMapping("/fifth.action")
	public ModelAndView pageMove(@RequestParam(defaultValue="무명인", required=false) String name, @RequestParam(defaultValue="10", required=false) 
								int age, @RequestParam(defaultValue="3.14",required=false) double point){
								//정식으로는 @RequestParam("name") String name 라고 써준다. 그리고 이것을 통해 원래 그동안 했던 req을 이용해 getParamter를
								//안해도 된다. 그리고 파라미터 id와 @RequestParam 이름을 같이 하면 @RequestParam String name으로 생략이 가능하다.
		ModelAndView mav = new ModelAndView("WEB-INF/views/fifthResult.jsp");//setViewName메서드 안사용하고 이렇게 사용해도 된다.
		//mav.setViewName("WEB-INF/views/fifthResult.jsp");
		String msg = "다섯번째요청에 대한 결과입니다.";
		mav.addObject("msg", msg);
		System.out.println(name+","+age+","+point);
		return mav;
	}*/
	
//세번째 예제 (파라미터가 많아지면 쓰기 힘드니까 이럴때 Dto를 사용해야한다.)
	@RequestMapping("/fifth.action")
	public ModelAndView pageMove(UserDto dto, String chk, HttpServletRequest req){
								//즉 @RequestParam는 Paramter값을 가져올수 있고 @ModelAttributed은 dto값을 가져올 수 있다. 마지막으로 @HttpServletRequest는 Request값을 가져올 수 있다.
								//@ModelAttribute를 생락 가능하다. @RequestParam도 이름만 같게하면 생략가능 , HttpServletRequest를 통해 request 값도 가져올수 있다.
		ModelAndView mav = new ModelAndView("WEB-INF/views/fifthResult.jsp");//setViewName메서드 안사용하고 이렇게 사용해도 된다.
		//mav.setViewName("WEB-INF/views/fifthResult.jsp");
		String msg = "다섯번째요청에 대한 결과입니다.";
		mav.addObject("msg", msg);
		System.out.println(dto.getName()+","+dto.getAge()+","+dto.getPoint()+","+chk+","+ req.getMethod());
		return mav;
	}
}
