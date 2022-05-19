package com.spring.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Custom")
public class CustomController {
	
	@Autowired
	CustomService customService;
	
	@GetMapping("/customList")
	public String customList(Model model, String busi_num) {
		Custom custom = customService.getBNList(busi_num);
		model.addAttribute("busi_num",busi_num);
		return "selectCustom";
	}
}
