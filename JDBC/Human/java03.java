package com.human.ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.human.dao.HumanArrayDao;
import com.human.dto.HumanDto;

public class Java03 {

	public static void main(String[] args) {
		HumanArrayDao Dao=new HumanArrayDao();
		
		Dao.init();
		Dao.select();
		
			HumanDto dto = new HumanDto("홍길동2", 32, 152.2,
					LocalDateTime.parse("2000-02-03 00:00:00", 
							DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
					
		Dao.insert(dto);
		Dao.select();
		Dao.delete(33);	//잘못됨
		Dao.select();
		Dao.update("홍길남", 50);
		Dao.select();
		
		//delete 정상적으로동작하게 만들기
		//사용자 입력과 메뉴를 사용해서 운영되는 프로그램 만들기
	}
	}


