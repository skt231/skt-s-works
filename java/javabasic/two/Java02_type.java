package two;

public class Java02_type {
	//package class 파일을 모으는 폴더

		public static void main(String[] args) {
			// static 유일한 메서드라는 의미
//			void 리턴 값이 없음(모든 메서드는 호출하면 리턴값이 있거나 없거나 함)
//			(string[] args) 인자값, 매개변수로써 메서드가 사용하는 원재료
//			String[] 문자열 들의 배열(문자열들 모음집)
//			인자값:메서드를 호출할떄 원재료를 넣는다는 용어
//			매개변수: 메서드 입장으로 봤을때 받은 원재료를 자칭하는 말내	

			System.out.println();
//			system 내장 클래스(자바가 기본적으로 제공하는 클래스)
//			system OS(원도우)와 자바를 연결해주는 인터페이스 클래스(객체)
//			out: System 클래서 내부에 있는 output(출력)객체(하나의 덩어리를 지칭)
//			println() 콘솔창에 입력된 값을 출력하는 메서드
//			():메서드이고, ()안에는 인자값을 넣을수 있음

			int num9 = 1;
			// int 숫자, 정수 타입, int는 선언부
//			num 별칭, num이라는 변수 이름에는 int 타입으로만 데이터를 넣을 수 있다.
//			= 대입연산자,=(대입연산자)를 통해 num이라는 변수이름에 1이라는 데이터를 넣는다.(할당)
//			1 실제 할당된 값
			String stringA = "심규태";
//			char charA = "a";
			// 문자(한 글자:char) + 열(다수) > 글자가 여러개
			System.out.println(num9);
			System.out.println(stringA);

//		int num이라는 변수에	숫자 10과 20과 30을 더하여
//			system.out.println(num)으로 출력하시오
			int num =0;
			int num10 = 10;
			int num20 = 20;
			int num30 = 30;
//			50을 어디에 저장?
//			= 대입연산자의 우측에 있는 num10 + num20 + num30을 더한뒤
//			num이라는 변수에 저장
			num = num10 + num20 + num30;
			System.out.println(num);
//			int num40이라는 변수에 40 데이터를 넣고, 
//			string stringABC이라는 변수에 박준석이라는 데이터를 넣은 뒤,
//			system.out.println(stringABC)으로 박준석 40을 출력하시오
//			문자열과 숫자를 혼합해서 어떻게 출력되는가?	박준석40	

			int num40 = 40;
			String stringABC = "박준석";
//			캐스팅(자동형변환):문자열이 우성이므로 정수인 열성은 우성으로 변형
//			문자열이 정수보다 우선순위
//			stringABC +40 >> 문자열 +정수 가능
//			stringABC는 문자열 타입이므로 박준석40은 문자열로 취금
			stringABC= stringABC + num40; 
			System.out.println(stringABC);
			
//			변수이름은 첫글자 소문자를 추천 (대분자일경우 타입과 헷갈릴수 있음)
			String stringEFG= "휴면교육센터";
			String stringHIF = "3클래스";
//		 	" " 공백도 문자열 취급
			String stringOutput = stringEFG + stringHIF;
			System.out.println(stringOutput);
			
//			본인의 이름과 지금배우고 있는 언어 "자바"를 포함하여 PR을
//			키워드를 더하여 출력하는 구문을 만드세요
//			String name = "김준석"
//			String job ="선생님"
//			system.out.prinln(name+job+"입니다."(중간에 띄어쓰기가 없으므로 잘처리)
//			EX)"김준석"+ "선생" +"9월 14일" +"출근"
			String hi ="안녕하세요";
			String name ="심규태";
			String job ="학생";
			String subject="Java";
			String day = "2번쨰";
			String space=" ";
			System.out.println( hi +space+subject+"를"+space+ "열심히 배우고 있는"+space +name+space+job+space+"입니다.");
			System.out.println("이제 "+ day+"날 이지만 열심히 하겠습니다.");
//			변수가 하는일? 데이터를 저장하고 꺼내서 쓰는 저장소로써 반복적인 업무를 할때 사용
		}

	}
