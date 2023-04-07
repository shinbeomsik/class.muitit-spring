package com.multi.mvc08;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //스프링에서 제어하는 역할로 등록! 
public class MemberController {
	
	@Autowired 
	// MemberDAO의 싱글톤 객체 RAM의 어디에 있는지 찾아서 그 주소를 아래 변수에 넣어주세요라는의미
	MemberDAO3 dao; // 전역변수(글로벌변수)
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드(기능처리 담당)
	//하나의 요청당 하나의 메서드
	//하나의 버튼호출당 하나의 함수 연결!
	//요청된 주소가 어떻게 될 때
	//바로 아래에 있는 메서드가 호출이 될지를
	//써주어야 한다. 
	
	/*
	 * @RequestMapping("login") public String login(MemberVO bag, HttpSession
	 * session) { System.out.println(bag); //dao를 이용해서 db처리할 예정 //views 아래로 넘어가게
	 * 되어있음 //views 아래에 login.jsp를 호출하게됨 //int result = dao.login(bag); // 0, 1 if
	 * (result ==1) { //로그인이 성공하면 세션을 잡아두자 session.setAttribute("id", bag.getId());
	 * return "ok"; //views아래 파일이름 jsp를 찾는다 }else { //views 아래가 아니고, webapp아래
	 * //member.jsp로 가고싶은 경우! return "redirect:Member.jsp"; }
	 * 
	 * }
	 */
	
	@RequestMapping("insert")
	public String insert(MemberVO bag) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		//MemberDAO dao = new MemberDAO();
		//dao에게 insert요청!!
		int result =  dao.insert(bag);
		if (result == 1) {
			return "insert";
		} else {
			System.out.println("초기화면으로");
			return "redirect:book.jsp";
		}
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete요청됨.");
		System.out.println(id);
		dao.delete(id);
		
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		//MemberVO bag = dao.one(id);
	//	model.addAttribute("bag",bag);
	}
	
	/*
	 * @RequestMapping("jsonResponse3")
	 * 
	 * @ResponseBody public MemberVO one2(String id) {
	 * System.out.println("one요청됨."); System.out.println(id); //MemberVO bag =
	 * dao.one(id);
	 * 
	 * //return bag; }
	 */
	
	@RequestMapping("list")
	public void list(Model model) {
		//Model은 컨트롤러의 list를 views에 있는 list.jsp까지 전달할수 있는 객체
		// ArrayList<MemberVO> list = dao.list();
		// model.addAttribute("list", list);
	}
	
	
	@RequestMapping("one5")
	public void one5(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		//MemberVO bag = dao.one(id);
	//	model.addAttribute("bag",bag);
	}

	@RequestMapping("list7")
	public void list7(Model model) {
		//Model은 컨트롤러의 list를 views에 있는 list.jsp까지 전달할수 있는 객체
		// ArrayList<MemberVO> list = dao.list();
	//	 model.addAttribute("list", list);
	}
	
	/*
	 * @RequestMapping("jsonResponse4")
	 * 
	 * @ResponseBody public ArrayList<MemberVO> list8() { //Model은 컨트롤러의 list를
	 * views에 있는 list.jsp까지 전달할수 있는 객체 // ArrayList<MemberVO> list = dao.list();
	 * 
	 * // return list; }
	 */
	
	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
	
	
	
	
	
}
