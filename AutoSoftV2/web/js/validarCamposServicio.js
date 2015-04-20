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
    
    if (validarServicio()) {
        if (validarId_Empleado()) {
            if (validarId_Cliente()) {
                if (validarId_Vehiculo()) {
                    if (validarEstado()) {
                        if (validarFecha_Inicio()) {
                            return validarFecha_Fin();
                            
                        }
                        
                    }
                }
            }
        }
    }
    return false;
}

function validarServicio() {
    if ($("#id_Servicio").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar la identificación id_Servicio </div></div>");
        return false;
    }
    return true;
}

function validarId_Vehiculo() {
    if ($("#id_Vehiculo").val() == "0") {
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
function validarEstado() {
    if ($("#estado").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar estado</div></div>");
        return false;
    }
    return true;
}

function validarFecha_Inicio() {
    if ($("#fecha_Inicio").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar fecha_Inicio</div></div>");
        return false;
    }
    return true;
}
function validarFecha_Fin() {
    if ($("#estado_Civil").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar fecha_Fin</div></div>");
        return false;
    }
    return true;
}

