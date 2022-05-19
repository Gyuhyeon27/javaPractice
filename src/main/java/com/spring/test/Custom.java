package com.spring.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Custom {
	private String busi_num;
	private String custom;
	private String sHort;
	private String ceo;
	private String charge_person;
	private String busi_condition;
	private String item;
	private String post_num;
	private String addr1;
	private String addr2;
	private String tel;
	private String fax;
	private String homepage;
	private String co_yn;
	private String foreign_yn;
	private String tax_yn;
	private String country_eng;
	private String country_kor;
	private String special_relation;
	private String trade_stop;
	private LocalDate contract_period_s;
	private LocalDate contract_period_e;
	private String regi_info_man;
	private LocalDateTime regi_info_date; 
	private String modi_info_man;
	private LocalDateTime modi_info_date;
	
	public Custom() {}

	public Custom(String busi_num, String custom, String sHort, String ceo, String charge_person, String busi_condition,
			String item, String post_num, String addr1, String addr2, String tel, String fax, String homepage,
			String co_yn, String foreign_yn, String tax_yn, String country_eng, String country_kor,
			String special_relation, String trade_stop, LocalDate contract_period_s, LocalDate contract_period_e,
			String regi_info_man, LocalDateTime regi_info_date, String modi_info_man, LocalDateTime modi_info_date) {
		super();
		this.busi_num = busi_num;
		this.custom = custom;
		this.sHort = sHort;
		this.ceo = ceo;
		this.charge_person = charge_person;
		this.busi_condition = busi_condition;
		this.item = item;
		this.post_num = post_num;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.tel = tel;
		this.fax = fax;
		this.homepage = homepage;
		this.co_yn = co_yn;
		this.foreign_yn = foreign_yn;
		this.tax_yn = tax_yn;
		this.country_eng = country_eng;
		this.country_kor = country_kor;
		this.special_relation = special_relation;
		this.trade_stop = trade_stop;
		this.contract_period_s = contract_period_s;
		this.contract_period_e = contract_period_e;
		this.regi_info_man = regi_info_man;
		this.regi_info_date = regi_info_date;
		this.modi_info_man = modi_info_man;
		this.modi_info_date = modi_info_date;
	}

	public String getBusi_num() {
		return busi_num;
	}

	public void setBusi_num(String busi_num) {
		this.busi_num = busi_num;
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

	public String getCharge_person() {
		return charge_person;
	}

	public void setCharge_person(String charge_person) {
		this.charge_person = charge_person;
	}

	public String getBusi_condition() {
		return busi_condition;
	}

	public void setBusi_condition(String busi_condition) {
		this.busi_condition = busi_condition;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPost_num() {
		return post_num;
	}

	public void setPost_num(String post_num) {
		this.post_num = post_num;
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

	public String getCo_yn() {
		return co_yn;
	}

	public void setCo_yn(String co_yn) {
		this.co_yn = co_yn;
	}

	public String getForeign_yn() {
		return foreign_yn;
	}

	public void setForeign_yn(String foreign_yn) {
		this.foreign_yn = foreign_yn;
	}

	public String getTax_yn() {
		return tax_yn;
	}

	public void setTax_yn(String tax_yn) {
		this.tax_yn = tax_yn;
	}

	public String getCountry_eng() {
		return country_eng;
	}

	public void setCountry_eng(String country_eng) {
		this.country_eng = country_eng;
	}

	public String getCountry_kor() {
		return country_kor;
	}

	public void setCountry_kor(String country_kor) {
		this.country_kor = country_kor;
	}

	public String getSpecial_relation() {
		return special_relation;
	}

	public void setSpecial_relation(String special_relation) {
		this.special_relation = special_relation;
	}

	public String getTrade_stop() {
		return trade_stop;
	}

	public void setTrade_stop(String trade_stop) {
		this.trade_stop = trade_stop;
	}

	public LocalDate getContract_period_s() {
		return contract_period_s;
	}

	public void setContract_period_s(LocalDate contract_period_s) {
		this.contract_period_s = contract_period_s;
	}

	public LocalDate getContract_period_e() {
		return contract_period_e;
	}

	public void setContract_period_e(LocalDate contract_period_e) {
		this.contract_period_e = contract_period_e;
	}

	public String getRegi_info_man() {
		return regi_info_man;
	}

	public void setRegi_info_man(String regi_info_man) {
		this.regi_info_man = regi_info_man;
	}

	public LocalDateTime getRegi_info_date() {
		return regi_info_date;
	}

	public void setRegi_info_date(LocalDateTime regi_info_date) {
		this.regi_info_date = regi_info_date;
	}

	public String getModi_info_man() {
		return modi_info_man;
	}

	public void setModi_info_man(String modi_info_man) {
		this.modi_info_man = modi_info_man;
	}

	public LocalDateTime getModi_info_date() {
		return modi_info_date;
	}

	public void setModi_info_date(LocalDateTime modi_info_date) {
		this.modi_info_date = modi_info_date;
	}

	@Override
	public String toString() {
		return "Custom [busi_num=" + busi_num + ", custom=" + custom + ", sHort=" + sHort + ", ceo=" + ceo
				+ ", charge_person=" + charge_person + ", busi_condition=" + busi_condition + ", item=" + item
				+ ", post_num=" + post_num + ", addr1=" + addr1 + ", addr2=" + addr2 + ", tel=" + tel + ", fax=" + fax
				+ ", homepage=" + homepage + ", co_yn=" + co_yn + ", foreign_yn=" + foreign_yn + ", tax_yn=" + tax_yn
				+ ", country_eng=" + country_eng + ", country_kor=" + country_kor + ", special_relation="
				+ special_relation + ", trade_stop=" + trade_stop + ", contract_period_s=" + contract_period_s
				+ ", contract_period_e=" + contract_period_e + ", regi_info_man=" + regi_info_man + ", regi_info_date="
				+ regi_info_date + ", modi_info_man=" + modi_info_man + ", modi_info_date=" + modi_info_date + "]";
	}
	
}