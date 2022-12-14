package com.human.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.human.dto.HumanDto;

public class HumanArrayDao {
	// HumanDto클래스를 array형태로 데이터를 조작하는 dao클래스
	// HumanDto인스턴스 배열을 여러개 선언해서 조작할수 있는 형태로....
	// 데이터선언
	private HumanDto[] dtos = new HumanDto[10]; // 객체의 주소를 저장할 수 있는 공간은 없음
	// 객체를 저장할수 있는 공간 10개가 생김
	private int totalCount = 0;

	// 데이터 초기화 init
	public void init() {
		dtos[totalCount++] = new HumanDto("홍길동", 30, 152.1,
				LocalDateTime.parse("2000-02-03 00:00:00", 
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dtos[totalCount++] = new HumanDto("홍길남", 31, 156.4,
				LocalDateTime.parse("2001-02-03 00:00:00", 
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dtos[totalCount++] = new HumanDto("홍길영", 30, 173.5,
				LocalDateTime.parse("2000-12-21 00:00:00", 
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
	}

	public void select() {
		// select
		System.out.println("select");
		for (int i = 0; i < totalCount; i++) {
			dtos[i].myPrint();
		}
	}

	public void select(double height) {
		// 키가155이상인 사람만 출력
		System.out.println("select height 155이상");
		for (int i = 0; i < totalCount; i++) {
			if (dtos[i].getHeight() > height) {
				dtos[i].myPrint();
			}
		}
	}

	// insert
	public void insert(HumanDto dto) {
		dtos[totalCount++] = dto;
		// dtos[totalCount++] = new HumanDto("홍길도", 42, 183.5,
		// LocalDateTime.parse("2000-12-24 00:00:00",
		// DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
	}

	public void update(String name, int age) {
		System.out.println("update name, age"); // 홍길남 50세로 변경
		for (int i = 0; i < totalCount; i++) {
			if (dtos[i].getName().equals(name)) {
				dtos[i].setAge(age);
				// break; 여러개의 홍길남중에 처음 데이터 하나만 변경하고 싶다면 추가
			}
		}
	}

	// delete
	public void delete(double age) {
		System.out.println("delete name / age<35"); // 홍길남 나이가 35보다 작은 사람 삭제
		for (int i = 0; i < totalCount; i++) {
			if (dtos[i].getAge() <= age) {
				// i 1 totalcount 5
				// dtos[1]= dtos[2];
				// dtos[2]=dtos[3];
				// dts[3]=dtos[4];

				// i 2 totalcount 4
				// dtos[2]= dtos[3];
				// dtos[3]=dtos[4];
				// 시작은 i부터 totalcount까지
				for (int j = i; j < totalCount - 1; j++) {
					dtos[j] = dtos[j + 1];
				}
				i--;	//누락방지[1]
				totalCount--;
				System.out.println("삭제되었습니다.");
				System.out.println();
			}

		}
	} 
}
