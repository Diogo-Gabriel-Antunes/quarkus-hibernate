package org.acme.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Beneficios {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String beneficios;
    @ManyToMany(mappedBy = "benefits")
    private Set<Vagas> vacancies;

    public Beneficios(Long id, String beneficios, Set<Vagas> vacancies) {
        this.id = id;
        this.beneficios = beneficios;
        this.vacancies = vacancies;
    }

    public Beneficios() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBenefits() {
        return beneficios;
    }

    public void setBenefits(String benefits) {
        this.beneficios = benefits;
    }

    public Set<Vagas> getVacancies() {
        return vacancies;
    }

    public void setVacancies(Set<Vagas> vacancies) {
        this.vacancies = vacancies;
    }
}
