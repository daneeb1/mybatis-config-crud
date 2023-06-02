package com.greedy.crud.config.controller;

import java.util.List;
import java.util.Map;

import com.greedy.crud.config.DTO.MenuDTO;
import com.greedy.crud.config.common.PrintResult;
import com.greedy.crud.config.service.MenuService;

public class MenuController {
	
	private final MenuService menuService;
	private final PrintResult printResult;
	
	public MenuController() {
		this.menuService = new MenuService();
		this.printResult = new PrintResult();
	}
	
	public void findAllMenus() {
		List<MenuDTO> menuList =menuService.findAllMenus();
		
		if(menuList != null) {
			printResult.prinMenuList(menuList);
		}else {
			printResult.printErrorMessage("findAllMenus");
		}
	}

	public void findPostinByNo(Map<String, String> inputPostingNo) {
		String num = inputPostingNo.get("num");
		
		MenuDTO menu = menuService.findPostinByNo(num);
		if(menu == null) {
			printResult.printErrorMessage("findPostinByNo");
		}else {
			printResult.printMenu(menu);
		}
		
	}

	

}
