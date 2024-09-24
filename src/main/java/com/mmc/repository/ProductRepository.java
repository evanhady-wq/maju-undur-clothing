package com.mmc.repository;

import com.mmc.model.entity.CustomerPoints;
import com.mmc.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
