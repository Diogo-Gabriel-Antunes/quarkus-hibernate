package org.acme.DTO.tecnologias;

import org.acme.Models.Tecnologias;
import org.acme.Models.Vagas;

import java.util.Set;

public class CreateTecnologiasDTO {
    private Long id;
    private String technologies;
    private String category;
    private Set<Vagas> vacanciesRequired;
    private Set<Vagas> vacanciesDesirable;

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

    public Tecnologias convert() {
        return new Tecnologias(this.id, this.technologies, this.category, this.vacanciesRequired, this.vacanciesDesirable);
    }
}
