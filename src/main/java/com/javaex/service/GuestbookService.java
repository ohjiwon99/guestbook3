package com.javaex.service;

import java.util.List;

import com.javaex.dao.GuestbookDao;

import com.javaex.vo.GuestbookVo;



public class GuestbookService {
	
	// 필드
		//메모리에 올려줘
	
		private GuestbookDao guestbookDao;

		// 생성자

		// 메소드gs

		// 메소드 일반
		
		//리스트 exeLis --> 전체 연락처 리스트를 조회하는 기능
		public List<GuestbookVo>  exeSelect() {
			System.out.println("GuestbookService. exeSelect()");

			//GuestbookDao guestbookDao = new GuestbookDao();
			List<GuestbookVo> guestList = guestbookDao.GuestSelect();

			return guestList;
		}
		
		// 등록  exeWrite --> 전화번호부에 새로운 연락처를 등록하는 기능
		public int exeInsert(GuestbookVo guestbookVo) {
			//System.out.println("GuestbookService.guestWrite()");

			// 비지니스로직X
		    //GuestbookDao guestbookDao = new GuestbookDao();
			int count = guestbookDao.GuestInsert(guestbookVo);

			return count;
		}

		//삭제 exeDelete --> 메서드는 지정된 번호의 연락처를 삭제하는 기능
		public int exeDelete(GuestbookVo guestbookVo) {
			//System.out.println("GuestbookService.guestDelete()");

			//GuestbookDao guestbookDao = new GuestbookDao();
			int count = guestbookDao.GuestDelete(guestbookVo);

			return count;
		}

	

}
