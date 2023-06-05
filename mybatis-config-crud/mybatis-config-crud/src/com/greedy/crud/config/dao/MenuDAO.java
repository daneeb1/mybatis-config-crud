package com.greedy.crud.config.dao;

import java.util.List;

import com.greedy.crud.config.DTO.MenuDTO;
import com.greedy.crud.config.DTO.ModifyMenuDTO;

public interface MenuDAO {
   
   List<MenuDTO> selectAllMenu();

   MenuDTO selectPostinByNo(String num);

   int insertPosting(MenuDTO menu);

   int modifyPosting(ModifyMenuDTO menuDTO);

   int removePosting(String num);
   
}