package d25;

public class JavaQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu01 = new Student();
		
		stu01.setMajor("컴공");
		stu01.setStudentId(1);
		
		System.out.println("학과:"+stu01.getMajor());
		System.out.println("학번:"+stu01.getStudentId());
		
		System.out.println(stu01.toString());
		
		Student stu02 = new Student("경제", 31);
		System.out.println(stu02.toString());
		stu02.setMajor("심리");
		
		System.out.println(stu02.toString());
		

//		String[] major01 = "컴공";
//		int[] studentId01 = 1;
//
//		String major02 = "컴공";
//		int studentId02 = 2;
	}
	//학생성적기록부 : "1번학생" - 수학성적, 영어성적

	//수학성적목록 : "1번학생 점수" 
	//영어성적목록 : "1번학생 점수"
	//국어성적목록 : "1번학생 점수"
//	public String toString() {
//		String str = "diojfa;soifdjfo;ia";
//		return str;
//	}
//	
//	public 딸기 과일주세요(돈){
//		돈 얼마?
//		return 딸기
//	}
	
//	public Student getStudentInfo() {
//		Student temp = new Student();
//		temp.major="";
//		temp.studentId=3;
//		temp.name="";
//		return temp;
//	}
//	
//	public static void printStudent(Student stu01) {
//	}
//	public static void printStudent(String major, int sid, String name) {
//	}
}

//Student 클래스 -> 객체(인스턴스) -> 필드변수를 활용

class Student{
	private String major; //학과
	private int studentId; //학번
//	private String name; //이름
	//생성자
	public Student() {}
	
	public Student(String major, int studentId) {
		this.major = major;
		this.studentId = studentId;
	}
	
	//
	public String toString() {
		return "학과:" + major + " 학번:" + studentId;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor(){
		return this.major;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
}












