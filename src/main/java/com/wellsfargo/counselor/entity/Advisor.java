package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;

    public Advisor() {}

    public Advisor(Long advisorId, String name, String email, String password, List<Client> clients) {
        this.advisorId = advisorId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.clients = clients;
    }

    public Long getAdvisorId() { return advisorId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public List<Client> getClients() { return clients; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}