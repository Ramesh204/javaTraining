package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.Monument;

@Controller
public class MonumentController {
	
	@Autowired
	ModelAndView mdlView;
	
	@Autowired
	Monument monument;
	
	
	@RequestMapping("/")
	public ModelAndView init() {
		mdlView.addObject("heading","Wonders Of The World");
		mdlView.setViewName("index");
		return mdlView;
	}
	
	
	@RequestMapping(value="/addWonder",method=RequestMethod.GET)
	public ModelAndView initAddBook() {
		mdlView.addObject("command",monument);
		mdlView.setViewName("AddWonder");
		
		return mdlView;
	}
	
	
	@RequestMapping(value="/addWonder",method=RequestMethod.POST)
	public String submit(@ModelAttribute("command") Monument monument, Model model)
	{
		model.addAttribute(monument);
		return "Success";
	}
	@ModelAttribute("continentList")
	public String[] getContinent() {
		
		return new String[] {"Asia","Africa","North America","South America","Antarctica","Europe","Australia"};
	}
	
	
	
}
