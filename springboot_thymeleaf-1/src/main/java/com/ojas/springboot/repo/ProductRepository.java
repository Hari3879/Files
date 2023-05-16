package com.ojas.springboot.repo;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.springboot.entity.ProductEntity;



@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {

}
