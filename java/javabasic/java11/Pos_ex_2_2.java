package d13;
//1.배열 복사하여 서로 교환기
//2,임시값 저장
//2번째 배열의 값 사람을 임시 저장 시작으로
//뒤에 있는 사람의 이름을 덮어 쓰기 전에 임시값 교체
//3.역순방식(반복문의 반복 방식)
import java.util.ArrayList;

public class Pos_ex_2_2 {
	static ArrayList<String>arrayTest = new ArrayList<>();
	
	
	//순서대로 출력하기
	public static void main(String[] args) {
		arrayTest.add("김규태");
		arrayTest.add("나규태");
		arrayTest.add("다규태");
		arrayTest.add("다규태");
		arrayTest.add("마규태");
		
		for(int i =0; i<arrayTest.size();i++) {
			System.out.println(arrayTest.get(i));
		}
	//한 칸씩 뒤로 미루기
		for(int i=2;i<arrayTest.size()-1;i++) {
			arrayTest.set(i+1,arrayTest.get(i));
		}
		//순서대로 출력하기
		for(int i=0;i< arrayTest.size();i++) {
			System.out.println(arrayTest.get(i));
//		}
System.out.println("-----------");
//크기 추가
arrayTest.add("?");
//한칸씩 뒤로 미루기(역순)
for(int j= arrayTest.size()-1;
		j>=0;j--) {
	arrayTest.set(j, arrayTest.get(j-1));
	System.out.println(arrayTest.get(j));
	j--;
}
	}
	}
}
