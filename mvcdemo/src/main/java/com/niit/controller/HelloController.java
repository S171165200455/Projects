package com.niit.controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class HelloController {
@RequestMapping("/sayHello")
public ModelAndView sayHello()
{
	return new ModelAndView("welcome","message","wecome to springmvc");
}
@RequestMapping("/goodBye")
public ModelAndView goodBye()
{
	return new ModelAndView("welcome","message","thank you!goodbye");
}
}
