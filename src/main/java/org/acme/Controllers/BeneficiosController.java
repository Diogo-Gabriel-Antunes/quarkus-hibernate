package org.acme.Controllers;

import org.acme.DTO.beneficios.CreateBeneficiosDTO;
import org.acme.DTO.beneficios.UpdateBeneficiosDTO;
import org.acme.Models.Beneficios;
import org.acme.service.BeneficiosService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/beneficios")
public class BeneficiosController {
    @Inject
    private BeneficiosService beneficiosService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        List<Beneficios> beneficios = beneficiosService.todosBeneficios();
        return Response.ok(beneficios).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOne(@PathParam("id") Long id) {
        Beneficios beneficios = beneficiosService.pegaUmaBeneficios(id);
        return Response.ok(beneficios).build();
    }

    @POST
    @Transactional
    public Response add(CreateBeneficiosDTO createBeneficiosDTO) {
        beneficiosService.adicionaBeneficios(createBeneficiosDTO);
        return Response.ok("Beneficios adicionada com sucesso").build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response update(@PathParam("id") Long id, UpdateBeneficiosDTO updateBeneficiosDTO) {
        beneficiosService.atualizaBeneficios(id, updateBeneficiosDTO);
        return Response.ok("Beneficios atualizada com sucesso").build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        beneficiosService.deletaBeneficios(id);
        return Response.ok("Beneficios deletada com sucesso").build();
    }
}
