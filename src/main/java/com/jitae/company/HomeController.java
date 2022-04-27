package com.jitae.company;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

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
		Mapper dao = sqlSession.getMapper(Mapper.class);
		dao.newsign(id,pw,name,team,joindate,jobgrade);
		return "login";
	}
	
	
	
}
