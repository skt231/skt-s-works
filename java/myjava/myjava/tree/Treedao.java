package myjava.tree;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Treedao {

	public void init() {
		LocalDateTime now = LocalDateTime.now();
		Treedto dto = new Treedto("Mango", 200,
				LocalDateTime.parse(UserInput.dateToString(now), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), 4, 7,
				50);
		String sql = String.format(
				"insert into tree values('%s','%d',to_date('%s','YYYY-MM-DD HH24:MI:SS'),'%d','%d','%d')",
				dto.getName(), dto.getPrice(), UserInput.dateToString(dto.getGrowtime()), dto.getExp(), dto.getNowplant(), dto.getMaxplant());
		DBConn.statementUpdate(sql);
		dto = new Treedto("Papaya", 375,
				LocalDateTime.parse(UserInput.dateToString(now), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), 6, 6,
				50);
		sql = String.format("insert into tree values('%s',%d,to_date('%s','YYYY-MM-DD HH24:MI:SS'),%d,%d,%d)",
				dto.getName(), dto.getPrice(), UserInput.dateToString(dto.getGrowtime()), dto.getExp(), dto.getNowplant(), dto.getMaxplant());
		DBConn.statementUpdate(sql);
		dto = new Treedto("Mango", 200,
				LocalDateTime.parse(UserInput.dateToString(now), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), 5, 7,
				50);
		sql = String.format("insert into tree values('%s',%d,to_date('%s','YYYY-MM-DD HH24:MI:SS'),%d,%d,%d)",
				dto.getName(), dto.getPrice(), UserInput.dateToString(dto.getGrowtime()), dto.getExp(), dto.getNowplant(), dto.getMaxplant());
		DBConn.statementUpdate(sql);
		dto = new Treedto("Mango", 200,
				LocalDateTime.parse(UserInput.dateToString(now), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), 8, 1,
				50);
		sql = String.format("insert into tree values('%s',%d,to_date('%s','YYYY-MM-DD HH24:MI:SS'),%d,%d,%d)",
				dto.getName(), dto.getPrice(), UserInput.dateToString(dto.getGrowtime()), dto.getExp(), dto.getNowplant(), dto.getMaxplant());
		DBConn.statementUpdate(sql);
	}

	// insert
	public void insert(Treedto dto) {
		String sql = String.format(
				"insert into tree values('%s',%d,to_date(" + "'%s','YYYY-MM-DD HH24:MI:SS')),%d,%d,%d)",
				dto.getName(), dto.getPrice(), dto.getGrowtime(), dto.getExp(), dto.getNowplant(), dto.getMaxplant());
		DBConn.statementUpdate(sql);
	}

	// update
	public void update(String name, Integer nowplant) {
		DBConn.statementUpdate(String.format("update tree set nowplant=%d where name='%s'", name, nowplant));
	}

	// delete
	public void delete(Integer nowplant) {
		DBConn.statementUpdate(String.format("delete from tree where nowplant='%s'", nowplant));
	}

	// select()
	public ArrayList<Treedto> select() {
		String sql = "select * from tree";

		ArrayList<Treedto> resultDtos = new ArrayList<Treedto>();
		ResultSet rs = DBConn.statementQuery(sql);
//		ArrayList<HumanDto> dtos_c = (ArrayList<HumanDto>) DBConn.statementQuery(sql);

		try {
			while (rs.next()) {
				resultDtos.add(new Treedto(rs.getString("name"), rs.getInt("price"),
						rs.getTimestamp("growtime").toLocalDateTime(), rs.getInt("exp"),
						rs.getInt("nowplant"), rs.getInt("maxplant")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultDtos;

	}

	public  ArrayList<Treedto> select(int nowplant) {
		String sql = String.format("select * from tree where price > %d",nowplant);

		ArrayList<Treedto> resultDtos = new ArrayList<Treedto>();
		ResultSet rs = DBConn.statementQuery(sql);
		try {
			while(rs.next()) {
				resultDtos.add(new Treedto(rs.getString("name"),rs.getInt("nowplant"),
						rs.getTimestamp("growtime").toLocalDateTime(),rs.getInt("exp"),
						rs.getInt("nowplant"),rs.getInt("maxplant")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultDtos;
	}

}
