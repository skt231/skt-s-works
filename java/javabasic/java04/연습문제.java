
//(1)자연수 n이 매개변수로 주어집니다. 
//n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 
//solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.)
package four;
public class 연습문제{

	public int solution(int n) {
		int answer =0;
		for(int i = 0;i<n;i++) {
			if(n%i==1) {
				answer = i;
				break;
			}
			}
		return answer;
		}

 
	//(2)매개변수 n을 받아서 i로 나눈 나머지가 1인 가장 큰 수 i를 리턴하도록 구현하시오
	 //(단, 컴퓨터의 입장에서 최소한의 연산으로 구현 해보세요)
public int solution1(int k) {
	int answer1 =0;
	for(int i = k-1;i<k;i--) {
		if(k%i==1 ) {
			answer1 = i;
			break;
			
		}
	}
	return answer1;	
}
}

