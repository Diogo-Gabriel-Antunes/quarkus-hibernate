package org.acme.DTO.vagas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.acme.Models.Beneficios;
import org.acme.Models.Empresas;
import org.acme.Models.Tecnologias;
import org.acme.Models.Vagas;

import javax.persistence.*;
import java.util.Set;

public class CreateVagasDTO {
    private Long id;
    private String jobTitle;
    private String jobDescription;
    private String vacancyLocation;
    private Float salaryRange;
    private Float salaryRangeMax;
    private String seniority;
    private String typeOfContract;
    private String category;
    private Boolean active;
    private String activities;
    private Empresas companyId;
    private Set<Beneficios> benefits;
    private Set<Tecnologias> technologiesRequired;
    private Set<Tecnologias> technologiesDesirable;



    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getVacancyLocation() {
        return vacancyLocation;
    }

    public void setVacancyLocation(String vacancyLocation) {
        this.vacancyLocation = vacancyLocation;
    }

    public Float getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(Float salaryRange) {
        this.salaryRange = salaryRange;
    }

    public Float getSalaryRangeMax() {
        return salaryRangeMax;
    }

    public void setSalaryRangeMax(Float salaryRangeMax) {
        this.salaryRangeMax = salaryRangeMax;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getTypeOfContract() {
        return typeOfContract;
    }

    public void setTypeOfContract(String typeOfContract) {
        this.typeOfContract = typeOfContract;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public Empresas getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Empresas companyId) {
        this.companyId = companyId;
    }

    public Set<Beneficios> getBenefits() {
        return benefits;
    }

    public void setBenefits(Set<Beneficios> benefits) {
        this.benefits = benefits;
    }

    public Set<Tecnologias> getTechnologiesRequired() {
        return technologiesRequired;
    }

    public void setTechnologiesRequired(Set<Tecnologias> technologiesRequired) {
        this.technologiesRequired = technologiesRequired;
    }

    public Set<Tecnologias> getTechnologiesDesirable() {
        return technologiesDesirable;
    }

    public void setTechnologiesDesirable(Set<Tecnologias> technologiesDesirable) {
        this.technologiesDesirable = technologiesDesirable;
    }

    public Vagas convert() {
        return new Vagas(this.id,
                this.jobTitle,
                this.jobDescription,
                this.vacancyLocation,
                this.salaryRange,
                this.salaryRangeMax,
                this.seniority,
                this.typeOfContract,
                this.category,
                this.active,
                this.activities,
                this.companyId,
                this.benefits,
                this.technologiesRequired,
                this.technologiesDesirable);
    }
}
