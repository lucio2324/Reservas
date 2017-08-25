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
@Table(name = "cancha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cancha.findAll", query = "SELECT c FROM Cancha c"),
    @NamedQuery(name = "Cancha.findByIdCancha", query = "SELECT c FROM Cancha c WHERE c.idCancha = :idCancha"),
    @NamedQuery(name = "Cancha.findByDimencionesCancha", query = "SELECT c FROM Cancha c WHERE c.dimencionesCancha = :dimencionesCancha"),
    @NamedQuery(name = "Cancha.findByIdClub", query = "SELECT c FROM Cancha c WHERE c.idClub = :idClub"),
    @NamedQuery(name = "Cancha.findByIdFecha", query = "SELECT c FROM Cancha c WHERE c.idFecha = :idFecha")})
public class Cancha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cancha")
    private Integer idCancha;
    @Basic(optional = false)
    @Column(name = "dimenciones_cancha")
    private String dimencionesCancha;
    @Basic(optional = false)
    @Column(name = "id_club")
    private int idClub;
    @Basic(optional = false)
    @Column(name = "id_fecha")
    private int idFecha;

    public Cancha() {
    }

    public Cancha(Integer idCancha) {
        this.idCancha = idCancha;
    }

    public Cancha(Integer idCancha, String dimencionesCancha, int idClub, int idFecha) {
        this.idCancha = idCancha;
        this.dimencionesCancha = dimencionesCancha;
        this.idClub = idClub;
        this.idFecha = idFecha;
    }

    public Integer getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(Integer idCancha) {
        this.idCancha = idCancha;
    }

    public String getDimencionesCancha() {
        return dimencionesCancha;
    }

    public void setDimencionesCancha(String dimencionesCancha) {
        this.dimencionesCancha = dimencionesCancha;
    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public int getIdFecha() {
        return idFecha;
    }

    public void setIdFecha(int idFecha) {
        this.idFecha = idFecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCancha != null ? idCancha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cancha)) {
            return false;
        }
        Cancha other = (Cancha) object;
        if ((this.idCancha == null && other.idCancha != null) || (this.idCancha != null && !this.idCancha.equals(other.idCancha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.MisEntidades.Cancha[ idCancha=" + idCancha + " ]";
    }
    
}
