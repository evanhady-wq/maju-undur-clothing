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
@Table(name = "m_customer_points")
public class CustomerPoints {
    @Id
    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customerId;

    private Integer points;

}
