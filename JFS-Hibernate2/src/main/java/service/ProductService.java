package service;

import java.util.List;
import java.util.Optional;

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
//	public List<Product> saveProducts(List<Product>products){
//		return productRepository.saveAll(products);
//		
//	}
//	public List<Product>getProducts(){
//		return productRepository.findAll();
//	}
//	public Product getProductByName(String name) {
//		return productRepository.findByName(name);
//	}
//	public Product getProductById(int id) {
//		return productRepository.findById(id);
//	}
//
//	





}
