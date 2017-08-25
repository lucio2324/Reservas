package com.MiServlet;

import com.MisEntidades.Usuarios;
import com.javaBeans.javaBeans;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MiServletLogin", urlPatterns = {"/MiServletLogin"})
public class MiServletLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        
            String usuario = request.getParameter("usuario");
            String clave = request.getParameter("clave");
            
            javaBeans jbu = new javaBeans();
            
            List<Usuarios> validar = jbu.mostrarUsuarios();  
            List<String> usBase = new ArrayList<String>();
            PrintWriter out = response.getWriter();
        
            int i = 0;
            while (validar.size() > i) {
           usBase.add(validar.get(i).getNombreUsuario()+
                   validar.get(i).getContraseñaUsuario());
           i++;
        }
            if (usBase.contains(usuario+clave)) {
            out.print("Es correcto");
        } else {
            out.print("El usuario o la contraseña son incorrectos");
        }
    }
}
