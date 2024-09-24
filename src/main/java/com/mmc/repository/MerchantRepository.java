package com.mmc.repository;

import com.mmc.model.entity.CustomerPoints;
import com.mmc.model.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant,String> {
}
