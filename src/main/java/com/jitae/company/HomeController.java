package com.jitae.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@Autowired
	SqlSession sqlSession;
	Mapper dao;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login")
	public String login() {			
		return "login";
	}
	
	@RequestMapping(value = "/index")
	public String home() {			
		return "main";
	}
	
	@RequestMapping(value = "/signin")
	public String sign() {			
		return "signin";
	}
	
	@RequestMapping(value = "/newsign")
	public String newsing(HttpServletRequest request) {	
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		String team=request.getParameter("team");
		String joindate=request.getParameter("joindate");
		String jobgrade=request.getParameter("jobgrade");
		String phone=request.getParameter("phone");
		Mapper dao = sqlSession.getMapper(Mapper.class);
		dao.newsign(id,pw,name,team,joindate,jobgrade,phone);
		return "login";
	}
	@RequestMapping(value = "userlogin")
	public String userlogin(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		Mapper dao = sqlSession.getMapper(Mapper.class);
		ArrayList<UserDTO> userinfo = dao.login(id,pw);
		HttpSession hs = request.getSession(true); 
		if(userinfo.isEmpty()) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html; charset=UTF-8");
			out.println("<script>alert('로그인 실패. 다시 시도해주세요.');</script>");
			out.flush();
			return "login";
		}
		else {
			hs.setAttribute("userinfo", userinfo);
			return "main";
		}
	}
	
	
	@RequestMapping(value = "/myinfo")
	public String myinfo(HttpServletRequest request,Model model) {
		String id = request.getParameter("id");
		Mapper dao = sqlSession.getMapper(Mapper.class);
		ArrayList<UserDTO> myinfo = dao.myinfo(id);
		model.addAttribute("myinfo", myinfo);
		return "myinfo";

	}
	
	@RequestMapping(value = "/modifymyinfo")
	public String modifymyinfo(HttpServletRequest request) {	
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		String team=request.getParameter("team");
		String joindate=request.getParameter("joindate");
		String jobgrade=request.getParameter("jobgrade");
		String phone=request.getParameter("phone");
		Mapper dao = sqlSession.getMapper(Mapper.class);
		dao.modifymyinfo(pw,name,team,joindate,jobgrade,phone,id);
		
		return "redirect:userlogin?id="+id+"&pw="+pw;
	}
	
	
}
