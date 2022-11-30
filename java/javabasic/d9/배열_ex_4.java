package d9;

public class 배열_ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] listStudentName = new String[25]; 
		
		listStudentName[0] = "권지혜";
		listStudentName[1] = "김건희";
		listStudentName[2] = "김민기";
		listStudentName[3] = "김정환";
		listStudentName[4] = "김지희";
		listStudentName[5] = "김현중";
		listStudentName[6] = "박경환";
		listStudentName[7] = "박송헌";
		listStudentName[8] = "박유진";
		listStudentName[9] = "박주성";
		listStudentName[10] = "성진현";
		listStudentName[11] = "심규태";
		listStudentName[12] = "양희수";
		listStudentName[13] = "이도연";
		listStudentName[14] = "이우창";
		listStudentName[15] = "이재형";
		listStudentName[16] = "이준배";
		listStudentName[17] = "이지훈";
		listStudentName[18] = "이진수";
		listStudentName[19] = "장민욱";
		listStudentName[20] = "정윤호";
		listStudentName[21] = "정하륜";
		listStudentName[22] = "조은빈";
		listStudentName[23] = "최수현";
		listStudentName[24] = "허영주";
		
//		for(int i = 0; i<listStudentName.length; i++) {
//			System.out.println(listStudentName[i]);
//		}
		
		//1. 자기 이름이 몇 번째 배열[i]인지 출력하시오
		boolean check = false;
		for(int i = 0; i<listStudentName.length; i++) {
			
			if(listStudentName[i].equals("심규태")) {
				System.out.println(i+"번째 입니다!");
				//문자열이 숫자보다 더 우선순위이기 때문에 자동형변환
				//문자+숫자 = 문자로 인식!
				//1.번호는+19 > 문자열로 변환
				//2.번호는 19+1 > (문자열+숫자) 문자열로 변환
				System.out.println("번호는 "+(i+1));
				check = true;
				break;
			}
			
		}
		if(!check) {
			System.out.println("해당되는 학생이 없습니다");
		}
	}
}
