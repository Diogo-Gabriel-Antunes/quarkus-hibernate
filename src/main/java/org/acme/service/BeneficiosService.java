package org.acme.service;

import org.acme.DTO.beneficios.CreateBeneficiosDTO;
import org.acme.DTO.beneficios.UpdateBeneficiosDTO;
import org.acme.Models.Beneficios;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class BeneficiosService {
    @Inject
    private EntityManager em;

    public List<Beneficios> todosBeneficios() {
        String jpql = "SELECT b FROM Beneficios b";
        List<Beneficios> beneficios = em.createQuery(jpql, Beneficios.class).getResultList();
        return beneficios;
    }

    public void adicionaBeneficios(CreateBeneficiosDTO createBeneficiosDTO) {
        Beneficios beneficiosParaAdicionar = createBeneficiosDTO.convert();
        em.persist(beneficiosParaAdicionar);
    }

    public void atualizaBeneficios(Long id, UpdateBeneficiosDTO updateBeneficiosDTO) {
        Beneficios beneficios = em.find(Beneficios.class, id);
        Beneficios beneficiosDoBanco = em.merge(beneficios);
        if (updateBeneficiosDTO.getId() != null) {
            beneficiosDoBanco.setId(updateBeneficiosDTO.getId());
        }
        if (updateBeneficiosDTO.getBenefits() != null) {
            beneficiosDoBanco.setBenefits(updateBeneficiosDTO.getBenefits());
        }
        if (updateBeneficiosDTO.getVacancies() != null) {
            beneficiosDoBanco.setVacancies(updateBeneficiosDTO.getVacancies());
        }


        em.persist(beneficiosDoBanco);
    }

    public Beneficios pegaUmaBeneficios(Long id) {
        Beneficios beneficios = em.find(Beneficios.class, id);
        return beneficios;
    }

    public void deletaBeneficios(Long id) {
        Beneficios beneficios = em.find(Beneficios.class, id);
        em.remove(beneficios);
    }
}
