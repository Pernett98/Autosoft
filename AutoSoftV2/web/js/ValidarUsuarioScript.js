function soloNumeros(event) {
var code =event.charCode || event.keyCode;
if ((code< 48) || (code> 57)){
if(window.event){
event.returnValue = false;
}else{
event.preventDefault();
}

}
}


$(document).ready(function() {
    $("#ValidarUsuario").submit(function() {
        $.post("ValidarUsuario", $("#ValidarUsuario").serialize(), function(data) {
            perfil = jQuery.trim(data);
            if (perfil === "1")
                document.location.href = "MenuEmpleado.jsp";
            else if (perfil === "2")
                document.location.href = "MenuEmpleado.jsp";
            else
                $("#mensaje-ingreso").html("<div id='principal'> <div id='notificacion'>Identificación o Contraseña Incorrectos</div></div>");
        });
        return false;
    });
});

