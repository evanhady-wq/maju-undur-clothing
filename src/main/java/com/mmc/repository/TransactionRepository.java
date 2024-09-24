package com.mmc.repository;

import com.mmc.model.entity.CustomerPoints;
import com.mmc.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
