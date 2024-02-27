package com.javaex.controller;

import java.util.List;

import com.javaex.service.GuestbookService;
import com.javaex.vo.GuestbookVo;

//@Controller
public class GuestbookController {

	// 필드
	// 메모리에 올려줘

	// @Autowired
	private GuestbookService guestbookService;

	// 생성자

	// 메소드gs

	// 메소드 일반

	// 등록 리다이렉트 메인폼
	/************************************************************
	 * list --> list 메서드를 통해 전체리스트를 조회 //localhost:8080/guestbook3(여기까지
	 * 공통주소)/guest/alist
	 **********************************************************/
	@RequestMapping(value = "/guest/alist", method = { RequestMethod.GET, RequestMethod.POST })
	public String alist(Model model) {// Model에서attribute에 담아야할때만 써준다. model은 데이터, view는 화면이다.
		System.out.println("GuestbookController.alist()");

		// 자동연결@Autowired
		List<GuestbookVo> guestList = guestbookService.exeSelect();

		model.addAttribute("gList", guestList);// 별명, 진짜 주소

		return "addlist";
	}

	/************************************************************
	 * 등록 --> writeForm 메서드를 통해 연락처를 등록하는 폼을 조회가능
	 ***********************************************************/
	@RequestMapping(value = "/guest/insert", method = { RequestMethod.POST, RequestMethod.GET })
	public String insert(GuestbookVo guestbookVo) {
		System.out.println("GuestbookController.insert");

		System.out.println(guestbookVo.toString());

		guestbookService.exeInsert(guestbookVo);

		return "redirect:/guest/alist";
	}

	/*******************************************************
	 * 삭제--> delete 메서드를 통해 전화번호부에서 선택한 연락처를 삭제
	 *******************************************************/
	// 삭제
	@RequestMapping(value = "/guest/delete", method = { RequestMethod.GET, RequestMethod.POST })
	public String delete(@RequestParam("no") int no, String pw) {// @RequestParam어노테이션을 사용하여 요청 파라미터인 "no"값을 가져오고, 이 값을 int타입의
															// 변수 no에 저장한다.
		System.out.println("GuestbookController.delete()");

		// 넣는 값들 가져와서 vo로 묶기

		
		GuestbookVo guestbookVo = new GuestbookVo(no, pw);
		// 서비스 연결
		guestbookService.exeDelete(guestbookVo);

		// 리다이렉트
		return "redirect:/guest/alist";
	}
	
	/*******************************************************
	 * 삭제폼
	 *******************************************************/
	@RequestMapping(value="/guest/dform", method= {RequestMethod.GET, RequestMethod.POST })
	public String dform() {
		System.out.println("GuestbookController.dform");
		
		
		
		//포워드
		return "deleteForm";
	}

}
