package com.spring.test;

public class Country {
	private int id;
	private String nameEng;
	private String nameKor;

	public Country() {
	}

	public Country(int id, String nameEng, String nameKor) {
		super();
		this.id = id;
		this.nameEng = nameEng;
		this.nameKor = nameKor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameEng() {
		return nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public String getNameKor() {
		return nameKor;
	}

	public void setNameKor(String nameKor) {
		this.nameKor = nameKor;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", nameEng=" + nameEng + ", nameKor=" + nameKor + "]";
	}

}
