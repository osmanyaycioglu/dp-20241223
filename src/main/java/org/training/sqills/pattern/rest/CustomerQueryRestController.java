package org.training.sqills.pattern.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/api/v1/customer/query")
public class CustomerQueryRestController {
    @GET
    @Path("/get/all")
    public List<Customer> getAllCustomer(){
        return null;
    }
}
