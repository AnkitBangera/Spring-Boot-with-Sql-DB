package Spring.boot.with.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Spring.boot.with.sql.entity.Product;
import Spring.boot.with.sql.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	@Autowired
	private ProductService productService;

	@PostMapping("saveProduct")
	public List<Product> saveProducts(@RequestBody List<Product> products) {
		return productService.saveProducts(products);
	}
	@GetMapping("getProducts")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	@GetMapping("getProductById/{id}")
	public Product getProductBtId(@PathVariable int id) {
		return productService.getProductById(id);
	}
	@GetMapping("getProductByTitle")
	public List<Product> getProguctByTitle(){
		return productService.getProductByTitle();
	}
	
}
