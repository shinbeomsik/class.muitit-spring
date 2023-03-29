package com.multi.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Component;

//테이블 하나당 DAO하나! ==> CUD를 완성!!

@Component
public class BookDAO {
	
	
	public ArrayList<BookVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<BookVO> list = new ArrayList<>();

		BookVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "select * from book";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// 삭제!!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색겨로가가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				// 2. 각 컬럼에서 값들을 꺼내오자.
				String id2 = rs.getString(1);// no
				String name = rs.getString(2);// title
				String url2 = rs.getString(3);// content
				String img = rs.getString(4);// writer
				System.out.println(id2 + " " + name + " " + url2 + " " + img);

				// 검색 결과를 검색화면 UI 부분으로 주어야 한다.
				bag = new BookVO();
				bag.setId(id2);
				bag.setName(name);
				bag.setUrl(url2);
				bag.setImg(img);

				// 4. list에 bag을 추가해주자.
				list.add(bag);
			}
			// System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list;

	}

	public BookVO one(String id) {
		ResultSet rs = null;
		BookVO bag = null;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from book where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			rs = ps.executeQuery(); // select문 전송시
			// select의 결과는 항목명+Row 테이블!!

			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음.");
				String id2 = rs.getString(1);// no
				String name = rs.getString(2);// title
				String url2 = rs.getString(3);// content
				String img = rs.getString(4);// writer
				System.out.println(id2 + " " + name + " " + url2 + " " + img);

				// 검색 결과를 검색화면 UI 부분으로 주어야 한다.
				bag = new BookVO();
				bag.setId(id2);
				bag.setName(name);
				bag.setUrl(url2);
				bag.setImg(img);
			} else {
				System.out.println("검색결과 없음.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}

	public void delete(String id) {
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// 자바는 부품조립식이여서, String 에 넣은 문자열을 특정한 부품으로 인식하지 못한다.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야한다.
			// SQL부품으로 만들어주어야 한다.
			// PreparedStatement 가 SQL부품!!

			String sql = "delete from book where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			// con부품으로 sql스트링에 있는것을 SQL부품으로 만들어주기
			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void update(BookVO bag) {

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// 자바는 부품조립식이여서, String 에 넣은 문자열을 특정한 부품으로 인식하지 못한다.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야한다.
			// SQL부품으로 만들어주어야 한다.
			// PreparedStatement 가 SQL부품!!

			String sql = "update book set url = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getUrl());
			ps.setString(2, bag.getId());

			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			ps.executeUpdate(); // insert , update, delete문만가능 sql문 실행결과가 int 이기 떄문에
			System.out.println("4.SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(BookVO bag) {

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// 자바는 부품조립식이여서, String 에 넣은 문자열을 특정한 부품으로 인식하지 못한다.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야한다.
			// SQL부품으로 만들어주어야 한다.
			// PreparedStatement 가 SQL부품!!

			// public void insert(String id, String pw, String name, String tel)
			String sql = "insert into book values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는것을 SQL부품으로 만들어주기
			// R빼고 , 인덱스 0부터 시작!!
			// 유일하게 db은 인덱스가 1부터 시작!!
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getUrl());
			ps.setString(4, bag.getImg());

			// ==> insert into hr.MEMBER values('a','a','a','a'); 이렇게 넣어줌~~

			System.out.println("3. SQL문 부품(객체)으로 만들어기 성공");

			ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
