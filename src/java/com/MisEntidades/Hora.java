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
@Table(name = "hora")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hora.findAll", query = "SELECT h FROM Hora h"),
    @NamedQuery(name = "Hora.findByIdHora", query = "SELECT h FROM Hora h WHERE h.idHora = :idHora"),
    @NamedQuery(name = "Hora.findByHoraHora", query = "SELECT h FROM Hora h WHERE h.horaHora = :horaHora"),
    @NamedQuery(name = "Hora.findByDisponibleHora", query = "SELECT h FROM Hora h WHERE h.disponibleHora = :disponibleHora")})
public class Hora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_hora")
    private Integer idHora;
    @Basic(optional = false)
    @Column(name = "hora_hora")
    private int horaHora;
    @Basic(optional = false)
    @Column(name = "disponible_hora")
    private boolean disponibleHora;

    public Hora() {
    }

    public Hora(Integer idHora) {
        this.idHora = idHora;
    }

    public Hora(Integer idHora, int horaHora, boolean disponibleHora) {
        this.idHora = idHora;
        this.horaHora = horaHora;
        this.disponibleHora = disponibleHora;
    }

    public Integer getIdHora() {
        return idHora;
    }

    public void setIdHora(Integer idHora) {
        this.idHora = idHora;
    }

    public int getHoraHora() {
        return horaHora;
    }

    public void setHoraHora(int horaHora) {
        this.horaHora = horaHora;
    }

    public boolean getDisponibleHora() {
        return disponibleHora;
    }

    public void setDisponibleHora(boolean disponibleHora) {
        this.disponibleHora = disponibleHora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHora != null ? idHora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hora)) {
            return false;
        }
        Hora other = (Hora) object;
        if ((this.idHora == null && other.idHora != null) || (this.idHora != null && !this.idHora.equals(other.idHora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.MisEntidades.Hora[ idHora=" + idHora + " ]";
    }
    
}
