package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "security")
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private Integer quantity;

    // Constructor
    public Security(Portfolio portfolio, String name, String category, Double purchasePrice, Date purchaseDate, Integer quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    // Default constructor
    public Security() {}

    // Getters
    public Long getSecurityId() { return securityId; }
    public Portfolio getPortfolio() { return portfolio; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public Double getPurchasePrice() { return purchasePrice; }
    public Date getPurchaseDate() { return purchaseDate; }
    public Integer getQuantity() { return quantity; }

    // Setters
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setPurchasePrice(Double purchasePrice) { this.purchasePrice = purchasePrice; }
    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}