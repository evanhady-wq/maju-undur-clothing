package com.mmc.repository;

import com.mmc.model.entity.CustomerPoints;
import com.mmc.model.entity.CustomerRewards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRewardsRepository extends JpaRepository<CustomerRewards,String> {
}
