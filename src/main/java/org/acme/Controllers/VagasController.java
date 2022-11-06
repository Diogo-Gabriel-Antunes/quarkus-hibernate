package org.acme.Controllers;

import org.acme.DTO.vagas.CreateVagasDTO;
import org.acme.DTO.vagas.UpdateVagasDTO;
import org.acme.Models.Vagas;
import org.acme.service.VagasService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/vagas")
public class VagasController {
    @Inject
    private VagasService vagasService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        List<Vagas> vagas = vagasService.todasVagas();
        return Response.ok(vagas).build();
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOne(@PathParam("id") Long id) {
        Vagas vagas = vagasService.pegaUmaVaga(id);
        return Response.ok(vagas).build();
    }
    @POST
    @Transactional
    public Response add(CreateVagasDTO createVagasDTO) {
        vagasService.adicionaVaga(createVagasDTO);
        return Response.ok("Vaga adicionada com sucesso").build();
    }
    @PUT
    @Path("/{id}")
    @Transactional
    public Response update(@PathParam("id") Long id,UpdateVagasDTO updateVagasDTO){
        vagasService.atualizaVaga(id,updateVagasDTO);
        return Response.ok("Vaga atualizada com sucesso").build();
    }
    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id){
        vagasService.deletaVagas(id);
        return Response.ok("Vaga deletada com sucesso").build();
    }
}
