package org.acme.service;

import org.acme.DTO.vagas.CreateVagasDTO;
import org.acme.DTO.vagas.UpdateVagasDTO;
import org.acme.Models.Vagas;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class VagasService {
    @Inject
    private EntityManager em;

    public List<Vagas> todasVagas() {
        String jpql = "SELECT v FROM Vagas v";
        List<Vagas> vagas = em.createQuery(jpql, Vagas.class).getResultList();
        return vagas;
    }

    public void adicionaVaga(CreateVagasDTO createVagasDTO) {
        Vagas vagas = createVagasDTO.convert();
        em.persist(vagas);
    }

    public void atualizaVaga(Long id, UpdateVagasDTO updateVagasDTO) {
        Vagas vagas = em.find(Vagas.class, id);
        Vagas vagaDoBanco = em.merge(vagas);
        if (updateVagasDTO.getJobTitle() != null) {
            vagaDoBanco.setJobTitle(updateVagasDTO.getJobTitle());
        }
        if (updateVagasDTO.getJobDescription() != null) {
            vagaDoBanco.setJobDescription(updateVagasDTO.getJobDescription());
        }
        if (updateVagasDTO.getVacancyLocation() != null) {
            vagaDoBanco.setVacancyLocation(updateVagasDTO.getVacancyLocation());
        }
        if (updateVagasDTO.getSalaryRange() != null) {
            vagaDoBanco.setSalaryRange(updateVagasDTO.getSalaryRange());
        }
        if (updateVagasDTO.getSalaryRangeMax() != null) {
            vagaDoBanco.setSalaryRangeMax(updateVagasDTO.getSalaryRangeMax());
        }
        if (updateVagasDTO.getSeniority() != null) {
            vagaDoBanco.setSeniority(updateVagasDTO.getSeniority());
        }
        if (updateVagasDTO.getTypeOfContract() != null) {
            vagaDoBanco.setTypeOfContract(updateVagasDTO.getTypeOfContract());
        }
        if (updateVagasDTO.getCategory() != null) {
            vagaDoBanco.setCategory(updateVagasDTO.getCategory());
        }
        if (updateVagasDTO.getActive() != null) {
            vagaDoBanco.setActive(updateVagasDTO.getActive());
        }
        if (updateVagasDTO.getActivities() != null) {
            vagaDoBanco.setActivities(updateVagasDTO.getActivities());
        }
        if (updateVagasDTO.getCompanyId() != null) {
            vagaDoBanco.setCompanyId(updateVagasDTO.getCompanyId());
        }
        if (updateVagasDTO.getBenefits() != null) {
            vagaDoBanco.setBenefits(updateVagasDTO.getBenefits());
        }
        if (updateVagasDTO.getTechnologiesRequired() != null) {
            vagaDoBanco.setTechnologiesRequired(updateVagasDTO.getTechnologiesRequired());
        }
        if (updateVagasDTO.getTechnologiesDesirable() != null) {
            vagaDoBanco.setTechnologiesDesirable(updateVagasDTO.getTechnologiesDesirable());
        }

        em.persist(vagaDoBanco);
    }

    public Vagas pegaUmaVaga(Long id) {
        Vagas vagas = em.find(Vagas.class, id);
        return vagas;
    }

    public void deletaVagas(Long id) {
        Vagas vagas = em.find(Vagas.class, id);
        em.remove(vagas);
    }
}
