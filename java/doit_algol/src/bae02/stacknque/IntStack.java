package bae02.stacknque;

public class IntStack {
	private int max;	//스택용량
	private int ptr;	//스택 포인터
	private int[] stk;	//스택 본체
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException(){}
		
	}
	public class OverfloweIntStackException extends RuntimeException{
		public OverfloweIntStackException() {}
	}
	public IntStack(int capacity) {
		ptr=0;
		max=capacity;
		try {
			stk=new int[max];
		}catch(OutOfMemoryError e) {
			max=0;
		}
	}
		}


