package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Product;

public interface ProductRespository extends JpaRepository<Product,Integer> {
	//Product.findByName(String name);

}
