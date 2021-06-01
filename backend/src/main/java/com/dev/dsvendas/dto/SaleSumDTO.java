package com.dev.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.dev.dsvendas.entities.Sale;
import com.dev.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sellerName;
	
	private Double sum;


	public SaleSumDTO() {
	
	}

	
	public SaleSumDTO(Seller seller, Double sum) {
		super();
		this.sellerName = seller.getName();
		this.sum = sum;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public Double getSum() {
		return sum;
	}


	public void setSum(Double sum) {
		this.sum = sum;
	}

}
