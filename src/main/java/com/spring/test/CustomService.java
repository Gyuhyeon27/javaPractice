package com.spring.test;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomService {

	@Autowired
	CustomMapper customMapper;

	// 리스트 조회하기
	public List<CustomAcc> AllCustomList() {
		return customMapper.AllCustomList();
	}

	public List<CustomAcc> customSearch(@Param("busi_num") String busiNum, @Param("custom") String custom) {
		return customMapper.customSearch(busiNum, custom);
	}

	public CustomAcc getBNList(String busiNum) {
		System.out.println("serviceSelect1 : " + busiNum);
		// String strsql = "select * from custom cu join account a on cu.busi_num =
		// a.busi_num where cu.busi_num = #{busiNum}";
		// return customMapper.selectBNCustom(strsql);
		return customMapper.selectBNCustom(busiNum);
	}

	public CustomAcc getCustomOneList(String custom) {
		System.out.println("serviceSelect2 : " + custom);
		return customMapper.selectOneCustom(custom);
	}

	// 거래처 등록하기
	public Custom insertCustom(Custom custom) {
		custom.setRegiInfoDate(LocalDateTime.now());
		custom.setModiInfoDate(LocalDateTime.now());

		int row = customMapper.insertCustom(custom);

		System.out.println("serviceInsert : " + custom);
		return null;
	}

	// 거래처 계좌정보 등록하기
	public Account insertAccount(Account account) {
		int row = customMapper.insertAccount(account);

		if (row == 1) {
			return new Account(account.getBusiNum(), account.getFactory(), account.getTradeBank(),
					account.getAccountNum());
		} else {
			return null;
		}
	}

	// 국가정보 등록하기
	public Country insertCountry(Country country) {
		int row = customMapper.insertCountry(country);

		if (row == 1) {
			return new Country(0, country.getNameEng(), country.getNameKor());
		} else {
			return null;
		}
	}

	// 거래처 수정하기
	public Custom updateCustom(Custom custom) {
//	public Custom updateCustom(String busiNum, String custom) {
		System.out.println("serviceupdate!!!!!!!");
		int row = customMapper.updateCustom(custom);
//		int row = customMapper.updateCustom(busiNum, custom);

		System.out.println("customUpdate : " + custom);

		return null;
	}

	// 거래처 계좌정보 수정하기
	public Account updateAccount(Account account) {
		int row = customMapper.updateAccount(account);

		if (row == 1) {
			return new Account(account.getBusiNum(), account.getFactory(), account.getTradeBank(),
					account.getAccountNum());
		} else {
			return null;
		}
	}
//
//	// 국가정보 수정하기
//	public Country updateCountry(Country country) {
//		int row = customMapper.updateCountry(country);
//
//		if (row == 1) {
//			return new Country(0, country.getNameEng(), country.getNameKor());
//		} else {
//			return null;
//		}
//	}

	// 거래처 정보 삭제하기
	public int deleteCustom(String busiNum) {
		return customMapper.deleteCustom(busiNum);
	}
}
