package com.spring.test;

public class Country {
	private int id;
	private String name_eng;
	private String name_kor;
	
	public Country() {}

	public Country(int id, String name_eng, String name_kor) {
		super();
		this.id = id;
		this.name_eng = name_eng;
		this.name_kor = name_kor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_eng() {
		return name_eng;
	}

	public void setName_eng(String name_eng) {
		this.name_eng = name_eng;
	}

	public String getName_kor() {
		return name_kor;
	}

	public void setName_kor(String name_kor) {
		this.name_kor = name_kor;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name_eng=" + name_eng + ", name_kor=" + name_kor + "]";
	}

}
