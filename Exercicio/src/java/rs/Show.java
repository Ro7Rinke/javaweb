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
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author 23836-0
 */
@Path("show")
public class Show {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Show
     */
    public Show() {
    }

    /**
     * Retrieves representation of an instance of rs.Show
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getHtml(@MatrixParam("title") String title, @MatrixParam("quant") int quant) {
        String msg = "";
        if (title.equals("Metallica")) {
            float total = 350 * quant;
            msg = "R$"+String.valueOf(total);
        } else if (title.equals("The Who")) {
            float total = 300 * quant;
            msg = "R$"+String.valueOf(total);
        }else{
            msg = "Parametros incompletos";
        }
        return msg;
    }
}
