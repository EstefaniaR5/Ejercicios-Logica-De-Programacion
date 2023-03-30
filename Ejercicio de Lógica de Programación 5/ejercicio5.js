/* declaro mis variables*/
const numSecreto= Math.floor(Math.random() * 100);
let numMagico;
let intento = [];

/* condicional para validar que sea numero*/
do{
    numMagico = Number(prompt("Por favor ingresa un numero entre 1 y 100: "));
    intento.push(numMagico); /* guardo los numeros en el arreglo*/
    const a = intento.length; /* cuento el numero de elem de mi arreglo intento*/
    if(numMagico === numSecreto){
        console.log("Felicidades, adivinaste el número secreto en "+ `${intento}`+ " un total de " + a+ " intentos");
    } else {
        console.log("Ups, el número secreto es incorrecto. Vuelve a intentarlo.");
    }
}while(numMagico!==numSecreto);


