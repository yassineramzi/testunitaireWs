package com.ilm.model;

import java.io.Serializable;

public class Person
    implements Serializable
{
    /** The serialVersionUID. */
    private static final long serialVersionUID = 4557242077581574261L;

    private Long id;

    private String nom;

    private String adresse;

    private String telephone;

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom( String nom )
    {
        this.nom = nom;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse( String adresse )
    {
        this.adresse = adresse;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone( String telephone )
    {
        this.telephone = telephone;
    }

}
