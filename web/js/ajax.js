function guardar(){
var usuario = document.querySelector("#usuario").value;
var clave = document.querySelector("#clave").value;
var selected = document.querySelector("#tipo");
var tipo = selected.options[selected.selectedIndex].text;
   
 var data = {
     "usuario":usuario,
     "clave":clave,
     "tipo":tipo
 }  
 
     $.ajax({
                data:  data,
                url:   'MiServlet',
                type:  'post',
                beforeSend: function () {
                        $("#resultado").html("Procesando, espere por favor...");
                },
                success:  function (response) {
                        $("#resultado").html(response);
                }
        });
}

    function registrarse(){
    
    var usuario = document.querySelector("#usuario").value;
var clave = document.querySelector("#clave").value;

 var data = {
     "usuario":usuario,
     "clave":clave
 }  
 
     $.ajax({
                data:  data,
                url:   'MiServletLogin',
                type:  'post',
                beforeSend: function () {
                        $("#resultado").html("Procesando, espere por favor...");
                },
                success:  function (response) {
                        $("#resultado").html(response);
                }
        });
}


