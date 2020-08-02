package Spring.boot.with.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring.boot.with.sql.entity.Product;
import Spring.boot.with.sql.repository.Repository;

@Service
public class ProductService {
@Autowired
private Repository repository;

public List<Product> saveProducts(List<Product> products) {
	return repository.save(products);
}

public List<Product> getProducts(){
	return repository.findAll();
}

public Product getProductById(int id){
	return repository.findOne(id);
}

public String deleteProduct(int id) {
	repository.delete(id);
	return "Deleted product "+id;
}

}
