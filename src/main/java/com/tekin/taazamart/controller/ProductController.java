package com.tekin.taazamart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekin.taazamart.dto.ProductDTO;
import com.tekin.taazamart.service.ProductService;



@RestController
@RequestMapping("/productApi")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("product/{productId}")
	public ResponseEntity<ProductDTO> getProduct(@PathVariable Integer productId){
		ProductDTO productDTO = productService.getProductDTO(productId);
		return new ResponseEntity(productDTO,HttpStatus.OK);
	}
}
