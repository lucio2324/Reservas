package com.MiServlet;

import com.MisEntidades.Usuarios;
import com.javaBeans.javaBeans;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MiServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
       
        response.setContentType("text/html;charset=UTF-8");
        
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        String tipo = request.getParameter("tipo");
        Usuarios usu = new Usuarios();
        usu.setNombreUsuario(usuario);
        usu.setContraseñaUsuario(clave);
        usu.setTipoUsuario(tipo);
        
        javaBeans jbus = new javaBeans();
        
        
         List<Usuarios> validar = jbus.mostrarUsuarios();  
            PrintWriter out = response.getWriter();
            List<String> usBase = new ArrayList<String>();
            int i = 0;
            while (validar.size() > i) {
                  usBase.add(validar.get(i).getNombreUsuario());
            i++;
        }    
            if (usBase.contains(usuario)) {
                  out.print("El usuario ya existe");
                    return;
                }else {
                  jbus.guardar(usu);
                 out.print("Se guardo correctamente");
            }
    }
}
