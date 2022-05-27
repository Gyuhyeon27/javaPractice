package com.spring.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class Custom {
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

	public Custom() {
	}

	public Custom(String busiNum, String custom, String sHort, String ceo, String chargePerson, String busiCondition,
			String item, String postNum, String addr1, String addr2, String tel, String fax, String homepage,
			String coYn, String foreignYn, String taxYn, String countryEng, String countryKor, String specialRelation,
			String tradeStop, LocalDate contractPeriodS, LocalDate contractPeriodE, String regiInfoMan,
			LocalDateTime regiInfoDate, String modiInfoMan, LocalDateTime modiInfoDate) {
		super();
		this.busiNum = busiNum;
		this.custom = custom;
		this.sHort = sHort;
		this.ceo = ceo;
		this.chargePerson = chargePerson;
		this.busiCondition = busiCondition;
		this.item = item;
		this.postNum = postNum;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.tel = tel;
		this.fax = fax;
		this.homepage = homepage;
		this.coYn = coYn;
		this.foreignYn = foreignYn;
		this.taxYn = taxYn;
		this.countryEng = countryEng;
		this.countryKor = countryKor;
		this.specialRelation = specialRelation;
		this.tradeStop = tradeStop;
		this.contractPeriodS = contractPeriodS;
		this.contractPeriodE = contractPeriodE;
		this.regiInfoMan = regiInfoMan;
		this.regiInfoDate = regiInfoDate;
		this.modiInfoMan = modiInfoMan;
		this.modiInfoDate = modiInfoDate;
	}

	public void setRegiInfoDate(LocalDateTime regiInfoDate) {
		this.regiInfoDate = regiInfoDate;
	}

	public void setModiInfoDate(LocalDateTime modiInfoDate) {
		this.modiInfoDate = modiInfoDate;
	}
}
