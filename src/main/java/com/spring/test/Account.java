package com.spring.test;

public class Account {
	private String busiNum;
	private String factory;
	private String tradeBank;
	private String accountNum;

	public Account() {
	}

	public Account(String busiNum, String factory, String tradeBank, String accountNum) {
		super();
		this.busiNum = busiNum;
		this.factory = factory;
		this.tradeBank = tradeBank;
		this.accountNum = accountNum;
	}

	public String getBusiNum() {
		return busiNum;
	}

	public void setBusiNum(String busiNum) {
		this.busiNum = busiNum;
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

	@Override
	public String toString() {
		return "Account [busiNum=" + busiNum + ", factory=" + factory + ", tradeBank=" + tradeBank + ", accountNum="
				+ accountNum + "]";
	}

}
