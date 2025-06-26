package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.StaffMemberDTO;

public interface StaffMemberServiceInt  extends BaseServiceInt<StaffMemberDTO>{
	public StaffMemberDTO findByName(String name, UserContext userContext);
}