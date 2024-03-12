package com.tekin.taazamart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tekin.taazamart.dto.ProductDTO;
import com.tekin.taazamart.model.Product;
import com.tekin.taazamart.service.ProductService;



@RestController
@RequestMapping("/productApi")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("product/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable Integer productId){
		Product product = productService.getProduct(productId);
		return new ResponseEntity(product,HttpStatus.OK);
	}
	
	@PostMapping("product/")
	public ResponseEntity<String> addProduct(@RequestBody Product product){
		String productId = productService.addProductDTO(product);
		return new ResponseEntity<>(productId,HttpStatus.OK);
	}
}
