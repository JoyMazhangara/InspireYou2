package com.brightpaths.InspireYou2.entities;


import javax.persistence.*;

@Entity
@Table(name = "Compliments")
public class Compliment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "compliment_id", nullable = false)
    private Long id;

    @Column(name = "compliment", length = 25, nullable = false)
    private String compliment;

    public Compliment(Long id, String compliment) {
        this.id = id;
        this.compliment = compliment;
    }

    public Compliment() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompliment() {
        return compliment;
    }

    public void setCompliment(String compliment) {
        this.compliment = compliment;
    }
}
