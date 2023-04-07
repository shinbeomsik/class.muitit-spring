package com.multi.mvc08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MemberDAO3 { // CRUD
	
	//mybatis 싱글톤 객체를 찾아서 주소를 넣어주세요.
	@Autowired
	SqlSessionTemplate my;
	
//	public int login(MemberVO bag) {
//	
//		
//		return result;
//	}
//	
//	public ArrayList<MemberVO> list() {
//		
//		return list;
//	}
//
//	public MemberVO one(String id) {
//		
//		return bag;
//	}
//	
	public int delete(String id) {
		int result =my.delete("member.delete", id);
		return result;
	}

	public int update(MemberVO bag) {
	int result = my.update("member.update", bag);
		return result;
	}

	public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		//    memberMapper에있는        ㄴ namespace.id 를써야한다
		return result;
	}
}
