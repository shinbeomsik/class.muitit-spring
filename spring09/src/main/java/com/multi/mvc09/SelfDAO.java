package com.multi.mvc09;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SelfDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	
	public int insert(SelfVO bag) {
		 int result =  my.insert("self.create", bag);
		return result;
		
	}
	
	public int update(SelfVO bag) {
		int result = my.update("self.update", bag);
		return result;
	}
	
	public int delete(String id) {
		int result = my.delete("self.delete", id);
		return result;
	}
	
	public SelfVO one(String id) {
		SelfVO bag = my.selectOne("self.one", id);
		return bag;
	}
	
	public List<SelfVO> list() {
		List<SelfVO> list = my.selectList("self.all");
		return list;
	}
	
}
