package org.acme.service;

import org.acme.DTO.tecnologias.CreateTecnologiasDTO;
import org.acme.DTO.tecnologias.UpdateTecnologiasDTO;
import org.acme.Models.Tecnologias;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class TecnologiasService {
    @Inject
    private EntityManager em;

    public List<Tecnologias> todasTecnologias() {
        String jpql = "SELECT t FROM Tecnologias t";
        List<Tecnologias> tecnologias = em.createQuery(jpql, Tecnologias.class).getResultList();
        return tecnologias;
    }

    public void adicionaTecnologias(CreateTecnologiasDTO createTecnologiasDTO) {
        Tecnologias tecnologias = createTecnologiasDTO.convert();
        em.persist(tecnologias);
    }

    public void atualizaTecnologia(Long id, UpdateTecnologiasDTO updateTecnologiasDTO) {
        Tecnologias tecnologia = em.find(Tecnologias.class, id);
        Tecnologias tecnologiaDoBanco = em.merge(tecnologia);
        if (updateTecnologiasDTO.getId() != null) {
            tecnologiaDoBanco.setId(updateTecnologiasDTO.getId());
        }
        if (updateTecnologiasDTO.getTechnologies() != null) {
            tecnologiaDoBanco.setTechnologies(updateTecnologiasDTO.getTechnologies());
        }
        if (updateTecnologiasDTO.getCategory() != null) {
            tecnologiaDoBanco.setCategory(updateTecnologiasDTO.getCategory());
        }
        if (updateTecnologiasDTO.getVacanciesRequired() != null) {
            tecnologiaDoBanco.setVacanciesRequired(updateTecnologiasDTO.getVacanciesRequired());
        }
        if (updateTecnologiasDTO.getVacanciesDesirable() != null) {
            tecnologiaDoBanco.setVacanciesDesirable(updateTecnologiasDTO.getVacanciesDesirable());
        }

        em.persist(tecnologiaDoBanco);
    }

    public Tecnologias pegaUmaTecnologia(Long id) {
        Tecnologias tecnologias = em.find(Tecnologias.class, id);
        return tecnologias;
    }

    public void deletaTecnologias(Long id) {
        Tecnologias tecnologias = em.find(Tecnologias.class, id);
        em.remove(tecnologias);
    }
}
