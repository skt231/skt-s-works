package service;

import java.util.ArrayList;

import dao.HumanDao;
import dto.HumanDto;

//1. dao작업
//2. 비즈니스(business)작업  핵심작업
public class HumanService {
	private HumanDao dao=new HumanDao();
	
	public void init() {
		dao.init();
	}

	public void insert(HumanDto dto) {
		dao.insert(dto);
	}
	
	public void update(String name,int age) {
		dao.update(name, age);
	}
	public void delete(int age) {
		dao.delete(age);
	}
	
	public ArrayList<HumanDto> select(){
		return dao.select();
	}
	public ArrayList<HumanDto> select(double height){
		return dao.select(height);
	}
	
	
	

}














