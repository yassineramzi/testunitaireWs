package com.ilm.api.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@ApiModel
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonPresentation
{
    @ApiModelProperty(value = "id", example = "1")
    private Long id;

    @ApiModelProperty(value = "nom", example = "\"NOM PRENOM\"")
    private String nom;

    @ApiModelProperty(value = "adresse", example = "\"ADRESSE\"")
    private String adresse;

    @ApiModelProperty(value = "telephone", example = "\"06-66-66-66-66\"")
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
