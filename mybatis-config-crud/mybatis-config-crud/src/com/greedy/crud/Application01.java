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
         System.out.println("2. 포스팅 번호로 조회");
         System.out.println("3. 포스팅 추가");
         System.out.println("4. 포스팅 수정");
         System.out.println("5. 포스팅 삭제");
         System.out.println("포스팅 관리 번호를 입력해주세요");
         
         
         int no = sc.nextInt();
         
         switch (no) {
         case 1: menuController.findAllMenus();
            break;
         case 2: menuController.findPostinByNo(inputPostingNo());
            break;
         case 3: menuController.registNewPosting(inputPosting());
            break;
         case 4: menuController.modifyPosting(inputModifyPosting());

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
   
   private static Map<String, String> inputPosting() {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("블로그 번호를 입력해주세요 : ");
      String blogNum = sc.nextLine();
      
      System.out.println("포스팅 제목을 입력해주세요 : ");
      String postingTitle = sc.nextLine();
      
      System.out.println("포스팅 내용을 입력해주세요 : ");
      String postringContent = sc.nextLine();
      
      System.out.println("카테고리 코드를 입력해주세요 : ");
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
      System.out.println("수정할 포스팅 제목을 입력해주세요 : ");
      String postingTitle = sc.nextLine();
      
      System.out.println("수정할 포스팅 내용을 입력해주세요 : ");
      String postringContent = sc.nextLine();
      
      System.out.println("수정할 카테고리 코드를 입력해주세요 : ");
      String categoryNo = sc.nextLine();
      
      Map<String, String> parameter = new HashMap<>();
      parameter.put("postingTitle", postingTitle);
      parameter.put("postringContent", postringContent);
      parameter.put("categoryNo", categoryNo);
      
      return parameter;
   }

}