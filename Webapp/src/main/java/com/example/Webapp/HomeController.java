package com.example.Webapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	//public String home(HttpServletRequest request,HttpServletResponse response)
	//{
	//	HttpSession session=request.getSession();
	//	String productName=request.getParameter("productName");
		
	//	System.out.println("hi"+productName);
	//	session.setAttribute("productName", productName);
	//	return "page1";
	public ModelAndView home(Product product) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("product",product);
		mv.setViewName("page1");
		return mv;
	}

}
