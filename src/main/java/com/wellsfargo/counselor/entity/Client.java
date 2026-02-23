package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @ManyToOne
    private Advisor advisor;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

    public Client() {}

    public Client(Long clientId, Advisor advisor, String firstName, String lastName, String email, List<Portfolio> portfolios) {
        this.clientId = clientId;
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.portfolios = portfolios;
    }

    public Long getClientId() { return clientId; }
    public Advisor getAdvisor() { return advisor; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public List<Portfolio> getPortfolios() { return portfolios; }

    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setPortfolios(List<Portfolio> portfolios) { this.portfolios = portfolios; }
}