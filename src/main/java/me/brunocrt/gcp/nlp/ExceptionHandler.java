package me.brunocrt.gcp.nlp;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ExceptionHandler implements ExceptionMapper<InvalidTextException> {

    @Override
    public Response toResponse(InvalidTextException ex) {
        //throw new IllegalStateException();
        return Response.status(400).entity(ex.getMessage()).build();
    }
}
