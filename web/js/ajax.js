function guardar(){
var correo = document.querySelector("#correo").value;
var usuario = document.querySelector("#usuario").value;
var clave = document.querySelector("#clave").value;
var selected = document.querySelector("#tipo");
var tipo = selected.options[selected.selectedIndex].text;
   
  //var usu = btoa(usuario);
  //var cla = btoa(clave);
 var data = {
     "correo":correo,
     "usuario":usuario,
     "clave":clave,
     "tipo":tipo
 } ;
 
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

var usu = btoa(usuario);
  var cla = btoa(clave);
 var data = {
     "usuario":usu,
     "clave":cla
 };
 
     $.ajax({
                data:  data,
                url:   'MiServletLogin',
                type:  'get',
                beforeSend: function () {
                        $("#resultado").html("Procesando, espere por favor...");
                },
                success:  function (response) {
                        $("#resultado").html(response);
                }
        });
}


