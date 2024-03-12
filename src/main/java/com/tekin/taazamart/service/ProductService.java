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
	
	public Product getProduct(Integer productId) {
		Product product = productRepository.findById(productId).orElse(null);
	    if (product == null) {
	        return null;
	    }
		return product;
	    
	    
	}
	
	public String addProductDTO(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
		return "Product Added Successfully"+product.getProductId();
	}

	

}
