package com.akshay.todo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by akshayphadke on 2/12/17.
 */

@Path("/")
public class TodoResource {

    @GET
    public String test() {
        return "Test successful!";
    }

}
