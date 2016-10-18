package com.ilm.metier.imp;

import org.springframework.stereotype.Service;

import com.ilm.metier.PersonService;
import com.ilm.model.Person;

@Service
public class DefaultPersonService
    implements PersonService
{

    public Person getPersonById( Long id )
    {
        if ( id == 1 )
        {
            Person person = new Person();
            person.setId( new Long( 1 ) );
            person.setNom( "Nom" );
            person.setAdresse( "Adresse" );
            person.setTelephone( "06-66-66-66-66" );
            return person;
        }
        else
        {
            return null;
        }

    }

}
