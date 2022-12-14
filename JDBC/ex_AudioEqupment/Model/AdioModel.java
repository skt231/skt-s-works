package ex_AudioEquipment.Model;

import java.util.HashMap;

public class AdioModel {

	HashMap<String, Object> hashMap = new HashMap<String, Object>();

	public void setAttribute(String key, Object values) {
		hashMap.put(key, values);
	}

	public Object getAttribute(String key) {
		return hashMap.get(key);
	}

	public Object removeAttribute(String key) {
		return hashMap.remove(key);
	}

}
