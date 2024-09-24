package com.mmc.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "m_transaction_detail")
public class TransactionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name="transaction_id")
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    private Integer quantity;
}
