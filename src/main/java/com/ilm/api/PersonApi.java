package com.ilm.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ilm.api.models.PersonPresentation;
import com.ilm.metier.PersonService;
import com.ilm.model.Person;

@Path("/personne/{idPersonne}")
@Api(value = "Tests unitaires WS - PERSONNE")
@Component
public class PersonApi
{
    @Autowired
    private PersonService personService;

    @Autowired
    private Mapper mapper;

    @GET
    @ApiOperation("Recherche une personne par son ID")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "person retrieved"),
        @ApiResponse(code = 404, message = "person not retrieved") })
    public PersonPresentation getPersonById( @PathParam("idPersonne") long id )
    {
        Person person = personService.getPersonById( id );
        if ( person != null )
        {
            PersonPresentation personPresentation = mapper.map( person, PersonPresentation.class );
            return personPresentation;
        }
        else
        {
            throw new WebApplicationException( "person not retrieved", Status.NOT_FOUND );
        }
    }
}
