package com.ilm.api.test;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import com.ilm.api.PersonApi;

public class PersonApiServiceTest
    extends JerseyTest
{
    private static final String MOCK_SPRING_APPLICATION_CONTEXT = "classpath:applicationContextPersonne-test.xml";

    public Application configure()
    {
        ResourceConfig config = new ResourceConfig( PersonApi.class );
        config.property( "contextConfigLocation", MOCK_SPRING_APPLICATION_CONTEXT );
        forceSet( TestProperties.CONTAINER_PORT, "0" );
        return config;
    }

    @Test
    public void testGetPersonneByIdResponse200()
    {
        Response response = target( "/personne/1" ).request().get( Response.class );
        assertEquals( 200, response.getStatus() );
    }

    @Test
    public void testGetPersonneByIdResponse404()
    {
        Response response = target( "/personne/2" ).request().get( Response.class );
        assertEquals( 404, response.getStatus() );
    }
}
