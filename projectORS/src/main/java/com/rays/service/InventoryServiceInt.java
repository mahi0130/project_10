package com.rays.service;

import com.rays.common.BaseServiceInt;

import com.rays.common.UserContext;
import com.rays.dto.InventoryDTO;

public interface InventoryServiceInt extends BaseServiceInt<InventoryDTO> {

	public InventoryDTO findByName(String name, UserContext userContext);
}