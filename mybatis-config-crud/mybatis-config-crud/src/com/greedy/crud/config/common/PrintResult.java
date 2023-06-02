package com.greedy.crud.config.common;

import java.util.List;

import com.greedy.crud.config.DTO.MenuDTO;

public class PrintResult {

	public void prinMenuList(List<MenuDTO> menuList) {
		for(MenuDTO menu : menuList) {
			System.out.println(menu);
		}
	}

	public void printErrorMessage(String string) {
		if(string.equals("findAllMenus")) {
			System.out.println("포스팅 조회에 실패하였습니다.");
		}else if(string.equals("findPostinByNo")) {
			System.out.println("해당 포스팅 번호는 존재하지 않습니다.");
		}
		
	}

	public void printMenu(MenuDTO menu) {
		
		System.out.println(menu);
	}

}
