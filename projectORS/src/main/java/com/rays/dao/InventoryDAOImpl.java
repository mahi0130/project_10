package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.InventoryDTO;

@Repository
public class InventoryDAOImpl extends BaseDAOImpl<InventoryDTO> implements InventoryDAOInt {

	@Override
	protected List<Predicate> getWhereClause(InventoryDTO dto, CriteriaBuilder builder, Root<InventoryDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSupplierName())) {

			whereCondition.add(builder.like(qRoot.get("supplierName"), dto.getSupplierName() + "%"));
		}

		if (isNotNull(dto.getLastUpdatedDate())) {

			whereCondition.add(builder.equal(qRoot.get("lastUpdatedDate"), dto.getLastUpdatedDate()));
		}

		if (!isEmptyString(dto.getProduct())) {

			whereCondition.add(builder.like(qRoot.get("product"), dto.getProduct() + "%"));
		}

		if (!isZeroNumber(dto.getQuantity())) {

			whereCondition.add(builder.equal(qRoot.get("quantity"), dto.getQuantity()));
		}

		return whereCondition;
	}

	@Override
	public Class<InventoryDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return InventoryDTO.class;
	}

}