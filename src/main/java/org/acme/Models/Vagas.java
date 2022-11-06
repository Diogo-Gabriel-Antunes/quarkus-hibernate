package org.acme.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Vagas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String jobTitle;
    @Column
    private String jobDescription;
    @Column
    private String vacancyLocation;
    @Column
    private Float salaryRange;
    @Column
    private Float salaryRangeMax;
    @Column
    private String seniority;
    @Column
    private String typeOfContract;
    @Column
    private String category;
    @Column
    private Boolean active;
    @Column
    private String activities;
    @ManyToOne
    @JoinColumn(name = "companyId")
    private Empresas companyId;

    @ManyToMany
    @JoinTable(name = "Vacancies_Benefits",
            joinColumns = @JoinColumn(name = "Vacancies_FK"),
            inverseJoinColumns = @JoinColumn(name = "Benefits_FK")
    )
    @JsonIgnore
    private Set<Beneficios> benefits;
    @ManyToMany
    @JoinTable(name = "Vacancies_Technologies",
            joinColumns = @JoinColumn(name = "Vacancies_FK"),
            inverseJoinColumns = @JoinColumn(name = "Technologies_FK")
    )
    @JsonIgnore
    private Set<Tecnologias> technologiesRequired;

    @ManyToMany
    @JoinTable(name = "Vacancies_TechnologiesDesirable",
            joinColumns = @JoinColumn(name = "Vacancies_FK"),
            inverseJoinColumns = @JoinColumn(name = "Technologies_FK")
    )
    @JsonIgnore
    private Set<Tecnologias> technologiesDesirable;


    public Vagas() {
    }

    public Vagas(Long id, String jobTitle, String jobDescription, String vacancyLocation, Float salaryRange, Float salaryRangeMax, String seniority, String typeOfContract, String category, Boolean active, String activities, Empresas companyId, Set<Beneficios> benefits, Set<Tecnologias> technologiesRequired, Set<Tecnologias> technologiesDesirable) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.vacancyLocation = vacancyLocation;
        this.salaryRange = salaryRange;
        this.salaryRangeMax = salaryRangeMax;
        this.seniority = seniority;
        this.typeOfContract = typeOfContract;
        this.category = category;
        this.active = active;
        this.activities = activities;
        this.companyId = companyId;
        this.benefits = benefits;
        this.technologiesRequired = technologiesRequired;
        this.technologiesDesirable = technologiesDesirable;
    }

    public Vagas(String jobTitle, String jobDescription, String vacancyLocation, Float salaryRange, Float salaryRangeMax, String seniority, String typeOfContract, String category, Boolean active, String activities, Empresas companyId, Set<Beneficios> benefits, Set<Tecnologias> technologiesRequired, Set<Tecnologias> technologiesDesirable) {
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.vacancyLocation = vacancyLocation;
        this.salaryRange = salaryRange;
        this.salaryRangeMax = salaryRangeMax;
        this.seniority = seniority;
        this.typeOfContract = typeOfContract;
        this.category = category;
        this.active = active;
        this.activities = activities;
        this.companyId = companyId;
        this.benefits = benefits;
        this.technologiesRequired = technologiesRequired;
        this.technologiesDesirable = technologiesDesirable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
