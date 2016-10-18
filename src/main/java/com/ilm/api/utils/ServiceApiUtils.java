package com.ilm.api.utils;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

public class ServiceApiUtils
{

    /**
     * Constructor.
     */
    private ServiceApiUtils()
    {
        // Classe utilitaire, construsteur privé
    }

    /**
     * @param list list to serialize
     * @return the response for list
     */
    public static Response buildResponseList( List<?> list )
    {
        ResponseBuilder rb = Response.ok( list );
        return rb.build();
    }
}
