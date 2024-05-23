let tablaPersonas = document.getElementById("tablaPersonas");
let formInsertar = document.getElementById("formInsertar");
let myModal = new bootstrap.Modal(document.getElementById('modalInsertar'));
let myModaleditar = new bootstrap.Modal(document.getElementById('modalActualizar'));
let formEditar = document.getElementById("formEditar");

formInsertar.addEventListener("submit", function (event) {

    event.preventDefault();
    insertarPersona()

});

formEditar.addEventListener("submit", function (event) {

    event.preventDefault();
    actualizarPersona()

});

function abrirEditar(tr){
    myModaleditar.show();
    const datos = [...tr.querySelectorAll("td")];
    formEditar.querySelector("#cedulaInsertar").value = datos[1].innerText;
    formEditar.querySelector("#nombresInsertar").value = datos[2].innerText;
    formEditar.querySelector("#apellidosInsertar").value = datos[3].innerText;
    formEditar.querySelector("#telefonoInsertar").value = datos[4].innerText;
    formEditar.querySelector("#direccionInsertar").value = datos[5].innerText;
    formEditar.querySelector("#emailInsertar").value = datos[6].innerText;

}




window.onload = () => cargarPersonas();



function cargarPersonas() {
    tablaPersonas.innerHTML = "";

    let endPoint = "https://codetesthub.com/API/Obtener.php";

    fetch(endPoint)
        .then(resp => resp.json())
        .then(data => {

         data.forEach(persona => {

            agregarPersona(persona);
            
         });
            
        });
}

function insertarPersona(){

    let endPoint = "https://codetesthub.com/API/Insertar.php"

    let datos = new FormData(formInsertar);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json"
        },
        body: datos
    };

    fetch(endPoint, configuracion)
        .then(resp => resp.json())
        .then(data => {
            console.log("la API responde con: ");
            console.log(data);
            cargarPersonas();

            if(data.status){

                
                formInsertar.reset();

            }else{
                alert('ERROR AL INSERTAR');
            }

            myModal.hide();
        });
}
function eliminarPersona(cedula){

    let endPoint = "https://codetesthub.com/API/Eliminar.php"

    let datos = new FormData();
    datos.append("cedula",cedula);

    let configuracion = {
        method: "POST",
        headers: {
        "Accept": "application/json",
        },
        body: datos
    };

    fetch(endPoint, configuracion)
        .then(resp => resp.json())
        .then(data => {

            if(data.status){
                cargarPersonas();
            }else{
                alert('No se pudo eliminar')
            console.log("la API responde con: ");
            console.log(data);
            }
            
});
}
function actualizarPersona(){

    let endPoint = "https://codetesthub.com/API/Actualizar.php"

    let datos = new FormData(formEditar);

    let configuracion = {
        method: "POST",
        headers: {
        "Accept": "application/json",
        },
        body: datos
    };

    fetch(endPoint, configuracion)
        .then(resp => resp.json())
        .then(data => {

            if(data.status){
                cargarPersonas();
            }else{
                alert('No se pudo actualizar')
            console.log("la API responde con: ");
            console.log(data);
            }

            myModaleditar.hide();
            
});
}

function agregarPersona(
    persona,
    i = tablaPersonas.querySelectorAll("tr").length
  ) {
    const tr = document.createElement("tr");
  
    const indice = document.createElement("td");
    indice.innerText = i + 1;
    tr.appendChild(indice);
  
    const datos = Object.values(persona).filter((e) => e !== "foto");
  
    datos.forEach((dato) => {
      const td = document.createElement("td");
      td.innerText = dato;
      tr.appendChild(td);
    });
  
    const divBorrar = document.createElement("td");
    divBorrar.className = "boton-borrar";
  
    const iconoBorrar = document.createElement("i");
    iconoBorrar.className = "bi bi-trash3";

    console.log(datos);
  
    divBorrar.appendChild(iconoBorrar);
    tr.appendChild(divBorrar);
    divBorrar.addEventListener("click", () => eliminarPersona(datos[0]));


  
    const divEditar = document.createElement("td");
    divEditar.className = "boton-editar";
  
    const iconoEditar = document.createElement("i");
    iconoEditar.className = "bi bi-pencil-square";
  
    divEditar.appendChild(iconoEditar);
    tr.appendChild(divEditar);
    divEditar.addEventListener("click", () => abrirEditar(tr));
  
    tablaPersonas.append(tr);
  }

