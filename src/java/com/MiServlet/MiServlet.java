package com.MiServlet;

import EntidadesDao.UsuarioDAO;
import entidades.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MiServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
         String correo = request.getParameter("correo");
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        String tipo = request.getParameter("tipo");
        Usuarios usu = new Usuarios();
        usu.setEMailUsuario(correo);
        usu.setNombreUsuario(usuario);
        usu.setContrasenaUsuario(clave);
        usu.setTipoUsuario(tipo);
       
        PrintWriter out = response.getWriter();
        
        UsuarioDAO agregar = new UsuarioDAO();
     agregar.agregar(usu);
     out.print("funciono");
    }
}
