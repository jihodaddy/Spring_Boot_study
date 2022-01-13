package com.boot.projectEx.service;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestParam;

import com.boot.projectEx.model.MemberVO;

public interface IMemberService {
	MemberVO loginCheck(HashMap<String, Object>map);
	public String memIdCheck(String memId);
	
}
