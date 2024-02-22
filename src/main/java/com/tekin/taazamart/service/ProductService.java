package com.tekin.taazamart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekin.taazamart.dto.ProductDTO;
import com.tekin.taazamart.model.Product;
import com.tekin.taazamart.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	public ProductDTO getProductDTO(Integer productId) {
		Product product = productRepository.findById(productId).orElse(null);
	    if (product == null) {
	        return null;
	    }
	    return new ProductDTO(
	        product.getProductId(),
	        product.getProductName(),
	        product.getProductPrice(),
	        product.getProductType(),
	        product.getProductDescription(),
	        product.getProductAvailableQuantity()
	    );
	    
	}

}
