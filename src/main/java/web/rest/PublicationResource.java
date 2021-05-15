package web.rest;

import service.PublicationService;
import service.dto.PublicationDTO;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PublicationResource {
    private final PublicationService publicationService;
    @Inject
    public PublicationResource(PublicationService publicationService) {
        this.publicationService = publicationService;
    }
    @POST
    @Path("/add-post")
    public Response addPost(PublicationDTO publicationDTO){
        System.out.println(publicationDTO.toString());
       return Response.ok().entity(publicationService.save(publicationDTO)).build();
    }
    @GET
    @Path("/posts")
    public Response findPosts(){
        return Response.ok().entity(publicationService.findPublication()).build();
    }
}
