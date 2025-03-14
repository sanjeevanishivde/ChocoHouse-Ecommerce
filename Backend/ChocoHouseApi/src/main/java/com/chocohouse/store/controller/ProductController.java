package com.chocohouse.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chocohouse.store.entity.Product;
import com.chocohouse.store.service.ProductService;




@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:5174")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@PostMapping("/addMultiple")
	public List<Product> addMultipleProducts(@RequestBody List<Product> products){
		return productService.addMultipleProducts(products);
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable long id) {
		return productService.getById(id);
	}
	
	@GetMapping("/category/{category}")
	public List<Product> getByCategory(@PathVariable String category) {
		return productService.getByCategory(category);
	}
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable long id) {
		productService.deleteProduct(id);
		return "Product deleted !!!";
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable long id , @RequestBody Product product) {
		return productService.updateProduct(id,product);
	}
	
	
}
