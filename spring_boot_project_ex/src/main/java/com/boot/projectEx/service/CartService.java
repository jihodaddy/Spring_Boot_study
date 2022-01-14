package com.boot.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.boot.projectEx.dao.ICartDAO;
import com.boot.projectEx.model.CartVO;
import com.boot.projectEx.model.MemberVO;

@Service
public class CartService implements ICartService {
	@Autowired
	@Qualifier("ICartDAO")
	ICartDAO dao;

	@Override
	public void insertCart(CartVO vo) {
		dao.insertCart(vo);
	}

	@Override
	public int checkPrdInCart(String prdNo, String memId) {
		//전달 받은 pdfNo와 memI를 map에 넣어 Mapper에게 전달
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("prdNo", prdNo);
		map.put("memId", memId);
		
		return dao.checkPrdInCart(map);
	}

	@Override
	public void updateQtyInCart(CartVO vo) {
		// TODO Auto-generated method stub
		dao.updateQtyInCart(vo);
	}

	@Override
	public ArrayList<CartVO> cartList(String memId) {
		// TODO Auto-generated method stub
		return dao.cartList(memId);
	}
	
	//주문 처리 작업
	@Override
	public void updateCart(CartVO vo) { //장바구니 수정
			
	}
	@Override
	public void deleteCart(String cartNo) { //장바구니 삭제
			dao.deleteCart(cartNo);
	}
	@Override
	public MemberVO getMemberInfo(String memId) { //주문서에 사용할 회원정보 알아오기
		
		return null;
	}
		

}
