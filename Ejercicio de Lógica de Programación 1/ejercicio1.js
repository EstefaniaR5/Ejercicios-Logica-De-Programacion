let num1 = prompt("Por favor ingresa el primer numero: ");
let num2 = prompt("Por favor ingresa el segundo numero: ");
let num3 = prompt("Por favor ingresa el tercer numero: ");

num1 = Number(num1);
num2 = Number(num2);
num3 = Number(num3);

let deMayorAMenor = [num1, num2, num3];
deMayorAMenor.sort(function(a, b){return b - a});
console.log(deMayorAMenor);

let deMenorAMayor = [num1, num2, num3];
deMenorAMayor.sort(function(a, b){return a - b});
console.log(deMenorAMayor);

if (num1 === num2 && num2 === num3) {
  console.log("ERROR! Los números son iguales", num1, num2, num3);
} 

let res = document.getElementById("res");
