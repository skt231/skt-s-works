package d7;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class randomAndEqualsJava_ex풀이1{

	public static void main(String[] args) {
		// 랜덤 숫자 1~10까지 중에 3개의 숫자를 뽑습니다. 그 숫자 중에 가장 큰 수를 출력하시오
		int num1 = 0;
		int num2 = 0;
		int num3 = 0; 
		int max=0;
		
		if(num1== num2 | num1==num3|num2==num3) {
			for(int j=0;num1== num2 | num1==num3|num2==num3;j++) {
		num1 = (int) (Math.random() * 10)+1;
		num2 = (int) (Math.random() * 10)+1;
		num3 = (int) (Math.random() * 10)+1;
	
		
				
			if (num1 > num2 && num1 > num2) {
				max=num1;
			} else if (num2 > num3) {
				max=num2;
			} else {
				max=num3;
			}
			System.out.println(num1+", "+ num2+", "+ num3+"중에 ");
			System.out.println("가장 큰수는 "+max +"입니다.");
		}
	}
	}
}

