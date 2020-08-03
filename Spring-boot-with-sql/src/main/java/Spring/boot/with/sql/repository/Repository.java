package Spring.boot.with.sql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Spring.boot.with.sql.entity.Product;
@org.springframework.stereotype.Repository
public interface Repository  extends JpaRepository<Product, Integer>{

	@Query("SELECT p FROM product_tbl p WHERE p.name = ?1")
	List<Product> findByTitle(String chars);
}
