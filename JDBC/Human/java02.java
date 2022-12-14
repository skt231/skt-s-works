package com.human.ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.xml.crypto.Data;

import com.human.dto.HumanDto;

public class java02 {

	public static void main(String[] args) {
//데이터선언
		HumanDto[] dtos = new HumanDto[10]; // 객체의 주소를 저장할 수 있는 공간은 없음
											// 객체를 저장할수 있는 공간 10개가 생김

		int totalcount = 0;// [0]~[n]

		// 데이터 초기화 init
		dtos[totalcount++] = new HumanDto("홍길동", 30, 152.1,
				LocalDateTime.parse("2000-02-03 00:00:00", 
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dtos[totalcount++] = new HumanDto("홍길남", 31, 156.4,
				LocalDateTime.parse("2001-02-03 00:00:00", 
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dtos[totalcount++] = new HumanDto("홍길영", 30, 173.5,
				LocalDateTime.parse("2000-12-21 00:00:00", 
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

		// 데이터 다를수 있는 명령어
		// select
		System.out.println("select");
		for (int i = 0; i < totalcount; i++) {
			dtos[i].myPrint();
		}
		// 키가155이상인 사람만 출력
		 System.out.println("select height 155이상");
		 for(int i=0;i<totalcount;i++) {
			 if(dtos[i].getHeight()>155) {
				 dtos[i].myPrint();
			 }
		 }
		 //insert
		dtos[totalcount++] = new HumanDto("홍길도", 42, 183.5,
				LocalDateTime.parse("2000-12-24 00:00:00", 
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//		 update	//이름을 이용해서 나이를 변경하는 형태
		System.out.println("update name, age");	//홍길남 50세로 변경
		for (int i = 0; i < totalcount; i++) {
			if(dtos[i].getName().equals("홍길남")){
				dtos[i].setAge(50);
				//break; 여러개의 홍길남중에 처음 데이터 하나만 변경하고 싶다면 추가
			}
		}
		// delete
		System.out.println("delete name / age<35");	//홍길남 나이가 35보다 작은 사람 삭제
		for (int i = 0; i < totalcount; i++) {
			if(dtos[i].getAge()<=35){
				//i 1	totalcount 5
				//dtos[1]= dtos[2];
				//dtos[2]=dtos[3];
				//dts[3]=dtos[4];
				
				//i 2	totalcount 4
				//dtos[2]= dtos[3];
				//dtos[3]=dtos[4];
				//시작은 i부터 totalcount까지
		for(int j=i;j<totalcount-1;j++) {
			dtos[j]=dtos[j+1];
				}
				i--;	//누락 방지[1]
				totalcount--;
				
				}
				
	}

	}
}
