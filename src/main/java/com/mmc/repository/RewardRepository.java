package com.mmc.repository;

import com.mmc.model.entity.CustomerPoints;
import com.mmc.model.entity.Reward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RewardRepository extends JpaRepository<Reward,String> {
}
