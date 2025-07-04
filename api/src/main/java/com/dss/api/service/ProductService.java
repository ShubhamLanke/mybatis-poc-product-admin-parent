package com.dss.api.service;

import com.dss.api.dto.ProductDTO;
import com.dss.api.filter.ProductFilter;
import jakarta.ws.rs.*;
import org.springframework.http.MediaType;

import java.util.List;

@Path("/api/products")
@Consumes({MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
@Produces(MediaType.APPLICATION_JSON_VALUE)
public interface ProductService {

    @POST
    @Path("/filter")
    List<ProductDTO> getAll(ProductFilter productFilter);
}
