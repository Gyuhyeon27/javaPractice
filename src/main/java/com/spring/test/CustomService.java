package com.spring.test;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomService {

	@Autowired
	CustomMapper customMapper;

/*	//전체 조회하기
	public List<Custom> getCustomList(){
		return customMapper.selectCustom();
	}
*/
	// 리스트 조회하기
	public Custom getBNList(String busiNum) {
		return customMapper.selectBNCustom(busiNum);
	}
	
	public Custom getCustomOneList(String custom) {
		return customMapper.selectOneCustom(custom);
	}
	
	// 거래처 등록하기
	public Custom insertCustom(Custom custom) {
		custom.setRegiInfoDate(LocalDateTime.now());
		custom.setModiInfoDate(LocalDateTime.now());
		int row = customMapper.insertCustom(custom);
		
		if (row == 1) {
			return new Custom(custom.getBusiNum(), custom.getCustom(), custom.getsHort(), custom.getCeo(), custom.getChargePerson(), custom.getBusiCondition(), 
					custom.getItem(), custom.getPostNum(), custom.getAddr1(), custom.getAddr2(), custom.getTel(), custom.getFax(), custom.getHomepage(), custom.getCoYn(), 
					custom.getForeignYn(), custom.getTaxYn(), custom.getCountryEng(), custom.getCountryKor(), custom.getSpecialRelation(), custom.getTradeStop(), 
					custom.getContractPeriodS(), custom.getContractPeriodE(), custom.getRegiInfoMan(), custom.getRegiInfoDate(), custom.getModiInfoMan(), 
					custom.getModiInfoDate(),custom.getFactory(), custom.getTradeBank(), custom.getAccountNum());
		}else {
			return null;
		}
	}
	
	// 거래처 계좌정보 등록하기
	public Account insertAccount(Account account) {
		int row = customMapper.insertAccount(account);
		
		if (row == 1) {
			return new Account(account.getBusiNum(), account.getFactory(), account.getTradeBank(), account.getAccountNum());
		}else {
			return null;
		}
	}
	
	// 국가정보 등록하기
	public Country insertCountry(Country country) {
		int row = customMapper.insertCountry(country);
		
		if(row == 1) {
			return new Country(0, country.getNameEng(), country.getNameKor());
		}else {
			return null;
		}
	}
	
	// 거래처 수정하기
	public Custom updateCustom(Custom custom) {
		custom.setRegiInfoDate(LocalDateTime.now());
		custom.setModiInfoDate(LocalDateTime.now());
		int row = customMapper.updateCustom(custom);
		
		if (row == 1) {
			return new Custom(custom.getBusiNum(), custom.getCustom(), custom.getsHort(), custom.getCeo(), custom.getChargePerson(), custom.getBusiCondition(), 
					custom.getItem(), custom.getPostNum(), custom.getAddr1(), custom.getAddr2(), custom.getTel(), custom.getFax(), custom.getHomepage(), custom.getCoYn(), 
					custom.getForeignYn(), custom.getTaxYn(), custom.getCountryEng(), custom.getCountryKor(), custom.getSpecialRelation(), custom.getTradeStop(), 
					custom.getContractPeriodS(), custom.getContractPeriodE(), custom.getRegiInfoMan(), custom.getRegiInfoDate(), custom.getModiInfoMan(), 
					custom.getModiInfoDate(), custom.getFactory(), custom.getTradeBank(), custom.getAccountNum());
		}else {
			return null;
		}
	}
	
	// 거래처 계좌정보 수정하기
	public Account updateAccount(Account account) {
		int row = customMapper.updateAccount(account);
		
		if (row == 1) {
			return new Account(account.getBusiNum(), account.getFactory(), account.getTradeBank(), account.getAccountNum());
		}else {
			return null;
		}
	}
	
	// 국가정보 수정하기
	public Country updateCountry(Country country) {
		int row = customMapper.updateCountry(country);
		
		if(row == 1) {
			return new Country(0, country.getNameEng(), country.getNameKor());
		}else {
			return null;
		}
	}
	
	// 거래처 정보 삭제하기
	public Custom deleteCustom(Custom custom) {
		int row = customMapper.deleteCustom(custom);
		
		if(row == 1) {
			return null;
		}else {
			return null;
		}
	}
}
