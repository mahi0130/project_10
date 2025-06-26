package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.StaffMemberDAOInt;
import com.rays.dto.StaffMemberDTO;
@Service
@Transactional

public class StaffMemberServiceImpl  extends BaseServiceImpl<StaffMemberDTO, StaffMemberDAOInt>implements StaffMemberServiceInt{
	
	@Transactional(readOnly = true)
	public StaffMemberDTO findByName(String name, UserContext userContext) {
		return baseDao.findByUniqueKey("fullName", name, userContext);
	}

	
}