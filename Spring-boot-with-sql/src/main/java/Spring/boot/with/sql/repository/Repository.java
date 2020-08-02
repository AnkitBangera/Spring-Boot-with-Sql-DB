package Spring.boot.with.sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring.boot.with.sql.entity.Product;

public interface Repository  extends JpaRepository<Product, Integer>{

}
