package com.spring.test;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomService {

	@Autowired
	CustomMapper customMapper;

	// 리스트 조회하기
	public Custom getBNList(String busi_num) {
		return customMapper.selectBNCustom(busi_num);
	}
	
	public Custom getCustomOneList(String custom) {
		return customMapper.selectOneCustom(custom);
	}
	
	// 거래처 등록하기
	public Custom insertCustom(Custom custom) {
		custom.setRegi_info_date(LocalDateTime.now());;
		custom.setModi_info_date(LocalDateTime.now());
		int row = customMapper.insertCustom(custom);
		
		if (row == 1) {
			return new Custom(custom.getBusi_num(), custom.getCustom(), custom.getsHort(), custom.getCeo(), custom.getCharge_person(), custom.getBusi_condition(), 
					custom.getItem(), custom.getPost_num(), custom.getAddr1(), custom.getAddr2(), custom.getTel(), custom.getFax(), custom.getHomepage(), custom.getCo_yn(), 
					custom.getForeign_yn(), custom.getTax_yn(), custom.getCountry_eng(), custom.getCountry_kor(), custom.getSpecial_relation(), custom.getTrade_stop(), 
					custom.getContract_period_s(), custom.getContract_period_e(), custom.getRegi_info_man(), custom.getRegi_info_date(), custom.getModi_info_man(), 
					custom.getModi_info_date());
		}else {
			return null;
		}
	}
	
	// 거래처 계좌정보 등록하기
	public Account insertAccount(Account account) {
		int row = customMapper.insertAccount(account);
		
		if (row == 1) {
			return new Account(account.getBusi_num(), account.getFactory(), account.getTrade_bank(), account.getAccount_num());
		}else {
			return null;
		}
	}
	
	// 국가정보 등록하기
	public Country insertCountry(Country country) {
		int row = customMapper.insertCountry(country);
		
		if(row == 1) {
			return new Country(0, country.getName_eng(), country.getName_kor());
		}else {
			return null;
		}
	}
	
	// 거래처 수정하기
	public Custom updateCustom(Custom custom) {
		custom.setRegi_info_date(LocalDateTime.now());;
		custom.setModi_info_date(LocalDateTime.now());
		int row = customMapper.updateCustom(custom);
		
		if (row == 1) {
			return new Custom(custom.getBusi_num(), custom.getCustom(), custom.getsHort(), custom.getCeo(), custom.getCharge_person(), custom.getBusi_condition(), 
					custom.getItem(), custom.getPost_num(), custom.getAddr1(), custom.getAddr2(), custom.getTel(), custom.getFax(), custom.getHomepage(), custom.getCo_yn(), 
					custom.getForeign_yn(), custom.getTax_yn(), custom.getCountry_eng(), custom.getCountry_kor(), custom.getSpecial_relation(), custom.getTrade_stop(), 
					custom.getContract_period_s(), custom.getContract_period_e(), custom.getRegi_info_man(), custom.getRegi_info_date(), custom.getModi_info_man(), 
					custom.getModi_info_date());
		}else {
			return null;
		}
	}
	
	// 거래처 계좌정보 수정하기
	public Account updateAccount(Account account) {
		int row = customMapper.updateAccount(account);
		
		if (row == 1) {
			return new Account(account.getBusi_num(), account.getFactory(), account.getTrade_bank(), account.getAccount_num());
		}else {
			return null;
		}
	}
	
	// 국가정보 수정하기
	public Country updateCountry(Country country) {
		int row = customMapper.updateCountry(country);
		
		if(row == 1) {
			return new Country(0, country.getName_eng(), country.getName_kor());
		}else {
			return null;
		}
	}
	
	// 거래처 정보 삭제하기
	
}
