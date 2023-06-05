package com.greedy.crud.config.controller;

import java.util.List;
import java.util.Map;

import com.greedy.crud.config.DTO.MenuDTO;
import com.greedy.crud.config.DTO.ModifyMenuDTO;
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

   public void registNewPosting(Map<String, String> inputPosting) {
      String blogNum = inputPosting.get("blogNum");
      String postingTitle = inputPosting.get("postingTitle");
      String postringContent = inputPosting.get("postringContent");
      String categoryNo = inputPosting.get("categoryNo");
      
      MenuDTO menu = new MenuDTO();
      menu.setBlogNum(blogNum);
      menu.setPostingTitle(postingTitle);
      menu.setPostringContent(postringContent);
      menu.setCategoryNo(categoryNo);
      
      if (menuService.registNewPosting(menu)) {
         printResult.printSuccessMessage("registNewPosting");
      } else {
         printResult.printErrorMessage("registNewPosting");

      }
   }

   public void modifyPosting(Map<String, String> inputModifyPosting) {
      ModifyMenuDTO menuDTO = new ModifyMenuDTO();
      menuDTO.setPostingTitle(inputModifyPosting.get("postingTitle"));
      menuDTO.setPostringContent(inputModifyPosting.get("postringContent"));
      menuDTO.setCategoryNo(inputModifyPosting.get("categoryNo"));
      int result = menuService.modifyPosting(menuDTO);
      
      if(result > 0) {
         printResult.printSuccessMessage("modifyPosting");
      }else {
         printResult.printErrorMessage("notmodifyPosting");
      }      
   }
   
   public void removePosting(Map<String, String> inputPostingNo) {
      String num = inputPostingNo.get("num");

      int result = menuService.removePosting(num);
      
      if(result > 0) {
         printResult.printSuccessMessage("removePosting");
      }else {
         printResult.printErrorMessage("notremove");
      }
   }

   

}