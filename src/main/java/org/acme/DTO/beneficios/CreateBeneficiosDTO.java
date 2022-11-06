package org.acme.DTO.beneficios;

import org.acme.Models.Beneficios;
import org.acme.Models.Vagas;

import java.util.Set;

public class CreateBeneficiosDTO {
    private Long id;
    private String benefits;
    private Set<Vagas> vacancies;

    public CreateBeneficiosDTO() {
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public Set<Vagas> getVacancies() {
        return vacancies;
    }

    public void setVacancies(Set<Vagas> vacancies) {
        this.vacancies = vacancies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Beneficios convert() {
        return new Beneficios(this.id, this.benefits, this.vacancies);
    }
}
