var chinga;
        var id_Usuario;
        var id_Empleado;
        function seleccionar(chinga) {
            document.getElementById("usuarioRd"+chinga+"/").checked = true;
            document.getElementById("consultar").disabled = false;
            document.getElementById("borrar").disabled = false;
        }
        function seleccionarE(chinga) {
            document.getElementById("empleadoRd"+chinga+"/").checked = true;
            document.getElementById("consultar").disabled = false;
            document.getElementById("borrar").disabled = false;
        }
