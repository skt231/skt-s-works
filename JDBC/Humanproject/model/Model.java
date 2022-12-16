package model;

import java.util.HashMap;

//1. MVC패턴을 만들때 많은 메소드들이 사용되는데 동일한 모양으로 
// 메소드를 호출에서 데이터를 주고 받기 위해서 
//매개변수를 map을 이용한 Model 클래스로 작성한다. 

//a(int) a(Arraylist) a(name,height)
//a(Model)

//Model = map+추가기능들
public class Model {
	private HashMap<String,Object> hashmap=new HashMap<String,Object>();
	
	public void setAttribute(String key,Object value) {
		hashmap.put(key, value);
	}
	public Object getAttribute(String key) {
		return hashmap.get(key);
	}
	public void removeAttribute(String key) {
		hashmap.remove(key);
	}

}











