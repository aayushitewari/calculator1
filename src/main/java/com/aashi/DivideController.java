package com.aashi;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aashi.service.AddService;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
@Controller
public class DivideController {
	@RequestMapping("/div")
	public ModelAndView div(HttpServletRequest request, HttpServletResponse response) {
		
			int i = Integer.parseInt(request.getParameter("t1")); //Taking values from user
			int j =  Integer.parseInt(request.getParameter("t2"));//Taking values from user
		
			
			AddService as = new AddService();
			int k=as.op(i,j,"/");
			
			ModelAndView mv = new ModelAndView(); //For sending values to display page,created an object
			//Whenever we pass the above values to display page,need to specify two things
			mv.setViewName("display.jsp"); //This is view
			mv.addObject("result",k); // 'result' is label and 'k' is data
			
		 return mv; // Since we are using model view object,need to return mv object
		}
	}
			






			

