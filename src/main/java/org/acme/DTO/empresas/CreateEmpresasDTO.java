package org.acme.DTO.empresas;

import org.acme.Models.Empresas;
import org.acme.Models.Vagas;

import java.util.List;

public class CreateEmpresasDTO {
    private Long id;
    private String companyName;
    private String CNPJ;
    private Integer numberEmployees;
    private String adress;
    private String corporateEmail;
    private String managerRH;
    private String companyDescription;
    private List<Vagas> vacancies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCorporateEmail() {
        return corporateEmail;
    }

    public void setCorporateEmail(String corporateEmail) {
        this.corporateEmail = corporateEmail;
    }

    public String getManagerRH() {
        return managerRH;
    }

    public void setManagerRH(String managerRH) {
        this.managerRH = managerRH;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public List<Vagas> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<Vagas> vacancies) {
        this.vacancies = vacancies;
    }

    public Empresas convert() {
        return new Empresas(this.id,
                this.companyName,
                this.CNPJ,
                this.numberEmployees,
                this.adress,
                this.corporateEmail,
                this.managerRH,
                this.companyDescription,
                this.vacancies);
    }
}
