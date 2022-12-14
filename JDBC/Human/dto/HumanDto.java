package com.human.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class HumanDto {
	private String name = null; // 값이 없다.
//	private int age=0;
	private Integer age = null;
//	private double height =0;
	private Double height = null;
	private LocalDateTime birthDay = null; // wrapper class //기본자료형을 class로 만든것
	// wrapper class 기본자료ㅗ형을 클래스로 표현한 클래스 //int-->integer,double-->Double //객체처럼
	// 쓸라고...
	// null를 사용하거나 관련 정보를 추가하기 위해서 사용
//---------------------------------------------------------------------------------------

	public void myPrint() {
		System.out.println("이름: " + name);
		System.out.println("나이 :" + age);
		System.out.println("키 : " + height); 
//		 System.out.println("생일 : "+ birthday);
		System.out.println("생일 : " + birthDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.println("-------------------------------------------------------------------");
	}

//---------------------------------------------------------------------------------------
	// 생성자
	public HumanDto() {
	}// 기본생성자를 반드시 추가해야함(//HumanDto dto = new HumanDto();//기본생성자가 없다면 잘 작동하지 않음
		// 생성자에 변화를 주면 기본생성자가 없으면 동작하지 않는다.(시험에서 자주 나옴)

//---------------------------------------------------------------------------------------	
	// toString
	@Override
	public String toString() { 
		return "HumanDto [name=" + name + ", age=" + age +
				", height=" + height + ", birthDay=" + birthDay + "]";
	}

	// ---------------------------------------------------------------------------------------\
	// 객체비교 equals //generate-hashcode() and equals()을 사용해서 씀[이해할필요 없이 사용하자]
	// 1)객체의 모든 필드가 같을때만 같다고 나오도록 equals를 재정의 해보자.
//	@Override
//public int hashCode() {
//	return Objects.hash(age, birthDay, height, name);
//}
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false; 
//	HumanDto other = (HumanDto) obj;
//	return Objects.equals(age, other.age) && Objects.equals(birthDay, other.birthDay)
//			&& Objects.equals(height, other.height) && Objects.equals(name, other.name); //
//}
	// 2)객체의 이름 필드가 같을때만 같다고 나오도록 equals를 재정의 해보자
//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		HumanDto other = (HumanDto) obj;
//		return Objects.equals(name, other.name);
//	}
	// 3)객체의 나이 필드가 같을때만 같다고 나오도록 equals를 재정의 해보자
//	@Override
//	public int hashCode() {
//		return Objects.hash(age);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		HumanDto other = (HumanDto) obj;
//		return Objects.equals(age, other.age);
//	}
	// 4)객체의 이름,나이 필드가 같을때만 같다고 나오도록 equals를 재정의 해보자
//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		HumanDto other = (HumanDto) obj;
//		return Objects.equals(age, other.age) && Objects.equals(name, other.name);
//	}
//---------------------------------------------------------------------------------------
	public HumanDto(String name, Integer age, Double height, LocalDateTime birthDay) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.birthDay = birthDay;
	}

	// setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public LocalDateTime getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDateTime birthDay) {
		this.birthDay = birthDay;
	}

//---------------------------------------------------------------------------------------

	public Integer myAge = 0;

	public Integer getmyAge() {
		return this.myAge;

	}

	public void setmyAge(Integer myAge) {
		if (myAge < 0) {
			System.out.println("음수를 넣을수 없습니다. 0로 세팅");
			myAge = 0;
		}
		this.myAge = myAge;
	}
}
