package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.StaffMemberDTO;
@Repository
public class StaffMemberDAOImpl  extends BaseDAOImpl<StaffMemberDTO>implements StaffMemberDAOInt{
	
	protected List<Predicate> getWhereClause(StaffMemberDTO dto, CriteriaBuilder builder, Root<StaffMemberDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getFullName())) {

			whereCondition.add(builder.like(qRoot.get("fullName"), dto.getFullName()+ "%"));
		}
		

		if (!isEmptyString(dto.getDivison())) {

			whereCondition.add(builder.like(qRoot.get("divison"), dto.getDivison() + "%"));
		}
		
		if (!isEmptyString(dto.getPreviousEmployer())) {

			whereCondition.add(builder.like(qRoot.get("previousEmployer"), dto.getPreviousEmployer() + "%"));
		}
		if (isNotNull(dto.getJoiningDate())) {
			

			whereCondition.add(builder.equal(qRoot.get("joiningDate"), dto.getJoiningDate()));
		}


		return whereCondition;
	}
	

	
	public Class<StaffMemberDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return StaffMemberDTO.class;
	}
	

}