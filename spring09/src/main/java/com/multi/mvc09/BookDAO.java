package com.multi.mvc09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//테이블 하나당 DAO하나! ==> CUD를 완성!!

@Component
public class BookDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<BookVO> list() {
		List<BookVO> list = my.selectList("book.all");
		return list;
	}

	public BookVO one(String id) {
		BookVO bag =  my.selectOne("book.one", id);
		return bag;
	}

	public int delete(String id) {
		int result = my.delete("book.delete",id);
		return result;
	}

	public int update(BookVO bag) {
		int result = my.update("book.update",bag);
		return result;
	}

	public int insert(BookVO bag) {
		int result = my.insert("book.create", bag);
		return result;
	}

}
