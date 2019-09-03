package com.midasgo.bookdocapi.controller.view;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TermsController
{     
    @RequestMapping(value = "/")
    public String redirect(Model model, HttpServletRequest request, HttpServletResponse response) 
    {	    	
		return "redirect:/test";
    }
    @RequestMapping(value = "/test")
    public ModelAndView test(Model model, HttpServletRequest request, HttpServletResponse response) 
    {	    	
    	ModelAndView mav = new ModelAndView();
		mav.setViewName("test");
		return mav;
    }
    //-----------------------------------------------------------------------------
    //
    @RequestMapping(value = "/privacy-policy")
    public ModelAndView terms(Model model, HttpServletRequest request, HttpServletResponse response) 
    {	    	
    	ModelAndView mav = new ModelAndView();
		mav.setViewName("terms");
		return mav;
    } 
}