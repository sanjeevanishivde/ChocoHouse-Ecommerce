package com.chocohouse.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chocohouse.store.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

	List<Product> findByCategory(String category);

}
