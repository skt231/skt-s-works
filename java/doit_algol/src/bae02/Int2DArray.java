package bae02;
//2행4열의 2차원 배열
public class Int2DArray {

	public static void main(String[] args) {
		int[][] x=new int[2][4];	//2차원 배열을 선언
		
		x[0][1]=37;		//대입
		x[0][3]=54;
		x[1][2]=65;
		
		for(int i =0;i<2;i++) {		//각요소의 값을 출력
			for(int j=0;j<4;j++) {
				System.out.println("x["+i+"]"+"["+j+"] ="+x[i][j]);
			}
		}
	}

}
