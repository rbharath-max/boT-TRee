package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Product;
import repository.ProductRespository;

@Service
public class ProductService {
	
	
	
	@Autowired
	private ProductRespository productRepository;
	public Product saveProduct(Product product) {
		
		return productRepository.save(product);
	}






}
