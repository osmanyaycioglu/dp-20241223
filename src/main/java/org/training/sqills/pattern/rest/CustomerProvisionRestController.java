package org.training.sqills.pattern.rest;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;

@Path("/api/v1/customer/provision")
public class CustomerProvisionRestController {

    @POST
    @Path("/insert")
    public void insert(Customer customerParam){
    }


}
