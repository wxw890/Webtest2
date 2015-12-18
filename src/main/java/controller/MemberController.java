package controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.UserDto;
import service.UserDao;

@Controller
public class MemberController {
	//private ApplicationContext ctx = null;
	@RequestMapping("/memberSearch.action")
	public ModelAndView PageMove(HttpServletRequest req, String name, UserDto dto, UserDao dao) throws UnsupportedEncodingException{
		req.setCharacterEncoding("utf-8");
		//ctx = new FileSystemXmlApplicationContext();
		ModelAndView mav = new ModelAndView("WEB-INF/views/memberRsult.jsp");
		//UserDao dao = new UserDao();
		//UserDto dto = new UserDto();
		//String name1 = req.getParameter("name");
		System.out.println(name);
		//UserDao dao = ctx.getBean("UserDao", UserDao.class);
		//UserDto dto = ctx.getBean("UserDto", UserDto.class);
		//dto = dao.getItem(name);
	
		
		//mav.addObject("name", dao.getItem(name1).getName());
		
		mav.addObject("name", dao.getItem(name).getName());
		mav.addObject("age", dao.getItem(name).getAge());
		mav.addObject("point", dao.getItem(name).getPoint());
		
		return mav;
	}
}
