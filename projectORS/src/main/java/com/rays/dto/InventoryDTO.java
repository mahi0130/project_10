package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;


@Entity
@Table(name = "ST_INVENTORY")
public class InventoryDTO extends BaseDTO {

	
	@Column(name = "SUPPLIER_NAME", length = 50)
	private String supplierName;
	
	@Column(name = "LASTUPDATEDDATE")
	private Date lastUpdatedDate;
	
	@Column(name = "QUANTITY")
	private Long quantity;
	
	@Column(name = "PRODUCT")
	private String product;

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	
	public String getKey() {
		return product;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return product ;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "supplierName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return supplierName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return supplierName;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("supplierName", "asc");
		
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("product", product);
		return map;
	}
}