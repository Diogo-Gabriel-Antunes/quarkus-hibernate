package org.acme.Controllers;

import org.acme.DTO.tecnologias.CreateTecnologiasDTO;
import org.acme.DTO.tecnologias.UpdateTecnologiasDTO;
import org.acme.Models.Tecnologias;
import org.acme.service.TecnologiasService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/tecnologias")
public class TecnologiasController {
    @Inject
    private TecnologiasService tecnologiasService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        List<Tecnologias> tecnologias = tecnologiasService.todasTecnologias();
        return Response.ok(tecnologias).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOne(@PathParam("id") Long id) {
        Tecnologias tecnologias = tecnologiasService.pegaUmaTecnologia(id);
        return Response.ok(tecnologias).build();
    }

    @POST
    @Transactional
    public Response add(CreateTecnologiasDTO createTecnologiasDTO) {
        tecnologiasService.adicionaTecnologias(createTecnologiasDTO);
        return Response.ok("Tecnologia adicionada com sucesso").build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response update(@PathParam("id") Long id, UpdateTecnologiasDTO updateTecnologiasDTO) {
        tecnologiasService.atualizaTecnologia(id, updateTecnologiasDTO);
        return Response.ok("Tecnologia atualizada com sucesso").build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        tecnologiasService.deletaTecnologias(id);
        return Response.ok("Tecnologia deletada com sucesso").build();
    }
}
