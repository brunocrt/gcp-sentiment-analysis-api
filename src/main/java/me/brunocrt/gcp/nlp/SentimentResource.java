package me.brunocrt.gcp.nlp;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/nlp")
public class SentimentResource {

    @GET
    @Path("/test")
    public Response test() throws Exception {
        return Response.ok("ok").build();
    }

    @GET
    @Path("/sentiment")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Analysis sentiment(@QueryParam("text") String text) throws Exception {
        return NaturalLanguageService.getInstance().analyse(text);
    }
}