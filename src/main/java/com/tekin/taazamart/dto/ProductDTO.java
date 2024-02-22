package com.tekin.taazamart.dto;

import lombok.Data;

@Data
public class ProductDTO {

	private Integer productId;
	private String productName;
	private Integer productPrice;
	private String productType;
	private String productDescription;
	private Integer productAvailableQuantity;
	
	public ProductDTO(Integer productId, String productName, Integer productPrice, String productType,
			String productDescription, Integer productAvailableQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType = productType;
		this.productDescription = productDescription;
		this.productAvailableQuantity = productAvailableQuantity;
	}
	
	
}
