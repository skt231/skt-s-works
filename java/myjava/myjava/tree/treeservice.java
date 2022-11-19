package myjava.tree;

import java.util.ArrayList;

public class treeservice {
	private Treedao dao=new Treedao();
	
	public void init() {
		dao.init();
	}
	public void insert(Treedto dto) {
		dao.insert(dto);
	}
	public void update(String name, int nowplant) {
		dao.update(name,nowplant);
	}
	public void delete(Integer name) {
		dao.delete(name);
	}
	public ArrayList<Treedto> select(){
		return dao.select();
	}
	public ArrayList<Treedto> select(int nowplant){
		return dao.select(nowplant);
		
	}


}
