package com.greedy.crud.config.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import static com.greedy.crud.config.common.Template.getSession;

import com.greedy.crud.config.DTO.MenuDTO;
import com.greedy.crud.config.DTO.ModifyMenuDTO;
import com.greedy.crud.config.dao.MenuDAO;

public class MenuService {

   public List<MenuDTO> findAllMenus() {
      
      SqlSession sqlSession = getSession();
      
      MenuDAO menuDAO = sqlSession.getMapper(MenuDAO.class);
      List<MenuDTO> menus = menuDAO.selectAllMenu();
      
      sqlSession.close();
      
      return menus;
   }

   public MenuDTO findPostinByNo(String num) {
      
      SqlSession sqlSession = getSession();
      
      MenuDAO menuDAO = sqlSession.getMapper(MenuDAO.class);
      
      MenuDTO menu = menuDAO.selectPostinByNo(num);
      
      sqlSession.close();
      
      return menu;
   }

   public boolean registNewPosting(MenuDTO menu) {
      
      SqlSession sqlSession = getSession();
      
      MenuDAO menuDAO = sqlSession.getMapper(MenuDAO.class);
      int result = menuDAO.insertPosting(menu);
      
      if(result > 0) {
         sqlSession.commit();
      }else {
         sqlSession.rollback();
      }
      sqlSession.close();
      
      return result > 0 ? true:false;
   }

   public int modifyPosting(ModifyMenuDTO menuDTO) {
      
      SqlSession sqlSession = getSession();
      MenuDAO menuDAO = sqlSession.getMapper(MenuDAO.class);
      int result = menuDAO.modifyPosting(menuDTO);
      
      if(result > 0) {
         sqlSession.commit();
      }else {
         sqlSession.rollback();
      }
      
      sqlSession.close();
      return result;
   }

   public int removePosting(String num) {

      SqlSession sqlSession = getSession();
      MenuDAO menuDAO = sqlSession.getMapper(MenuDAO.class);
      
      int result = menuDAO.removePosting(num);
      
      if(result > 0) {
         sqlSession.commit();
      }else {
         sqlSession.rollback();
      }
      
      sqlSession.close();
      return result;
   }


}