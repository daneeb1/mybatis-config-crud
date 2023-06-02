package com.greedy.crud;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.greedy.crud.config.controller.MenuController;

public class Application01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MenuController menuController = new MenuController();
		
		do {
			System.out.println("============메뉴 관리============");
			System.out.println("1. 블로그 전체조회");
			System.out.println("2. 블로그 포스팅번호로 조회");
			
			
			int no = sc.nextInt();
			
			switch (no) {
			case 1: menuController.findAllMenus();
				break;
			case 2: menuController.findPostinByNo(inputPostingNo());
				break;

			default: System.out.println("잘못됐습니다.");
				break;
			}
		}while(true);
	}

	private static Map<String, String> inputPostingNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("포스팅 번호를 입력해주세요 : ");
		String num = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put("num", num);
		return parameter;
	}

}
