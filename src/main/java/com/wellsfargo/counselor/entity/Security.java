package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @ManyToOne
    private Portfolio portfolio;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private LocalDate purchaseDate;

    @Column
    private Double purchasePrice;

    @Column
    private Integer quantity;

    public Security() {}

    public Security(Long securityId, Portfolio portfolio, String name, String category,
                    LocalDate purchaseDate, Double purchasePrice, Integer quantity) {
        this.securityId = securityId;
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getSecurityId() { return securityId; }
    public Portfolio getPortfolio() { return portfolio; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public LocalDate getPurchaseDate() { return purchaseDate; }
    public Double getPurchasePrice() { return purchasePrice; }
    public Integer getQuantity() { return quantity; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }
    public void setPurchasePrice(Double purchasePrice) { this.purchasePrice = purchasePrice; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}