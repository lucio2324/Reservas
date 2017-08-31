package com.MiServlet;

import com.sun.xml.internal.messaging.saaj.util.Base64;
import java.io.IOException;
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

        
            String usu = request.getParameter("usuario");
            String cla = request.getParameter("clave");
            
            String usuario = Base64.base64Decode(usu);
            String clave = Base64.base64Decode(cla);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        
            String usu = request.getParameter("usuario");
            String cla = request.getParameter("clave");
            
            String usuario = Base64.base64Decode(usu);
            String clave = Base64.base64Decode(cla);

       
  }
}

