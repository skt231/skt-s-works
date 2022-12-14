package ex_AudioEquipment.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import ex_AudioEquipment.dto.Adiodto;
import ex_AudioEquipment.Utill.DBConn;

public class Adiodao {
	@SuppressWarnings("rawtypes")
	ArrayList<Adiodto> dtos = new ArrayList<Adiodto>();
	private String brand;

	// 데이터 초기화값
	public void init() {
//		dtos.add(new Adiodto("1000XM4", "SONY", 250.0, "Y", "Y",
//				LocalDateTime.parse("2001-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
//		dtos.add(new Adiodto("H2", "QCY", 350.3, "Y", "O",
//				LocalDateTime.parse("2001-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
//		dtos.add(new Adiodto("WH-1000XM4", "SONY", 254.0, "Y", "M",
//				LocalDateTime.parse("2020-08-12 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
//		dtos.add(new Adiodto("airpod-max", "APPLE", 384.8, "Y", "M",
//				LocalDateTime.parse("2021-01-04 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
//		dtos.add(new Adiodto("HD-600", "젠하이저", 260.0, "N", "O",
//				LocalDateTime.parse("2003-01-18 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
		
		//1번데이터
//		Adiodto<LocalDateTime> dto = new Adiodto<LocalDateTime>("1000XM5", "SONY", 250.0, "Y", "Y",
//				LocalDateTime.parse("2022-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//		String sql = String.format(
//				"insert into AudioEquipment values("
//				+ "'%s',%s,%f,%s,%s,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
//				dto.getName(), dto.getBrand(), dto.getWeight(), dto.getBluetooth(), dto.getUnit(),
//				dto.getProductdate().format(
//						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//		DBConn.statementUpdate(sql);
		
		//2반
		Adiodto<LocalDateTime> dto = new Adiodto<LocalDateTime>("H2", "QCY", 350.3, "Y", "O",
				LocalDateTime.parse("2021-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		String sql = String.format("insert into AudioEquipment values('%s',%s,%f,%s,%s,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getBrand(), dto.getWeight(), dto.getBluetooth(), dto.getUnit(),
				dto.getProductdate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
		
		//
		dto = new Adiodto<LocalDateTime>("1000XM4", "SONY", 254.0, "Y", "Y",
				LocalDateTime.parse("2019-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		sql = String.format("insert into AudioEquipment values('%s',%s,%f,%s,%s,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getBrand(), dto.getWeight(), dto.getBluetooth(), dto.getUnit(),
				dto.getProductdate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
		
		//
		dto = new Adiodto<LocalDateTime>("airpod-max", "apple", 384.0, "Y", "M",
				LocalDateTime.parse("2021-06-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		sql = String.format("insert into AudioEquipment values('%s',%s,%f,%s,%s,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getBrand(), dto.getWeight(), dto.getBluetooth(), dto.getUnit(),
				dto.getProductdate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
		
		//
		dto = new Adiodto<LocalDateTime>("HD-600", "젠하이저", 260.0, "N", "O",
				LocalDateTime.parse("2003-04-01 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		sql = String.format("insert into AudioEquipment values('%s',%s,%f,%s,%s,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getBrand(), dto.getWeight(), dto.getBluetooth(), dto.getUnit(),
				dto.getProductdate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);

	}

	// insert
	public void insert(Adiodto<?> dto) {
		String sql = String.format(
				"insert into AudioEquipment values('%s',%s,%f,%s,%s,to_date('%s','YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getBrand(), dto.getWeight(), dto.getBluetooth(), dto.getUnit(),
				((LocalDateTime) dto.getProductdate()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
	}

	// update
	public void update(String name, String brand) {
//		for(int i=0;i<dtos.size();i++) {
//			if(dtos.get(i).getName().equals(name)) {
//				dtos.get(i).setBrand(brand);
//				dtos.get(i).setName(name);
//				i--;

//			}
//		}
		DBConn.statementUpdate(String.format("update AudioEquipment set brand=%d where name='%s'", name, brand));
	}

	// delete
	public void delete(String name) {
//		for (int i = 0; i < dtos.size(); i++) {
//			if (dtos.get(i).getName().equals(name)) {
//				dtos.remove(i);
//				i--;

//			}
//		}
		DBConn.statementUpdate(String.format("delete AudioEquipment where name= ", name));
	}

	public ArrayList<Adiodto> select() {
		ArrayList<Adiodto> resultDtos = new ArrayList<Adiodto>();
//		for (Adiodto dto : dtos) {
//			resultDtos.add(new Adiodto(dto.getName(), dto.getBrand(), dto.getWeight(), dto.getUnit(),
//					dto.getBluetooth(), dto.getProductdate()));
//		}
		ResultSet rs = DBConn.statementQuery(String.format("select * from AudioEquipment"), brand);

		try {
			while (rs.next()) {
//String name, String brand, Double weight, String unit, Object bluetooth, LocalDateTime proDateTime
				resultDtos.add(new Adiodto<LocalDateTime>(rs.getString("name"), rs.getString("brand"), rs.getDouble("weight"),
						rs.getString("Unit"), rs.getString("bluetooth"),
						rs.getTimestamp("productdate").toLocalDateTime()));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultDtos;
	}

	public ArrayList<Adiodto> select(String brand) {
		// 브랜드별로 출력
		ArrayList<Adiodto> resultDtos = new ArrayList<Adiodto>();
//		for (int i = 0; i < dtos.size(); i++)  {
//			if(dtos.get(i).getBrand().equals(brand)) {
//				resultDtos.add(new Adiodto(dtos.get(i).getName(), 
//						dtos.get(i).getBrand(), 
//						dtos.get(i).getWeight(),
//						dtos.get(i).getUnit(),
//						dtos.get(i).getBluetooth(),
//						dtos.get(i).getProductdate()));
//			}
//		}
//		
//		return resultDtos;
		ResultSet rs = DBConn.statementQuery("select * from AudioEquipment where brand=%d", brand);

		try {
			while (rs.next()) {
				resultDtos.add(new Adiodto<LocalDateTime>(rs.getString("name"), rs.getString("brand"), rs.getDouble("weight"),
						rs.getString("bluetooth"), rs.getString("Unit"),
						rs.getTimestamp("productdate").toLocalDateTime()));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultDtos;

	}

}
