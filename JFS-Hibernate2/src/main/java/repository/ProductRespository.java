package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import entity.Product;

public interface ProductRespository extends JpaRepository<Product,Integer > {
	Product findByName(String name);
	Product findById(int id);

	

}
