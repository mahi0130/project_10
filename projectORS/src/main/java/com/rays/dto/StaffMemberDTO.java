
package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_STAFF")
public class StaffMemberDTO extends BaseDTO{
	
	@Column(name = "FULLNAME", length = 100)
	private String fullName = null;

	@Column(name = "JOININGDATE")
	private Date joiningDate;
	

	@Column(name = "DIVISON", length = 100)
	private String divison = null;
	
	@Column(name = "PREVIOUSEMPLOYER", length = 100)
	private String previousEmployer = null;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDivison() {
		return divison;
	}

	public void setDivison(String divison) {
		this.divison = divison;
	}

	public String getPreviousEmployer() {
		return previousEmployer;
	}

	public void setPreviousEmployer(String previousEmployer) {
		this.previousEmployer = previousEmployer;
	}
	
	public String getKey() {
		return divison;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return divison;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "fullName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return fullName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return divison;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("divison", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("divison", divison);
		return map;
	}

	
}
