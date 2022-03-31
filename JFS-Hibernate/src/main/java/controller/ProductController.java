package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import repository.ProductRespository;
import service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	
	public Product addProduct(@RequestBody Product product) {
	
		return productservice.saveProduct(product);
	}
}
