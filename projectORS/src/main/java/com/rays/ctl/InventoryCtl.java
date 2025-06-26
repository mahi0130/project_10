
package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.InventoryDTO;
import com.rays.form.InventoryForm;
import com.rays.service.InventoryServiceInt;

@RestController
@RequestMapping(value = "Inventory")
public class InventoryCtl extends BaseCtl<InventoryForm, InventoryDTO, InventoryServiceInt> {

	@Autowired
	private InventoryServiceInt inventoryService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		InventoryDTO dto = new InventoryDTO();
		List<DropdownList> list = inventoryService.search(dto, userContext);
		res.addResult("inlist", list);
		return res;
	}

}
