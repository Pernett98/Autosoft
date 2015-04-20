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
    
    if (validarDetalle_ser()) {
        if (validarId_Servicio()) {
            if (validarId_Vehiculo()) {
                if (validarId_Cliente()) {
                    if (validarId_Empleado()) {
                        if (validartIpo_Servicio()) {
                            if (validarFecha_Inicio()) {
                                if (validarFecha_Fin()) {
                                    if (validarArticulos()) {
                                        if (validarDatos_Vehiculo()) {
                                            if (validarDatos_Servicio()) {
                                                if (validarCosto_Art()) {
                                                    if (validarCosto_Servicio()) {
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

function validarDetalle_ser() {
    if ($("#id_Detalle").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar id_Detalle</div></div>");
        return false;
    }
    return true;
}

function validarId_Servicio() {
    if ($("#id_Servicio").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar id_Servicio</div></div>");
        return false;
    }
    return true;
}

function validarId_Vehiculo() {
    if ($("#id_Vehiculo").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar id_Vehiculo</div></div>");
        return false;
    }
    return true;
}
function validarId_Cliente() {
    if ($("#id_Cliente").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar id_Cliente</div></div>");
        return false;
    }
    return true;
}
function validarId_Empleado() {
    if ($("#id_Empleado").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar id_Empleado</div></div>");
        return false;
    }
    return true;
}

function validarTipo_Servicio() {
    if ($("#tipo_Servicio").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar tipo de Servicio</div></div>");
        return false;
    }
    return true;
}
function validarFecha_Inicio() {
    if ($("#fecha_Inicio").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar fecha de inicio</div></div>");
        return false;
    }
    return true;
}function validarFecha_Fin() {
    if ($("#fecha_Fin").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar fecha fin</div></div>");
        return false;
    }
    return true;
}
function validarArticulos() {
    if ($("#articulos").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar articulos</div></div>");
        return false;
    }
    return true;
}
function validarDatos_Vehiculo() {
    if ($("#datos_Vehiculo").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar datos del vehiculo</div></div>");
        return false;
    }
    return true;
}
function validarDatos_Servicio() {
    if ($("#datos_Servicio").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar datos  del servicio</div></div>");
        return false;
    }
    return true;
}
function validarCosto_Art() {
    if ($("#costo_Art").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar costo de articulos</div></div>");
        return false;
    }
    return true;
}
function validarCosto_Servicio() {
    if ($("#costo_Servicio").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar costo del servicio</div></div>");
        return false;
    }
    return true;
}



