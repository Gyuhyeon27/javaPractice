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
	public String customList1(Model model, @Param("busi_num") String busiNum, @Param("custom") String custom) {
//		List<Custom> customAll = customService.getCustomList();
		Custom customBN = customService.getBNList(busiNum);
		Custom customOne = customService.getCustomOneList(custom);

		if (customBN != null && customOne == null) {
			model.addAttribute("custom", customBN);
		} else if (customBN == null && customOne != null) {
			model.addAttribute("custom", customOne);
//		}else if(customBN == null && customOne == null){
//			model.addAttribute("custom", customAll);
		}

		return "customList";
	}

	// 등록하기
	@GetMapping("/customInput")
	public String showInsertCustom() {
		return "customInput";
	}
	
	@PostMapping("/customInput")
	public String insertCustom(Model model, Custom custom, Account account) {

		Custom customInsert = customService.insertCustom(custom);
		Account accountInsert = customService.insertAccount(account);

		System.out.println(customInsert);
		System.out.println(accountInsert);
		
		model.addAttribute("custom", customInsert);
		model.addAttribute("account", accountInsert);

		return "customInput";
	}

	@GetMapping("/customUpdate")
	public String showUpdateCustom(Model model, @Param("busi_num") String busiNum, @Param("custom") String custom) {
		Custom customBN = customService.getBNList(busiNum);
		Custom customOne = customService.getCustomOneList(custom);
		
		if (customBN != null && customOne == null) {
			model.addAttribute("custom", customBN);
		} else if (customBN == null && customOne != null) {
			model.addAttribute("custom", customOne);
		}

		return "customUpdate";
	}
	
	@PostMapping("/customUpdate")
	public String updateCustom(Model model, Custom custom, Account account) {

		Custom customUpdate = customService.updateCustom(custom);
		Account accountUpdate = customService.insertAccount(account);

		System.out.println(customUpdate);
		model.addAttribute("custom", customUpdate);
		model.addAttribute("account", accountUpdate );

		return "customUpdate";
	}
}
