package d23;

public class InterSample {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.methodA();
		a.methodB();

		InterA ia = a;
		InterB ib = a;
	}

}

class ClassA implements InterA ,InterC{

	@Override
	public void methodA() {
		System.out.println("methodA in classA");

	}

	public void methodB() {
		System.out.println("methodB in classB");

	}

	@Override
	public void methodC() {
		System.out.println("methodC in classC");
		
	}

}

interface InterA extends InterB {
	void methodA();

}

interface InterB {
	void methodA();
}

interface InterC {
	void methodC();
}
