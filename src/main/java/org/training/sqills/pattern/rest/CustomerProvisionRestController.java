package org.training.sqills.pattern.rest;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/api/v1/customer/provision")
public class CustomerProvisionRestController {

    @POST
    @Path("/insert")
    public void insert(Customer customerParam){

    }


}
