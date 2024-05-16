let contentBotones = document.getElementById("contentBotones");
let nombrePokemon = document.getElementById("nombre");
let imagenPokemon = document.getElementById("imagen");
let endPoint = "https://pokeapi.co/api/v2/pokemon?offset=0&limit=20";
let botones = document.getElementById("botones")

function consumoAPI() {


    let endPoint = "https://pokeapi.co/api/v2/pokemon";

    //Consumo - AJAX - asi se hace un consumo a una API
    fetch(endPoint)
        .then(resp => resp.json())
        .then(data => {

            //Toda la logica
            console.log("La API responde con:");

            contentBotones.innerHTML = ""

            for (let index = 0; index < data.results.length; index++) {

                let temp = `<button class="btn btn-outline-dark col-2 m-1" onclick="cargarDetalle('${data.results[index].url}')">
                        <span class = "text-uppercase"> ${data.results[index].name} </span>
                    </button>`;

                contentBotones.innerHTML += temp;

            }

        });
}

function cargarDetalle(endPoint) {

    fetch(endPoint)
        .then(resp => resp.json())
        .then(data => {

            nombrePokemon.innerText = data.name;
            imagenPokemon.src = data.sprites.other.dream_world.front_default;

        });
}
document.addEventListener("DOMContentLoaded", function () {

    consumoAPI()
})
function actualizar(endpoint){

    fetch(endpoint)
    .then(resp => resp.json())
    .then(data => {

        contentBotones.innerHTML = ""

        for (let index = 0; index < data.results.length; index++) {

            let temp = `<button class="btn btn-outline-dark col-2 m-1" onclick="cargarDetalle('${data.results[index].url}')">
                    <span class = "text-uppercase"> ${data.results[index].name} </span>
                </button>`;

            let atras = `<button class="btn btn-outline-danger col-2 m-1" onclick="actualizar"('${data.previous}')">
                 <span class = "text-uppercase"> ${data.results[index].name} </span>
                 </button>`;

            let siguiente = `<button class="btn btn-outline-danger col-2 m-1" onclick="actualizar"('${data.next}')>
            
                 </button>`

            contentBotones.innerHTML += temp;

            endPoint = endpoint;
            consumoAPI();
        }
    });
}

