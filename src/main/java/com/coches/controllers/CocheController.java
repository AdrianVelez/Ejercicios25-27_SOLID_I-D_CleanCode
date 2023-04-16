package com.coches.controllers;

import com.coches.entities.Coche;
import com.coches.services.CochesService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.ArrayList;


@Component
@Path("/")
public class CocheController {

    private final CochesService cochesService;

    public CocheController(CochesService cochesService) {
        this.cochesService = cochesService;
    }

    @GET
    @Path("/coches/clases")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Coche> listarClases() {
       return cochesService.ListarPorClase();
    }


    @GET
    @Path("/coches")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Coche> listarCoches() {
        return cochesService.listarCoches();
    }

    @GET
    @Path("/coches/{modelo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Coche listarUno(@PathParam("modelo") String modelo) {
        return cochesService.obtenerCoche(modelo);
    }

    @POST
    @Path("/coches")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearUsuario(Coche coche) {
        this.cochesService.crearCoche(coche);

        return Response.created(
                        URI.create("/coches" + coche.getModelo()))
                .build();
    }


    @DELETE
    @Path("/coches/{modelo}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response borrarCoche(@PathParam("modelo") String modelo) {
            this.cochesService.borrarCoche(modelo);
            return Response.ok().build();
    }
}
