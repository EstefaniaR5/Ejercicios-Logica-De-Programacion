/* declaro mi numero*/
let numero;
/* condicional para validar numero */
if(isNaN(numero) || numero>0){
    numero = parseInt(prompt("Por favor ingresa un numero mayor a 0: "));
} else{
    alert("Ingresa un numero mayor a 0");
}
/* funcion factorial */
let factorial= 1;
for(let i = 2; i<=numero; i++){
    factorial *= i;
}


console.log(numero +"! : "+ factorial);