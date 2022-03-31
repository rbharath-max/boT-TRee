package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import repository.ProductRespository;
import service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
	
		return productservice.saveProduct(product);
	}
//	@PostMapping("/addProducts")
//	public List<Product> addProducts(@RequestBody List<Product> products) {
//		return productservice.saveProducts(products);
//	}
//	@GetMapping("/products")
//	public List<Product>findAllProducts(){
//		return productservice.getProducts();
//	}
//	@GetMapping("/product/{name}")
//	public Product findProductByName(@PathVariable String name)
//	{
//		return productservice.getProductByName(name);
//	}
//	@GetMapping("/findProductById/{id}")
//	public Product findProductById(@PathVariable int id)
//	{
//	return productservice.getProductById(id);
//    }

}

