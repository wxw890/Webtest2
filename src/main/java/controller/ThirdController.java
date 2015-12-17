package controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThirdController {

	@RequestMapping("/third.action")
	public ModelAndView pageMove4(){
		ModelAndView mav = new ModelAndView();
		
		ArrayList<String> data1 = new ArrayList<String>();
		data1.add("삼계탕");
		data1.add("육계탕");
		data1.add("순계탕");
		data1.add("추어탕");
		mav.setViewName("/WEB-INF/views/thirdResult.jsp");
		mav.addObject("foodList", data1);//일반적인 배열이나 컬렉션을 전달할때 addObject 메서드를 사용한다.
		
		Map<String, String> data2 = new HashMap<String, String>();//List로 반복문으로 뿌릴수 없다. 즉, 하나씩보내는게 좋다.
		data2.put("f1", "사과");
		data2.put("f2", "귤");
		data2.put("f3", "호박");
		mav.addAllObjects(data2);//Map을 전달할때 addAllObjects 메서드를 사용한다.
		
		ArrayList day = new ArrayList();
		day.add("월요일");
		day.add("화요일");
		day.add("수요일");
		
		Map data3 = new  HashMap<String, ArrayList>();
		data3.put("day", day);
		mav.addAllObjects(data3);
		
		return mav;
	}
}
