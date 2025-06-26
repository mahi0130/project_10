package com.rays.ctl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.StaffMemberDTO;
import com.rays.form.StaffMemberForm;
import com.rays.service.StaffMemberServiceInt;

@RestController
@RequestMapping(value = "Staff") 
public class StaffMemberCtl extends BaseCtl<StaffMemberForm, StaffMemberDTO, StaffMemberServiceInt>{
	@Autowired
	private StaffMemberServiceInt staffmemberserviceint;
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		StaffMemberDTO dto = new StaffMemberDTO();
		
		List<DropdownList> list = staffmemberserviceint.search(dto, userContext);
		res.addResult("stafflist", list);
		return res;
	}

	@GetMapping("name/{name}")
	public ORSResponse get(@PathVariable String name) {
		ORSResponse res = new ORSResponse(true);
		StaffMemberDTO dto = baseService.findByName(name, userContext);
		
		if (dto != null) {
			res.addData(dto);
		} else {
			res.setSuccess(false);
			res.addMessage("Record not found");
		}
		return res;
	}
	
}