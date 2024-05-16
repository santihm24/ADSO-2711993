let contentBotones = document.getElementById("contentBotones");
let nombrePokemon = document.getElementById("nombre");
let imagenPokemon = document.getElementById("imagen");

function consumoAPI(){
    
    let endPoint = "https://pokeapi.co/api/v2/pokemon";

    //Consumo - AJAX - asi se hace un consumo a una API
    fetch( endPoint )
    .then( resp => resp.json() )
    .then( data => {

        //Toda la logica
        console.log("La API responde con:");

        contentBotones.innerHTML = ""
        
    for (let index = 0; index < data.results.length; index++) {
        
        let temp = `<button class="btn btn-outline-dark col-12" onclick="cargarDetalle('${data.results[index].url}')">
                        <span class = "text-uppercase"> ${data.results[index].name} </span>
                    </button>`;

        contentBotones.innerHTML += temp;
       
    }

    });
}

function cargarDetalle(endPoint){
  
    fetch(endPoint)
    .then( resp => resp.json())
    .then( data => {
     
        nombrePokemon.innerText = data.name;
        imagenPokemon.src = data.sprites.other.dream_world.front_default;

    });
}