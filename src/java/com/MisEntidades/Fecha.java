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
@Table(name = "fecha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fecha.findAll", query = "SELECT f FROM Fecha f"),
    @NamedQuery(name = "Fecha.findByIdFecha", query = "SELECT f FROM Fecha f WHERE f.idFecha = :idFecha"),
    @NamedQuery(name = "Fecha.findByDiaFecha", query = "SELECT f FROM Fecha f WHERE f.diaFecha = :diaFecha"),
    @NamedQuery(name = "Fecha.findByMesFecha", query = "SELECT f FROM Fecha f WHERE f.mesFecha = :mesFecha"),
    @NamedQuery(name = "Fecha.findByA\u00f1oFecha", query = "SELECT f FROM Fecha f WHERE f.a\u00f1oFecha = :a\u00f1oFecha"),
    @NamedQuery(name = "Fecha.findByIdHora", query = "SELECT f FROM Fecha f WHERE f.idHora = :idHora"),
    @NamedQuery(name = "Fecha.findByDisponibleFecha", query = "SELECT f FROM Fecha f WHERE f.disponibleFecha = :disponibleFecha")})
public class Fecha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fecha")
    private Integer idFecha;
    @Basic(optional = false)
    @Column(name = "dia_fecha")
    private int diaFecha;
    @Basic(optional = false)
    @Column(name = "mes_fecha")
    private int mesFecha;
    @Basic(optional = false)
    @Column(name = "a\u00f1o_fecha")
    private int añoFecha;
    @Basic(optional = false)
    @Column(name = "id_hora")
    private int idHora;
    @Basic(optional = false)
    @Column(name = "disponible_fecha")
    private boolean disponibleFecha;

    public Fecha() {
    }

    public Fecha(Integer idFecha) {
        this.idFecha = idFecha;
    }

    public Fecha(Integer idFecha, int diaFecha, int mesFecha, int añoFecha, int idHora, boolean disponibleFecha) {
        this.idFecha = idFecha;
        this.diaFecha = diaFecha;
        this.mesFecha = mesFecha;
        this.añoFecha = añoFecha;
        this.idHora = idHora;
        this.disponibleFecha = disponibleFecha;
    }

    public Integer getIdFecha() {
        return idFecha;
    }

    public void setIdFecha(Integer idFecha) {
        this.idFecha = idFecha;
    }

    public int getDiaFecha() {
        return diaFecha;
    }

    public void setDiaFecha(int diaFecha) {
        this.diaFecha = diaFecha;
    }

    public int getMesFecha() {
        return mesFecha;
    }

    public void setMesFecha(int mesFecha) {
        this.mesFecha = mesFecha;
    }

    public int getAñoFecha() {
        return añoFecha;
    }

    public void setAñoFecha(int añoFecha) {
        this.añoFecha = añoFecha;
    }

    public int getIdHora() {
        return idHora;
    }

    public void setIdHora(int idHora) {
        this.idHora = idHora;
    }

    public boolean getDisponibleFecha() {
        return disponibleFecha;
    }

    public void setDisponibleFecha(boolean disponibleFecha) {
        this.disponibleFecha = disponibleFecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFecha != null ? idFecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fecha)) {
            return false;
        }
        Fecha other = (Fecha) object;
        if ((this.idFecha == null && other.idFecha != null) || (this.idFecha != null && !this.idFecha.equals(other.idFecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.MisEntidades.Fecha[ idFecha=" + idFecha + " ]";
    }
    
}
