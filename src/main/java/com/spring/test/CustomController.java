package com.spring.test;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Custom")
public class CustomController {

	@Autowired
	CustomService customService;

	@GetMapping("/customList")
	public String AllCustomList(Model model) {
		List<Custom> customList = customService.AllCustomList();
		
		model.addAttribute("custom", customList);
		
		return "customList";
	}
	
	/*
	 * @GetMapping("/customSearch") public String customSearch(Model
	 * model, @Param("busi_num") String busiNum, @Param("custom") String custom) {
	 * List<Custom> AllCustom = customService.customSearch(busiNum,custom);
	 * 
	 * model.addAttribute("custom", AllCustom);
	 * 
	 * return "customList"; }
	 */

	// 수정하기
	@GetMapping("/customUpdate")
	public String customUpdate(Model model, String busiNum, String custom) {
		Custom customBN = customService.getBNList(busiNum);

		model.addAttribute("custom", customBN);
		return "customUpdate";
	}

	@PostMapping("/customdbUpdate")
	public String updateCustom(Model model, Custom custom, Account account) {

		Custom customInsert = customService.insertCustom(custom);
		Account accountInsert = customService.insertAccount(account);

		System.out.println("controllerInsert1 : " + customInsert);
		System.out.println("controllerInsert2 : " + accountInsert);

		model.addAttribute("custom", customInsert);
		model.addAttribute("account", accountInsert);

		return "customList";
	}

	// 등록하기
	@GetMapping("/customInput")
	public String showInsertCustom() {
		System.out.println("controllerInsert!!!");
		return "customInput";
	}

	@PostMapping("/customInput")
	public String insertCustom(Model model, Custom custom, Account account) {

		Custom customInsert = customService.insertCustom(custom);
		Account accountInsert = customService.insertAccount(account);

		System.out.println("controllerInsert1 : " + customInsert);
		System.out.println("controllerInsert2 : " + accountInsert);

		model.addAttribute("custom", customInsert);
		model.addAttribute("account", accountInsert);

		return "customList";
	}
	
	@GetMapping("/customDelete")
	public String deleteCustom(Model model, String busiNum) {
		int deleteCustom = customService.deleteCustom(busiNum);
		
		model.addAttribute("deleteCustom",deleteCustom);
		
		return "customDelete";
	}

}
