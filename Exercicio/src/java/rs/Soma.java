/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author 23862-6
 */
@Path("exercicio")
public class Soma {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Soma
     */
    public Soma() {
    }

    /**
     * Retrieves representation of an instance of rs.Soma
     *
     * @param tipo
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String
            getHtml(@QueryParam("tipo") String tipo, @QueryParam("number1") int number1,
                    @QueryParam("number2") int number2) {
        double op = 0;
        String msg = null;
        switch (tipo) {
            case "soma":
                op = number1 + number2;
                msg = number1 + " + " + number2 + " = " + op;
                return msg;

            case "multiplicacao":
                op = number1 * number2;
                msg = number1 + " * " + number2 + " = " + op;
                return msg;

            case "divisao":
                op = number1 / number2;
                msg = number1 + " / " + number2 + " = " + op;
                return msg;

            case "subtracao":
                op = number1 - number2;
                msg = number1 + " - " + number2 + " = " + op;
                return msg;
                
            default:
                msg = "Essa opera&ccedil;&otilde;o n&atilde;o existe, por favor utilize "
                    + "uma das opera&ccedil;&otilde;es abaixo:"
                    + "<p>soma</p>"
                    + "<p>subtracao</p>"
                    + "<p>multiplicacao</p>"
                    + "<p>divisao</p>";
                return msg;
        }

    }
}
