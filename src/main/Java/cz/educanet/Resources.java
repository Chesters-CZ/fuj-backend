package cz.educanet;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


@Path("polozky")
public class Resources {

    @GET
    @Path("data")
    public Response getPrices() {
        try {
            return Response.ok(JsonLoader.loadJson("/Users/user/Documents/GitHub/BEBrightbox/src/main/Java/cz/educanet/data.json")).build();
        } catch (Exception e) {
            return Response.status(444, "Soubor nenalezen.").build();
        }
    }
}
