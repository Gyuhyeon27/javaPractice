package com.spring.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class CustomAcc {
	private String busiNum;
	private String custom;
	private String sHort;
	private String ceo;
	private String chargePerson;
	private String busiCondition;
	private String item;
	private String postNum;
	private String addr1;
	private String addr2;
	private String tel;
	private String fax;
	private String homepage;
	private String coYn;
	private String foreignYn;
	private String taxYn;
	private String countryEng;
	private String countryKor;
	private String specialRelation;
	private String tradeStop;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate contractPeriodS;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate contractPeriodE;
	
	private String regiInfoMan;
	private LocalDateTime regiInfoDate;
	private String modiInfoMan;
	private LocalDateTime modiInfoDate;

	private String factory;
	private String tradeBank;
	private String accountNum;

	public CustomAcc() {
	}

	public String getBusiNum() {
		return busiNum;
	}

	public void setBusiNum(String busiNum) {
		this.busiNum = busiNum;
	}

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

	public String getsHort() {
		return sHort;
	}

	public void setsHort(String sHort) {
		this.sHort = sHort;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getChargePerson() {
		return chargePerson;
	}

	public void setChargePerson(String chargePerson) {
		this.chargePerson = chargePerson;
	}

	public String getBusiCondition() {
		return busiCondition;
	}

	public void setBusiCondition(String busiCondition) {
		this.busiCondition = busiCondition;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPostNum() {
		return postNum;
	}

	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getCoYn() {
		return coYn;
	}

	public void setCoYn(String coYn) {
		this.coYn = coYn;
	}

	public String getForeignYn() {
		return foreignYn;
	}

	public void setForeignYn(String foreignYn) {
		this.foreignYn = foreignYn;
	}

	public String getTaxYn() {
		return taxYn;
	}

	public void setTaxYn(String taxYn) {
		this.taxYn = taxYn;
	}

	public String getCountryEng() {
		return countryEng;
	}

	public void setCountryEng(String countryEng) {
		this.countryEng = countryEng;
	}

	public String getCountryKor() {
		return countryKor;
	}

	public void setCountryKor(String countryKor) {
		this.countryKor = countryKor;
	}

	public String getSpecialRelation() {
		return specialRelation;
	}

	public void setSpecialRelation(String specialRelation) {
		this.specialRelation = specialRelation;
	}

	public String getTradeStop() {
		return tradeStop;
	}

	public void setTradeStop(String tradeStop) {
		this.tradeStop = tradeStop;
	}

	public LocalDate getContractPeriodS() {
		return contractPeriodS;
	}

	public void setContractPeriodS(LocalDate contractPeriodS) {
		this.contractPeriodS = contractPeriodS;
	}

	public LocalDate getContractPeriodE() {
		return contractPeriodE;
	}

	public void setContractPeriodE(LocalDate contractPeriodE) {
		this.contractPeriodE = contractPeriodE;
	}

	public String getRegiInfoMan() {
		return regiInfoMan;
	}

	public void setRegiInfoMan(String regiInfoMan) {
		this.regiInfoMan = regiInfoMan;
	}

	public LocalDateTime getRegiInfoDate() {
		return regiInfoDate;
	}

	public void setRegiInfoDate(LocalDateTime regiInfoDate) {
		this.regiInfoDate = regiInfoDate;
	}

	public String getModiInfoMan() {
		return modiInfoMan;
	}

	public void setModiInfoMan(String modiInfoMan) {
		this.modiInfoMan = modiInfoMan;
	}

	public LocalDateTime getModiInfoDate() {
		return modiInfoDate;
	}

	public void setModiInfoDate(LocalDateTime modiInfoDate) {
		this.modiInfoDate = modiInfoDate;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getTradeBank() {
		return tradeBank;
	}

	public void setTradeBank(String tradeBank) {
		this.tradeBank = tradeBank;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
}
