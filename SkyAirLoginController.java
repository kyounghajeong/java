package com.spring.skyairmy.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.skyairmy.service.SkyAirService;
import com.spring.skyairmy.vo.SkyAirVO;

@Controller
@RequestMapping(value="/login")
public class SkyAirLoginController
{
	private static final String CONTEXT_PATH="login";
	private static final String CONTEXT_PATH_A="loginon";
	@Autowired
	private SkyAirService skyairservice;
	
	@RequestMapping("/login")
	public ModelAndView loginview(@ModelAttribute SkyAirVO param) 
	{
		System.out.println("/login");
		ModelAndView mav = null;
		mav = new ModelAndView();
		System.out.println("mav >>> : " + mav);		
		mav.setViewName(CONTEXT_PATH + "/login");		
		return mav;
	}
	@RequestMapping("/logincheck")
	public ModelAndView logincheck(@ModelAttribute SkyAirVO param) 
	{
		System.out.println("/logincheck");
		System.out.println(" param.getM_ID() >>> : " + param.getM_ID());		
		System.out.println(" param.getM_PW() >>> : " + param.getM_PW());		
		List<SkyAirVO> list = null;
		list = skyairservice.SkyAirlogincheck(param);
		ModelAndView mav = null;
		mav = new ModelAndView();				
		mav.addObject("loginckok", list);
		mav.setViewName(CONTEXT_PATH + "/loginok");			
		return mav;
	}	
	@RequestMapping("/loginon")
	public ModelAndView loginonview(@ModelAttribute SkyAirVO param) 
	{
		System.out.println("/loginon");
		System.out.println(" param.getuser_login_name() >>> : " + param.getuser_login_name());		
		System.out.println(" param.getuser_login_id() >>> : " + param.getuser_login_id());	
		System.out.println(" param.getuser_login_tel() >>> : " + param.getuser_login_tel());		
		System.out.println(" param.getuser_login_addr() >>> : " + param.getuser_login_addr());	
		ModelAndView mav = null;
		mav = new ModelAndView();
		System.out.println("mav >>> : " + mav);		
		mav.setViewName(CONTEXT_PATH_A + "/loginon");		
		return mav;
	}
	
	@RequestMapping("/idfind")
	public ModelAndView idfindview(@ModelAttribute SkyAirVO param) 
	{
		System.out.println("/idfind");			
		ModelAndView mav = null;
		mav = new ModelAndView();	
		System.out.println("mav >>> : " + mav);		
		mav.setViewName(CONTEXT_PATH + "/idfind");		
		return mav;
	}
	
	@RequestMapping("/idfindsand")
	public ModelAndView idfindsandview(@ModelAttribute SkyAirVO param) throws Exception
	{
		System.out.println("/idfindsand");
		System.out.println(" param.getM_NAME() >>> : " + param.getM_NAME());		
		System.out.println(" param.getM_TEL() >>> : " + param.getM_TEL());
		
		List<SkyAirVO> list = null;		
		list = skyairservice.SkyAiridfindsand(param);		
			
		System.out.println("list >>> : " + list);
		ModelAndView mav = null;
		mav = new ModelAndView();	
		System.out.println("mav >>> : " + mav);
		
		mav.addObject("idfindstr", list);
		mav.setViewName(CONTEXT_PATH + "/idfindsand");		
		return mav;
		
	}
}
