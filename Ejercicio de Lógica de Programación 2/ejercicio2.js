/*delcaro mi variable */
var valor = prompt("Ingresa los grados celsius", 0);
valor = Number.parseInt(valor,10);

/*me aseguro de que sea un valor numerico */
while(isNaN(valor)){
    console.log("Error Ingresa un valor numerico")
    var valor = prompt("Ingresa los grados celsius", 0);
}

/* hago la conversion */
var Farenheit = valor*(9/5)+32
var Kelvin = valor+ 273.15;

/* muestro resultados por consola */
console.log("Grados Farenheit: " + Farenheit);
console.log("Grados Kelvin: " + Kelvin);

