/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author 23862-6
 */
@Path("/hello/{username}")
public class HelloWorldResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloWorldResource
     */
    public HelloWorldResource() {
    }

    /**
     * Retrieves representation of an instance of rs.HelloWorldResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String
            getHtml(@PathParam("username")String userName) {
        String info = "Hello World "
                + userName + "!";
        return info;
    }
}
