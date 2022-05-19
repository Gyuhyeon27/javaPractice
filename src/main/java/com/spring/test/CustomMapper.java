package com.spring.test;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CustomMapper {

	// busi_num 이용해 조회
	@Select("select * from custom cu join account a on cu.busi_num = a.busi_num join country co on cu.country_kor = co.name_kor where cu.busi_num = #{busi_num}")
	public Custom selectBNCustom(String busi_num);

	// custom 이용해 조회
	@Select("select * from custom cu join account a on cu.busi_num = a.busi_num join country co on cu.country_kor = co.name_kor where custom = #{custom}")
	public Custom selectOneCustom(String custom);

	// 거래처 등록
	@Insert("insert into custom(busi_num, custom, short, ceo, charge_person, busi_condition, item, post_num, addr1, addr2, tel, fax, homepage,"
			+ "co_yn, foreign_yn, tax_yn, country_eng, country_kor, special_relation, trade_stop, contract_poriod_s, contract_period_e, "
			+ "regi_info_man, regi_info_date, modi_info_man, modi_info_date) "
			+ "values(#{busi_num}, #{custom}, #{short}, #{ceo}, #{charge_person}, #{busi_condition}, #{item}, #{post_num}, #{addr1}, #{addr2}, "
			+ "#{tel}, #{fax}, #{homepage}, #{co_yn}, #{foreign_yn}, #{tax_yn}, #{country_eng}, #{country_kor}, #{special_relation}, #{trade_stop}, "
			+ "#{contract_poriod_s}, #{contract_period_e}, #{regi_info_man}, #{regi_info_date}, #{modi_info_man}, #{modi_info_date})")
	public int insertCustom(Custom custom);

	// 거래처 계좌정보 등록
	@Insert("insert into account(busi_num, factory, trade_bank, account_num) values(#{busi_num}, #{factory}, #{trade_bank}, #{account_num})")
	public int insertAccount(Account account);

	// 국가 정보 등록
	@Insert("insert into country(name_eng, name_kor) values(#{name_eng}, #{name_kor})")
	public int insertCountry(Country country);

	// 거래처 수정하기
	@Update("update custom set busi_num = #{busi_num}, custom = #{custom}, short = #{short}, ceo = #{ceo}, charge_person = #{charge_person}, "
			+ "busi_condition = #{busi_condition}, item = #{item}, post_num = #{post_num}, addr1 = #{addr1}, addr2 = #{addr2}, tel = #{tel}, fax = #{fax}, "
			+ "homepage = #{homepage}, co_yn = #{co_yn}, foreign_yn = #{foreign_yn}, tax_yn = #{tax_yn}, country_eng = #{country_eng}, country_kor = #{country_kor}, "
			+ "special_relation = #{special_relation}, trade_stop = #{trade_stop}, contract_poriod_s = #{contract_poriod_s}, contract_period_e = #{contract_period_e}, "
			+ "regi_info_man = #{regi_info_man}, regi_info_date = #{regi_info_date}, modi_info_man = #{modi_info_man}, modi_info_date = #{modi_info_date} "
			+ "where busi_num = #{busi_num}")
	public int updateCustom(Custom custom);

	// 거래처 계좌정보 수정하기
	@Update("update account set #{busi_num}, #{factory}, #{trade_bank}, #{account_num} where busi_num = #{busi_num}")
	public int updateAccount(Account account);
	
	// 국가정보 수정하기
	@Update("update country set name_eng = #{name_eng}, name_kor = #{name_kor} where name_kor = #{name_kor}")
	public int updateCountry(Country country);
	
	// 거래처 정보 삭제하기
	@Delete("delete from custom where busi_num = #{busi_num}")
	public int deleteCustom(Custom custom);
}
