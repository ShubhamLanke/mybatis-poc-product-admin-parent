package com.dss.api.service;

import com.dss.api.dto.ProductDTO;
import jakarta.ws.rs.*;
import org.springframework.http.MediaType;

import java.util.List;

@Path("/api/category")
@Consumes(MediaType.TEXT_PLAIN_VALUE)
@Produces(MediaType.APPLICATION_JSON_VALUE)
public interface CategoryService {

    @GET
    @Path("/product")
    List<ProductDTO> getAllProductsByCategory(@QueryParam("id") Long id);
}
