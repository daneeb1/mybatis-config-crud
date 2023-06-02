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
			System.out.println("============�޴� ����============");
			System.out.println("1. ��α� ��ü��ȸ");
			System.out.println("2. ��α� �����ù�ȣ�� ��ȸ");
			
			
			int no = sc.nextInt();
			
			switch (no) {
			case 1: menuController.findAllMenus();
				break;
			case 2: menuController.findPostinByNo(inputPostingNo());
				break;

			default: System.out.println("�߸��ƽ��ϴ�.");
				break;
			}
		}while(true);
	}

	private static Map<String, String> inputPostingNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��ȣ�� �Է����ּ��� : ");
		String num = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put("num", num);
		return parameter;
	}

}
