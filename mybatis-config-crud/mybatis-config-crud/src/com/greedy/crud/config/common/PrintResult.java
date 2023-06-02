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
			System.out.println("������ ��ȸ�� �����Ͽ����ϴ�.");
		}else if(string.equals("findPostinByNo")) {
			System.out.println("�ش� ������ ��ȣ�� �������� �ʽ��ϴ�.");
		}
		
	}

	public void printMenu(MenuDTO menu) {
		
		System.out.println(menu);
	}

}
