package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.StaffMemberDTO;

public class StaffMemberForm extends BaseForm {
	
	
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Only letters are Allowed")

	@NotEmpty(message = "Please enter Full Name")
	private String fullName ;
	
	@NotNull(message = "please enter joiningDate")
	private Date joiningDate;
	
	@NotEmpty(message = "please Enter divison")
	private String divison;
	
	
	@NotEmpty(message = "please Enter previousEmployer")
	private String previousEmployer ;


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
	
	public BaseDTO getDto() {

		StaffMemberDTO dto = initDTO(new StaffMemberDTO());
		dto.setFullName(fullName);
		dto.setJoiningDate(joiningDate);
		dto.setDivison(divison);
		dto.setPreviousEmployer(previousEmployer);
		return dto;

	}
	
	

}