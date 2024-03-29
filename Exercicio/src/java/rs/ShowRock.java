/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author 23836-0
 */
@Path("urlshow")
public class ShowRock {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ShowRock
     */
    public ShowRock() {
    }

    @POST
    @Produces("text/html")
    public String venda(@FormParam("banda") String banda,
            @FormParam("qtdIngressos") int qtd) {
//TODO return proper representation object
        switch (banda.toLowerCase()) {
            case "metallica":
                return "R$" + qtd * 350;
            case "the who":
                return "R$" + qtd * 300;
        }
        return "show inexistente!";
    }
}
