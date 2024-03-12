package com.tekin.taazamart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekin.taazamart.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
