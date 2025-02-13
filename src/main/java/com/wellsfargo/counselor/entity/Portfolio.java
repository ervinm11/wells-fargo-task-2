package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "portfolio")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private Date creationDate;

    // Constructor
    public Portfolio(Client client, Date creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    // Default constructor
    public Portfolio() {}

    // Getters
    public Long getPortfolioId() { return portfolioId; }
    public Client getClient() { return client; }
    public Date getCreationDate() { return creationDate; }

    // Setters
    public void setClient(Client client) { this.client = client; }
    public void setCreationDate(Date creationDate) { this.creationDate = creationDate; }
}