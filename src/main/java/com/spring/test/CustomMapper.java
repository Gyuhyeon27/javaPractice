package com.spring.test;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CustomMapper {

/*	// 거래처 전체 조회
	@Select("select * from custom")
	public List<Custom> selectCustom();
*/	
	// busi_num 이용해 조회
	@Select("select * from custom cu join account a on cu.busi_num = a.busi_num  where cu.busi_num = #{busiNum}")
	public Custom selectBNCustom(String busiNum);

	// custom 이용해 조회
	@Select("select * from custom cu join account a on cu.busi_num = a.busi_num  where custom = #{custom}")
	public Custom selectOneCustom(String custom);

	// 거래처 등록
	@Insert("insert into custom(busi_num, custom, short, ceo, charge_person, busi_condition, item, post_num, addr1, addr2, tel, fax, homepage,"
			+ "co_yn, foreign_yn, tax_yn, country_eng, country_kor, special_relation, trade_stop, contract_period_s, contract_period_e, "
			+ "regi_info_man, regi_info_date, modi_info_man, modi_info_date) "
			+ "values(#{busiNum}, #{custom}, #{sHort}, #{ceo}, #{chargePerson}, #{busiCondition}, #{item}, #{postNum}, #{addr1}, #{addr2}, "
			+ "#{tel}, #{fax}, #{homepage}, #{coYn}, #{foreignYn}, #{taxYn}, #{countryEng}, #{countryKor}, #{specialRelation}, #{tradeStop}, "
			+ "#{contractPeriodS}, #{contractPeriodE}, #{regiInfoMan}, #{regiInfoDate}, #{modiInfoMan}, #{modiInfoDate})")
	public int insertCustom(Custom custom);

	// 거래처 계좌정보 등록
	@Insert("insert into account(busi_num, factory, trade_bank, account_num) values(#{busiNum}, #{factory}, #{tradeBank}, #{accountNum})")
	public int insertAccount(Account account);

	// 국가 정보 등록
	@Insert("insert into country(name_eng, name_kor) values(#{nameEng}, #{nameKor})")
	public int insertCountry(Country country);

	// 거래처 수정하기
	@Update("update custom set busi_num = #{busiNum}, custom = #{custom}, short = #{sHort}, ceo = #{ceo}, charge_person = #{chargePerson}, "
			+ "busi_condition = #{busiCondition}, item = #{item}, post_num = #{postNum}, addr1 = #{addr1}, addr2 = #{addr2}, tel = #{tel}, fax = #{fax}, "
			+ "homepage = #{homepage}, co_yn = #{coYn}, foreign_yn = #{foreignYn}, tax_yn = #{taxYn}, country_eng = #{countryEng}, country_kor = #{countryKor}, "
			+ "special_relation = #{specialRelation}, trade_stop = #{tradeStop}, contract_period_s = #{contractPeriodS}, contract_period_e = #{contractPeriodE}, "
			+ "regi_info_man = #{regiInfoMan}, regi_info_date = #{regiInfoDate}, modi_info_man = #{modiInfoMan}, modi_info_date = #{modiInfoDate} "
			+ "where busi_num = #{busiNum}")
	public int updateCustom(Custom custom);

	// 거래처 계좌정보 수정하기
	@Update("update account set busi_num = #{busiNum}, factory = #{factory}, trade_bank = #{tradeBank}, account_num = #{accountNum} where busi_num = #{busiNum}")
	public int updateAccount(Account account);
	
	// 국가정보 수정하기
	@Update("update country set name_eng = #{nameEng}, name_kor = #{nameKor} where name_kor = #{nameKor}")
	public int updateCountry(Country country);
	
	// 거래처 정보 삭제하기
	@Delete("delete from custom where busi_num = #{busiNum}")
	public int deleteCustom(Custom custom);
}
