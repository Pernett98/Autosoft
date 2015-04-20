$(document).ready(function() {
    $("#consultar").click(function() {
        return validarUsuario();
    });
});

$(document).ready(function() {
    $("#crear").click(function() {
        return validarTodo();
    });
});

$(document).ready(function() {
    $("#modificar").click(function() {
        return validarTodo();
    });
});
function botonModificar(){
    $("#botones").html("<input type='submit' value='Actualizar' name='modificar' id='modificar'  class='botonoper1'/><input type='submit' value='Eliminar' name='borrar' id='borrar'   class='botonoper1' />");
}
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

function validarTodo() {
    if (validarUsuario()) {
        if (validarPerfil()) {
            if (validarContraseña()) {
                if (validarC_Contraseña()) {
                    return validarC_C();
                }
            }
        }
    }
    return false;
}

function validarUsuario() {
    if ($("#id_Usuario").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar una identificación para el usuario</div></div>");
        return false;
    }
    return true;
}

function validarPerfil() {
    if ($("#perfil").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar un perfil para el usuario</div></div>");
        return false;
    }
    return true;
}

function validarContraseña() {
    if ($("#contrasena").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar una contraseña para el usuario</div></div>");
        return false;
    }
    return true;
}

function validarC_Contraseña() {
    if ($("#c_contrasena").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar la confirmación de la contraseña</div></div>");
        return false;
    }
    return true;
}

function validarC_C() {
    if ($("#c_contrasena").val() != $("#contrasena").val()) {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Las contraseñas no coinciden</div></div>");
        return false;
    }
    return true;
}