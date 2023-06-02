package com.greedy.crud.config.dao;

import java.util.List;

import com.greedy.crud.config.DTO.MenuDTO;

public interface MenuDAO {
	
	List<MenuDTO> selectAllMenu();

	MenuDTO selectPostinByNo(String num);
	

}
