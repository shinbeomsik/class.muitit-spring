package com.multi.mvc09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//테이블 하나당 DAO하나! ==> CUD를 완성!!

@Component
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
//	public ArrayList<BbsVO> list() {
//		
//		return list;
//
//	}
//
//	public BbsVO one(int no) {
//		
//		return bag;
//	}

	public int delete(int no) {
		
		int result = my.delete("bbs.delete", no);
		return result;

	}

	public int update(BbsVO bag) {
		
		int result = my.update("bbs.update", bag);
		return result;
	}

	public int insert(BbsVO bag) {

			int result = my.delete("bbs.create", bag);
		return result;

	}
	
	public BbsVO one(int no) {
		BbsVO bag = my.selectOne("bbs.one", no);
		return bag;
		
	}

}
