package cz.brightbox.fujbackend;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.FileNotFoundException;

@Path("resources")
public class Resources {

    @GET
    @Path("data")
    public Response getPrices() {
        try {
            return Response.ok(JsonLoader.loadJson("data.json")).build();
        } catch (Exception e) {
            return Response.status(500, "Soubor nenalezen.").build();
        }
    }
}
