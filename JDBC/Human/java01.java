package com.human.ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.human.dto.HumanDto;

//human테이블의 데이터 출력
public class java01 {

	public static void main(String[] args) {
//------------------------------------------------------------------------------		
		//1.변수를 이용한 출력
		//날짜 처리 과거에 Date사용, 최근에는 LocalDateTime을 많이 사용
	String name="홍길동"; int age=30; double height=152.1;
	LocalDateTime birthday;
	
	//현재시간 출력
	LocalDateTime nowTime=LocalDateTime.now();
	System.out.println(nowTime);
	
	// local DateTime -> String
//	String parseString= nowTime.format(얻고자하는 시간 문자열 포멧);
	String parseString= nowTime.format(DateTimeFormatter.ofPattern(
			"yyyy-MM-dd HH:mm:ss"));
	System.out.println(parseString);
	
	//String -> LocalDateTime
//	LocalDateTime parseTime = LocalDateTime.parse(시간문자열,시간 문자열 포멧);
	LocalDateTime parseTime = LocalDateTime.parse(parseString,
		
			DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
			System.out.println("parseTime:" +parseTime);
//------------------------------------------------------------------------------
	//DB작업 이어서하기
	//날짜만 처리하려면 simpleDateFormat을 사용하자(참고)
	//00:00:00 (시간)써야함
//	 birthday =LocalDateTime.parse("2000-02-03 00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//	 System.out.println("이름: "+name);
//	 System.out.println("나이 :"+ age);
//	 System.out.println("키 : "+ height);
////	 System.out.println("생일 : "+ birthday);
//	 System.out.println("생일 : "+ birthday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//
//	 //2.여러개의 변수에 넣어서 처리하기
//	 //클래스 하용하는 이유를 알아보고자 한번 해보자.
//	 
	 //변수 2
//	 System.out.println();
//	 String name1="홍길정"; int age1=29; double height1=154.1;
//		LocalDateTime birthday1 =LocalDateTime.parse("2000-02-03 00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));;
//		 System.out.println("이름: "+name1);
//		 System.out.println("나이 :"+ age1);
//		 System.out.println("키 : "+ height1);
////		 System.out.println("생일 : "+ birthday1);
//		 System.out.println("생일 : "+ birthday1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//		
//		 //변수3
//		 System.out.println();
//		 String name2="홍길남"; int age2=31; double height2=173.1;
//			LocalDateTime birthday2 =LocalDateTime.parse("2001-02-03 00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));;
//			 System.out.println("이름: "+name2);
//			 System.out.println("나이 :"+ age2);
//			 System.out.println("키 : "+ height2);
////			 System.out.println("생일 : "+ birthday2);
//			 System.out.println("생일 : "+ birthday2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//
//			 //변수4
//			 System.out.println();
//			 String name3="홍길아"; int age3=21; double height3=143.2;
//				LocalDateTime birthday3 =LocalDateTime.parse("2001-02-03 00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));;
//				 System.out.println("이름: "+name3);
//				 System.out.println("나이 :"+ age3); 
////				 System.out.println("생일 : "+ birthday3);
//				 System.out.println("생일 : "+ birthday3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//	
//				 //클래스가 필요한 이유 코드 길어지는거 간편화하고 사람 추가할떄마다 복붙안하기 위해
//				 
				 System.out.println("------------------------------------------------------------");
//---------------------------------------------------------------------------------------
	//클래스를 이용하여 관련 있는 human데이터와 메소드를 합치기.
		//데이터베이스의 데이터를 java에서 조작할때 dto와 dao를 사용한다.
		//dto(data transfor object):데이터를 옮길때 사용하는 객체,데이터베이스의 데이터를 저장하는 객체
		//dao(data):데이터베이스에 데이터를 조작할떄 사용하는 객체
				 HumanDto dto1=new HumanDto("홍길동",12,23.0,LocalDateTime.now());
				 HumanDto dto2=new HumanDto("홍길동",12,23.0,LocalDateTime.now());
				 HumanDto dto3=new HumanDto("홍길남",12,23.0,LocalDateTime.now());
				 HumanDto dto4=new HumanDto("홍길남",12,23.0,LocalDateTime.now());
				 
				 
				 //hashcode와 equlas가 없다면 모드 다르다고 나온다.
				 if(dto1.equals(dto2)) {
					 System.out.println("dto1과 dto2는 같다.");
				 }else {
					 System.out.println("dto1과 dto2는 다르다.");
				 }
				  
				 if(dto1.equals(dto3)) { 
					 System.out.println("dto1과 dto3은 같다.");
				 }else {
					 System.out.println("dto1과 dto3은 다르다.");
				 }
				 
				 if(dto3.equals(dto4)) {
					 System.out.println("dto3과 dto4는 같다.");
				 }else {
					System.out.println("dto3과 dto4는 다르다."); 
				} 
				 System.out.println("-------------------------------------------------------");
				 //1)객체의 모든 필드가 같을때만 같다고 나오도록 equals를 재정의 해보자.
				 //2)객체의 이름 필드가 같을때만 같다고 나오도록 equals를 재정의 해보자
				//3)객체의 나이 필드가 같을때만 같다고 나오도록 equals를 재정의 해보자
				//4)객체의 이름,나이 필드가 같을때만 같다고 나오도록 equals를 재정의 해보자
//-------------------------------------------------------------------------------------------				 
				 //객체에 출력 매소드 넣기
				 HumanDto hDto1=new HumanDto("홍길동",30,152.1,
						 LocalDateTime.parse("2000-02-03 00:00:00",DateTimeFormatter.ofPattern(
								 "yyyy-MM-dd HH:mm:ss")));
				 HumanDto hDto2=new HumanDto("홍길남",31,156.4,
						 LocalDateTime.parse("2001-02-03 00:00:00",DateTimeFormatter.ofPattern(
								 "yyyy-MM-dd HH:mm:ss")));
				 HumanDto hDto3=new HumanDto("홍길영",30,173.5,
						 LocalDateTime.parse("2000-12-21 00:00:00",DateTimeFormatter.ofPattern(
								 "yyyy-MM-dd HH:mm:ss")));
				 hDto1.myPrint();	//각각 메소드호출
				 hDto2.myPrint();
				 hDto3.myPrint();
//---------------------------------------------------------------------------------------
				 //getter,setter를 사용하는 이유? 
				 //접근에 제한을 주기 위해서 사용,.객체의 무결성을 보장하기 위해 사용
				//선언된 변수에 직접접근하지 않고 setter/getter를 이용해서 원하는 값을 유지하기위해서 사용
				 //캡숄화 내부의 내용을 몰라도 마음놓고 사용할 수 있다.//getter과 setter이 캡숄화하기위한 방법
				 
				 HumanDto myDto=new HumanDto();
				 myDto.myAge=30;
				 myDto.myAge=-30;
				 myDto.myAge=330;
				 
				 myDto.setAge(30);
				 myDto.setAge(-30);
				 myDto.setAge(330);
				 //관리자가 나이가 음수가 들어가 있을수도 있음//처리 어떻게??
				//setter,getter을 활용하여 해결함--> 캡숄화를 사용(접근을 제한을 주기위해)
				 //선언된 변수에 직접접근하지 않고 setter/getter를 이용해서 원하는 값을 유지하기위해서 사용
				 //특정값에 대한 접근 제어를 하기 위해서 사용함
				 
	}

}
