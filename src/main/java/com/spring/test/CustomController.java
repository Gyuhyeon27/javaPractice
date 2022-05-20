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

		return "selectCustom";
	}

	// 등록하기
	@GetMapping("/customList")
	public String showInsertCustom() {
		return "selectCustom";
	}
	
	@PostMapping("/customList")
	public String insertCustom(Model model, Custom custom) {

		Custom customInsert = customService.insertCustom(custom);

		model.addAttribute("custom", customInsert);

		return "selectCustom";
	}

}
