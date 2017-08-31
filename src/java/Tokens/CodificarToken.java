package Tokens;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;


public class CodificarToken {
    
    
    public String token (String usuario){
           String KEY = "mi_clave";
           long tiempo = System.currentTimeMillis();
    String jwt = Jwts.builder()
     .signWith(SignatureAlgorithm.HS256, KEY)
                   .setSubject("Lucio Gayoso")
                   .setIssuedAt(new Date(tiempo))
                   .setExpiration(new Date(tiempo+900000))
                   .claim("usuario", usuario)
                   .compact();
   
    return jwt;
    }
   
}
