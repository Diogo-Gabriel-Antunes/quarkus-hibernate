package org.acme.Controllers;

import org.acme.DTO.empresas.CreateEmpresasDTO;
import org.acme.DTO.empresas.UpdateEmpresasDTO;
import org.acme.Models.Empresas;
import org.acme.service.EmpresasService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/empresas")
public class EmpresasController {
    @Inject
    private EmpresasService empresasService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        List<Empresas> empresas = empresasService.todasEmpresas();
        return Response.ok(empresas).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOne(@PathParam("id") Long id) {
        Empresas empresas = empresasService.pegaUmaEmpresa(id);
        return Response.ok(empresas).build();
    }

    @POST
    @Transactional
    public Response add(CreateEmpresasDTO createEmpresasDTO) {
        empresasService.adicionaEmpresas(createEmpresasDTO);
        return Response.ok("Vaga adicionada com sucesso").build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response update(@PathParam("id") Long id, UpdateEmpresasDTO updateEmpresasDTO) {
        empresasService.atualizaEmpresa(id, updateEmpresasDTO);
        return Response.ok("Vaga atualizada com sucesso").build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        empresasService.deletaEmpresas(id);
        return Response.ok("Vaga deletada com sucesso").build();
    }
}
