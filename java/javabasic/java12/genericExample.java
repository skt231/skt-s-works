package d15;

public class GenericExample <T, K> {
	
	private T data0001;
	private K data0002;
	
	void set (T inputdata1, K inputdata2) {
		this.data0001 = inputdata1;
		this.data0002 = inputdata2;
	}
	
	T getData0001() {
		return data0001;
	}
	
	K getData0002() {
		return data0002;
	}

}
