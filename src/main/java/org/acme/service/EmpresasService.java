package org.acme.service;

import org.acme.DTO.empresas.CreateEmpresasDTO;
import org.acme.DTO.empresas.UpdateEmpresasDTO;
import org.acme.Models.Empresas;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class EmpresasService {
    @Inject
    private EntityManager em;

    public List<Empresas> todasEmpresas() {
        String jpql = "SELECT e FROM Empresas e";
        List<Empresas> empresas = em.createQuery(jpql, Empresas.class).getResultList();
        return empresas;
    }

    public void adicionaEmpresas(CreateEmpresasDTO createEmpresasDTO) {
        Empresas empresas = createEmpresasDTO.convert();
        em.persist(empresas);
    }

    public void atualizaEmpresa(Long id, UpdateEmpresasDTO updateEmpresasDTO) {
        Empresas empresas = em.find(Empresas.class, id);
        Empresas empresasDoBanco = em.merge(empresas);
        if (updateEmpresasDTO.getId() != null) {
            empresasDoBanco.setId(updateEmpresasDTO.getId());
        }
        if (updateEmpresasDTO.getCompanyName() != null) {
            empresasDoBanco.setCompanyName(updateEmpresasDTO.getCompanyName());
        }
        if (updateEmpresasDTO.getCNPJ() != null) {
            empresasDoBanco.setCNPJ(updateEmpresasDTO.getCNPJ());
        }
        if (updateEmpresasDTO.getNumberEmployees() != null) {
            empresasDoBanco.setNumberEmployees(updateEmpresasDTO.getNumberEmployees());
        }
        if (updateEmpresasDTO.getAdress() != null) {
            empresasDoBanco.setAdress(updateEmpresasDTO.getAdress());
        }
        if (updateEmpresasDTO.getCorporateEmail() != null) {
            empresasDoBanco.setCorporateEmail(updateEmpresasDTO.getCorporateEmail());
        }
        if (updateEmpresasDTO.getManagerRH() != null) {
            empresasDoBanco.setManagerRH(updateEmpresasDTO.getManagerRH());
        }
        if (updateEmpresasDTO.getCompanyDescription() != null) {
            empresasDoBanco.setCompanyDescription(updateEmpresasDTO.getCompanyDescription());
        }
        if (updateEmpresasDTO.getVacancies() != null) {
            empresasDoBanco.setVacancies(updateEmpresasDTO.getVacancies());
        }
        em.persist(empresasDoBanco);
    }

    public Empresas pegaUmaEmpresa(Long id) {
        Empresas empresas = em.find(Empresas.class, id);
        return empresas;
    }

    public void deletaEmpresas(Long id) {
        Empresas empresas = em.find(Empresas.class, id);
        em.remove(empresas);
    }
}
