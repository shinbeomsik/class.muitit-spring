package com.multi.mvc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class GradeDAO {

	public int insert(GradeVO bag) {
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mySQL과 자바 연결할 부품 설정");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "insert into grade(subject,score,name,img) values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getSubject());
			ps.setInt(2, bag.getScore());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getImg());

			System.out.println("SQL문 부품으로 만들어주기 성공");

			result = ps.executeUpdate();
			System.out.println("SQL문 오라클로 보내기성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int update(GradeVO bag) {
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mySQL과 자바 연결할 부품 설정");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "update grade set score = ? where id =? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, bag.getScore());
			ps.setInt(2, bag.getId());

			System.out.println("SQL문 부품으로 만들어주기 성공");

			result = ps.executeUpdate();
			System.out.println("SQL문 오라클로 보내기성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int delete(GradeVO bag) {
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mySQL과 자바 연결할 부품 설정");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "delete from grade where id =? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, bag.getId());

			System.out.println("SQL문 부품으로 만들어주기 성공");

			result = ps.executeUpdate();
			System.out.println("SQL문 오라클로 보내기성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public GradeVO one(int id) {
		GradeVO bag = null;

		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mySQL과 자바 연결할 부품 설정");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("mySQL 연결 성공");

			String sql = "select * from grade where id =? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			System.out.println("SQL문 부품으로 만들어주기 성공");

			rs = ps.executeQuery();
			System.out.println("SQL문 오라클로 보내기성공");

			if (rs.next()) {
				System.out.println("검색결과있음");
				int id2 = rs.getInt(1);
				String subject = rs.getString(2);
				int score = rs.getInt(3);
				String name = rs.getString(4);
				String img = rs.getString(5);

				bag = new GradeVO();
				bag.setId(id2);
				bag.setSubject(subject);
				bag.setScore(score);
				bag.setName(name);
				bag.setImg(img);

			} else {
				System.out.println("검색결과 없음");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}

	public ArrayList<GradeVO> list() {
		ResultSet rs = null;
		GradeVO bag = null;

		ArrayList<GradeVO> list = new ArrayList<GradeVO>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mySQL과 자바 연결할 부품 설정");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("mySQL 연결 성공");

			String sql = "select * from grade";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("SQL문 부품으로 만들어주기 성공");

			rs = ps.executeQuery();
			System.out.println("SQL문 오라클로 보내기성공");

			while(rs.next()) {
				
				int id2 = rs.getInt(1);
				String subject = rs.getString(2);
				int score = rs.getInt(3);
				String name = rs.getString(4);
				String img = rs.getString(5);

				bag = new GradeVO();
				bag.setId(id2);
				bag.setSubject(subject);
				bag.setScore(score);
				bag.setName(name);
				bag.setImg(img);
				
				list.add(bag);
			}
			ps.close();
			rs.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<GradeVO> list2(String name) {
		ResultSet rs = null;
		GradeVO bag = null;

		ArrayList<GradeVO> list = new ArrayList<GradeVO>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mySQL과 자바 연결할 부품 설정");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("mySQL 연결 성공");

			String sql = "select * from grade where name like ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" + name + "%");
			
			System.out.println("SQL문 부품으로 만들어주기 성공");

			rs = ps.executeQuery();
			System.out.println("SQL문 오라클로 보내기성공");

			while(rs.next()) {
				
				int id2 = rs.getInt(1);
				String subject = rs.getString(2);
				int score = rs.getInt(3);
				String name2 = rs.getString(4);
				String img = rs.getString(5);

				bag = new GradeVO();
				bag.setId(id2);
				bag.setSubject(subject);
				bag.setScore(score);
				bag.setName(name2);
				bag.setImg(img);
				
				list.add(bag);
			}
			ps.close();
			rs.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}




}
