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
@Table(name = "reservas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservas.findAll", query = "SELECT r FROM Reservas r"),
    @NamedQuery(name = "Reservas.findByIdReservas", query = "SELECT r FROM Reservas r WHERE r.idReservas = :idReservas"),
    @NamedQuery(name = "Reservas.findByIdCliente", query = "SELECT r FROM Reservas r WHERE r.idCliente = :idCliente"),
    @NamedQuery(name = "Reservas.findByIdClub", query = "SELECT r FROM Reservas r WHERE r.idClub = :idClub"),
    @NamedQuery(name = "Reservas.findByIdCancha", query = "SELECT r FROM Reservas r WHERE r.idCancha = :idCancha"),
    @NamedQuery(name = "Reservas.findByIdFecha", query = "SELECT r FROM Reservas r WHERE r.idFecha = :idFecha")})
public class Reservas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_reservas")
    private Integer idReservas;
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private int idCliente;
    @Basic(optional = false)
    @Column(name = "id_club")
    private int idClub;
    @Basic(optional = false)
    @Column(name = "id_cancha")
    private int idCancha;
    @Basic(optional = false)
    @Column(name = "id_fecha")
    private int idFecha;

    public Reservas() {
    }

    public Reservas(Integer idReservas) {
        this.idReservas = idReservas;
    }

    public Reservas(Integer idReservas, int idCliente, int idClub, int idCancha, int idFecha) {
        this.idReservas = idReservas;
        this.idCliente = idCliente;
        this.idClub = idClub;
        this.idCancha = idCancha;
        this.idFecha = idFecha;
    }

    public Integer getIdReservas() {
        return idReservas;
    }

    public void setIdReservas(Integer idReservas) {
        this.idReservas = idReservas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
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
        hash += (idReservas != null ? idReservas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservas)) {
            return false;
        }
        Reservas other = (Reservas) object;
        if ((this.idReservas == null && other.idReservas != null) || (this.idReservas != null && !this.idReservas.equals(other.idReservas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.MisEntidades.Reservas[ idReservas=" + idReservas + " ]";
    }
    
}
