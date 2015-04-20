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
    
    if (validarEmpleado()) {
        if (validarCargo()) {
            if (validarNombre()) {
                if (validarApellido()) {
                    if (validarFecha_Nacimiento()) {
                        if (validarGenero()) {
                            if (validarEstado_Civil()) {
                                if (validarTelefono()) {
                                    if (validarPais()) {
                                        if (validarPais()) {
                                            if (validarDepartamento()) {
                                                if (validarCiudad()) {
                                                    if (validarDireccion()) {
                                                            return validarCorreo();
                                                        
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        
                    }
                }
            }
        }
    }
    return false;
}

function validarEmpleado() {
    if ($("#id_Empleado").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar la identificación(CC)</div></div>");
        return false;
    }
    return true;
}

function validarCargo() {
    if ($("#cargo").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el cargo</div></div>");
        return false;
    }
    return true;
}

function validarNombre() {
    if ($("#nombre").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el nombre</div></div>");
        return false;
    }
    return true;
}
function validarApellido() {
    if ($("#apellido").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar los apellidos</div></div>");
        return false;
    }
    return true;
}
function validarFecha_Nacimiento() {
    if ($("#fecha_Nacimiento").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar la fecha de nacimiento</div></div>");
        return false;
    }
    return true;
}

function validarGenero() {
    if ($("#genero").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el genero</div></div>");
        return false;
    }
    return true;
}
function validarEstado_Civil() {
    if ($("#estado_Civil").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el estado civil</div></div>");
        return false;
    }
    return true;
}function validarTelefono() {
    if ($("#telefono").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar un numero de telefono fijo</div></div>");
        return false;
    }
    return true;
}
function validarCelular() {
    if ($("#celular").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar un numero celular</div></div>");
        return false;
    }
    return true;
}
function validarPais() {
    if ($("#pais").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el pais de recidencia</div></div>");
        return false;
    }
    return true;
}
function validarDepartamento() {
    if ($("#departamento").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el departamento de recidencia</div></div>");
        return false;
    }
    return true;
}
function validarCiudad() {
    if ($("#ciudad").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar la ciudad de recidencia</div></div>");
        return false;
    }
    return true;
}
function validarDireccion() {
    if ($("#direccion").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar una direccion fisica</div></div>");
        return false;
    }
    return true;
}
function validarCorreo() {
    if ($("#correo").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar un correo electronico</div></div>");
        return false;
    }
    return true;
}
