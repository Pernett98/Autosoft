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
    
    if (validarVehiculo()) {
        if (validarId_Cliente()) {
            if (validarTipo_Vehiculo()) {
                if (validarMarca()) {
                    if (validarModelo()) {
                        if (validarFecha_Matricula()) {
                            if (validarFecha_Ult_Ser()) {
                                if (validarCombustible()) {
                                    if (validarKilometraje()) {
                                        if (validarHistorial_Vehiculo()) {
                                            return validarDatosVehiculo();
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

function validarVehiculo() {
    if ($("#id_Vehiculo").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar la identificación vehiculo</div></div>");
        return false;
    }
    return true;
}

function validarId_Cliente() {
    if ($("#id_Cliente").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar identificación cliente</div></div>");
        return false;
    }
    return true;
}

function validarTipo_Vehiculo() {
    if ($("#tipo_Vehiculo").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar tipo de vehiculo</div></div>");
        return false;
    }
    return true;
}
function validarMarca() {
    if ($("#marca").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar marca del vehiculo</div></div>");
        return false;
    }
    return true;
}
function validarModelo() {
    if ($("#modelo").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar modelo del vehiculo</div></div>");
        return false;
    }
    return true;
}

function validarFecha_Matricula() {
    if ($("#fecha_Matricula").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar fecha de matriculo</div></div>");
        return false;
    }
    return true;
}
function validarFecha_Ult_Ser() {
    if ($("#fecha_Ult_Ser").val() == "0") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar fecha_Ult_Ser</div></div>");
        return false;
    }
    return true;
}function validarCombustible() {
    if ($("#combustible").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar combustible </div></div>");
        return false;
    }
    return true;
}
function validarKilometraje() {
    if ($("#kilometraje").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar kilometraje</div></div>");
        return false;
    }
    return true;
}
function validarHistorial_Vehiculo() {
    if ($("#historial_Vehiculo").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar historial_Vehiculo</div></div>");
        return false;
    }
    return true;
}
function validarDatosVehiculo() {
    if ($("#datosVehiculo").val() == "") {
        $("#mensaje-emergente").html("<div id='principal'> <div id='notificacion2'>Debe ingresar datosVehiculo</div></div>");
        return false;
    }
    return true;
    }


