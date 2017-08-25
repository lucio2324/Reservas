/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaBeans;

import com.JpaEntidades.UsuariosJpaController;
import com.MisEntidades.Usuarios;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class javaBeans {
    private EntityManagerFactory emf;
    private UsuariosJpaController usuarioControl;
    public javaBeans(){
    emf = Persistence.createEntityManagerFactory("ReservasPU");
    usuarioControl = new UsuariosJpaController(emf);
    }
    
    public void guardar (Usuarios usuarios){
        usuarioControl.create(usuarios);
    }
    public List<Usuarios> mostrarUsuarios(){
    return usuarioControl.findUsuariosEntities();
    }
}
