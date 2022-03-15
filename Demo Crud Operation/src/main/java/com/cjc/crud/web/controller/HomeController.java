package com.cjc.crud.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.crud.web.model.Student;
import com.cjc.crud.web.service.HomeService;

@Controller
public class HomeController
{
	@Autowired
	HomeService hs;

	@RequestMapping("/")
	public String  prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/registration")
	public String preRegister()
	{
		return"registration";
	}
	
	@RequestMapping("/reg")
	public String registerData(@ModelAttribute Student s)
	{
		hs.saveData(s);
		
		
		return "login";
	}
	
}
