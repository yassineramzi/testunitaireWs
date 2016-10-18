package com.ilm.api.factory;

import java.io.IOException;

import org.dozer.Mapper;
import org.easymock.EasyMock;

import com.ilm.api.models.PersonPresentation;
import com.ilm.metier.PersonService;
import com.ilm.model.Person;

public class MockFactoryPerson
{
    private PersonPresentation personPresentation;

    private Person person;

    public MockFactoryPerson()
    {
        personPresentation = new PersonPresentation();
        personPresentation.setId( new Long( 1 ) );
        personPresentation.setNom( "Nom Prenom" );
        personPresentation.setAdresse( "Adresse" );
        personPresentation.setTelephone( "06-66-66-66-66" );

        person = new Person();
        person.setId( new Long( 1 ) );
        person.setNom( "Nom Prenom" );
        person.setAdresse( "Adresse" );
        person.setTelephone( "06-66-66-66-66" );
    }

    public Mapper createMapper()
    {
        Mapper mapper = EasyMock.createMock( Mapper.class );
        EasyMock.expect( mapper.map( person, PersonPresentation.class ) ).andReturn( personPresentation );
        EasyMock.replay( mapper );
        return mapper;
    }

    public PersonService createPersonService()
        throws IOException
    {

        PersonService personService = EasyMock.createMock( PersonService.class );

        EasyMock.expect( personService.getPersonById( (long) 1 ) ).andReturn( person );
        EasyMock.expect( personService.getPersonById( (long) 2 ) ).andReturn( null );
        EasyMock.replay( personService );

        return personService;
    }
}
