/* declaro mi numero llamado fibo*/
let fibo;
/* condicional para validar numero ingresado para serie de Fibonacci */
do{
    fibo = Number(prompt("Por favor ingresa un numero mayor a 0: "));
}while(isNaN(fibo));
/*declaro mi array para guardar la serie*/
let fiboArr= [0,1];
/*voy agregando al array*/
for(let i=2;i<=fibo;i++){
    fiboArr[i] = fiboArr[i-1] + fiboArr[i-2];
}
/* mando resultado por consola */
console.log("La serie fibonacci de "+fibo+" es : "+fiboArr);