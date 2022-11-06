package org.acme.Models;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Tecnologias {
    @Id@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String technologies;
    private String category;
    @ManyToMany(mappedBy = "technologiesRequired")
    private Set<Vagas> vacanciesRequired;
    @ManyToMany(mappedBy = "technologiesDesirable")
    private Set<Vagas> vacanciesDesirable;

    public Tecnologias() {
    }

    public Tecnologias(Long id, String technologies, String category, Set<Vagas> vacanciesRequired, Set<Vagas> vacanciesDesirable) {
        this.id = id;
        this.technologies = technologies;
        this.category = category;
        this.vacanciesRequired = vacanciesRequired;
        this.vacanciesDesirable = vacanciesDesirable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<Vagas> getVacanciesRequired() {
        return vacanciesRequired;
    }

    public void setVacanciesRequired(Set<Vagas> vacanciesRequired) {
        this.vacanciesRequired = vacanciesRequired;
    }

    public Set<Vagas> getVacanciesDesirable() {
        return vacanciesDesirable;
    }

    public void setVacanciesDesirable(Set<Vagas> vacanciesDesirable) {
        this.vacanciesDesirable = vacanciesDesirable;
    }
}
