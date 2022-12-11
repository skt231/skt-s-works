package d25;

import java.util.ArrayList;
import java.util.List;

public class JavaQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalaryMan sm01 = new SalaryMan();
		
		System.out.println(new SalaryMan().getAnnualGross()); 
		System.out.println(new SalaryMan(2000000).getAnnualGross());
		
		SalaryMan[] smarr = {sm01, new SalaryMan(), new SalaryMan(20000)};
		System.out.println(smarr[2].getAnnualGross());
		
		List<SalaryMan> smList = new ArrayList<SalaryMan>();
//		List<SalaryMan> smList = new List<SalaryMan>();
		smList.add(sm01);
		smList.add(new SalaryMan());
		
		System.out.println(smList.get(1).getAnnualGross());
		
		//sm01 이라는 이름이로 활용
		
	}
}

class SalaryMan {
	//필드
	int salary = 1000000; //월 급여액
	
	public SalaryMan() {}  //기본생성자
	
	public SalaryMan(int salary) { //시작 월급여액을 받는 생성자 
		this.salary = salary;
	}
	
	//메소드
	public int getAnnualGross(){  //연봉을 반환하는 메소드
		//연봉
		//월급에 500% 가 보너스
		//1년 12달 = 월급 * 12 = 연봉 + 보너스(월급*5) = 진짜연봉
		int result = (salary * 12) + (salary * 5); 
		return result;
	}
}
