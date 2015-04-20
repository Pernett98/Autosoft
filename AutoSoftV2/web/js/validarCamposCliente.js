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

$(document).ready(function() {
    $("#chingon").click(function() {
        $("#botones").html("<input type='submit' value='Actualizar' name='modificar' id='modificar'  class='botonoper1'/> <input type='submit' value='Eliminar' name='borrar' id='borrar'   class='botonoper1' />");
    });
});

function soloNumeros(event) {
    var code = event.charCode || event.keyCode;
    if ((code < 48) || (code > 57)) {
        if (window.event) {
            event.returnValue = false;
        } else {
            event.preventDefault();
        }

    }
}
function botonModificar(){
    $("#botones").html("<input type='submit' value='Actualizar' name='modificar' id='modificar'  class='botonoper1'/><input type='submit' value='Eliminar' name='borrar' id='borrar'   class='botonoper1' />");
}

function validarTodo() {

    if (validarCliente()) {
        if (validarNombre()) {
            if (validarApellido()) {
                if (validarFecha_Nacimiento()) {
                    if (validarGenero()) {
                        if (validarTelefono()) {
                            if (validarCelular()) {
                                if (validarPais()) {
                                    if (validarDepartamento()) {
                                        if (validarCiudad()) {
                                            if (validarDireccion()) {
                                                if (validarOcupacion()) {
                                                    if (validarEmpresa()) {
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
        return false;
    }
}
function validarCliente() {
    if ($("#id_Cliente").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar la identificación(CC)</div></div>");
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
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el apellido</div></div>");
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
function validarTelefono() {
    if ($("#telefono").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el telefono</div></div>");
        return false;
    }
    return true;
}
function validarCelular() {
    if ($("#celular").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el celular</div></div>");
        return false;
    }
    return true;
}
function validarPais() {
    if ($("#pais").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el pais</div></div>");
        return false;
    }
    return true;
}
function validarDepartamento() {
    if ($("#departamento").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el departamento</div></div>");
        return false;
    }
    return true;
}
function validarCiudad() {
    if ($("#ciudad").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar la ciudad</div></div>");
        return false;
    }
    return true;
}
function validarDireccion() {
    if ($("#direccion").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar la direccion</div></div>");
        return false;
    }
    return true;
}
function validarOcupacion() {
    if ($("#ocupacion").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar la ocupacion</div></div>");
        return false;
    }
    return true;
}
function validarEmpresa() {
    if ($("#empresa").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar la empresa</div></div>");
        return false;
    }
    return true;
}
function validarCorreo() {
    if ($("#correo").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar el correo</div></div>");
        return false;
    }
    return true;
}


