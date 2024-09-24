package com.mmc.repository;

import com.mmc.model.entity.CustomerPoints;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPointsRepository extends JpaRepository<CustomerPoints,String> {
}
