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
         System.out.println("2. ������ ��ȣ�� ��ȸ");
         System.out.println("3. ������ �߰�");
         System.out.println("4. ������ ����");
         System.out.println("5. ������ ����");
         System.out.println("������ ���� ��ȣ�� �Է����ּ���");
         
         
         int no = sc.nextInt();
         
         switch (no) {
         case 1: menuController.findAllMenus();
            break;
         case 2: menuController.findPostinByNo(inputPostingNo());
            break;
         case 3: menuController.registNewPosting(inputPosting());
            break;
         case 4: menuController.modifyPosting(inputModifyPosting());

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
   
   private static Map<String, String> inputPosting() {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("��α� ��ȣ�� �Է����ּ��� : ");
      String blogNum = sc.nextLine();
      
      System.out.println("������ ������ �Է����ּ��� : ");
      String postingTitle = sc.nextLine();
      
      System.out.println("������ ������ �Է����ּ��� : ");
      String postringContent = sc.nextLine();
      
      System.out.println("ī�װ� �ڵ带 �Է����ּ��� : ");
      String categoryNo = sc.nextLine();
      
      Map<String, String> parameter = new HashMap<>();
      parameter.put("blogNum" , blogNum);
      parameter.put("postingTitle", postingTitle);
      parameter.put("postringContent", postringContent);
      parameter.put("categoryNo", categoryNo);
      
      return parameter;
   }
   
   private static Map<String, String> inputModifyPosting() {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("������ ������ ������ �Է����ּ��� : ");
      String postingTitle = sc.nextLine();
      
      System.out.println("������ ������ ������ �Է����ּ��� : ");
      String postringContent = sc.nextLine();
      
      System.out.println("������ ī�װ� �ڵ带 �Է����ּ��� : ");
      String categoryNo = sc.nextLine();
      
      Map<String, String> parameter = new HashMap<>();
      parameter.put("postingTitle", postingTitle);
      parameter.put("postringContent", postringContent);
      parameter.put("categoryNo", categoryNo);
      
      return parameter;
   }

}