/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MisEntidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vitalia Miranda
 */
@Entity
@Table(name = "club")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Club.findAll", query = "SELECT c FROM Club c"),
    @NamedQuery(name = "Club.findByIdClub", query = "SELECT c FROM Club c WHERE c.idClub = :idClub"),
    @NamedQuery(name = "Club.findByNombreClub", query = "SELECT c FROM Club c WHERE c.nombreClub = :nombreClub"),
    @NamedQuery(name = "Club.findByDireccionChub", query = "SELECT c FROM Club c WHERE c.direccionChub = :direccionChub"),
    @NamedQuery(name = "Club.findByTelefonoClub", query = "SELECT c FROM Club c WHERE c.telefonoClub = :telefonoClub"),
    @NamedQuery(name = "Club.findByAdministradorClub", query = "SELECT c FROM Club c WHERE c.administradorClub = :administradorClub")})
public class Club implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_club")
    private Integer idClub;
    @Basic(optional = false)
    @Column(name = "nombre_club")
    private String nombreClub;
    @Basic(optional = false)
    @Column(name = "direccion_chub")
    private String direccionChub;
    @Basic(optional = false)
    @Column(name = "telefono_club")
    private String telefonoClub;
    @Basic(optional = false)
    @Column(name = "administrador_club")
    private String administradorClub;

    public Club() {
    }

    public Club(Integer idClub) {
        this.idClub = idClub;
    }

    public Club(Integer idClub, String nombreClub, String direccionChub, String telefonoClub, String administradorClub) {
        this.idClub = idClub;
        this.nombreClub = nombreClub;
        this.direccionChub = direccionChub;
        this.telefonoClub = telefonoClub;
        this.administradorClub = administradorClub;
    }

    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public String getDireccionChub() {
        return direccionChub;
    }

    public void setDireccionChub(String direccionChub) {
        this.direccionChub = direccionChub;
    }

    public String getTelefonoClub() {
        return telefonoClub;
    }

    public void setTelefonoClub(String telefonoClub) {
        this.telefonoClub = telefonoClub;
    }

    public String getAdministradorClub() {
        return administradorClub;
    }

    public void setAdministradorClub(String administradorClub) {
        this.administradorClub = administradorClub;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClub != null ? idClub.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Club)) {
            return false;
        }
        Club other = (Club) object;
        if ((this.idClub == null && other.idClub != null) || (this.idClub != null && !this.idClub.equals(other.idClub))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.MisEntidades.Club[ idClub=" + idClub + " ]";
    }
    
}
