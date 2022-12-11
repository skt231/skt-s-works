package d23;

//Television클래스
public class GoodTelovision extends Television implements Searchable { // 리모트컨트롤,서치
	@Override
	public void search(String keyword) {
		System.out.println("굿티비" + keyword +"키워드를 검색합니다.");
		
	}

	int smartModuleCount; // 스마트 모듈 개수

	GoodTelovision(String brand, int inch, int smartModuleCount) {
		super(brand, inch);
		this.smartModuleCount=smartModuleCount;
	}

}
