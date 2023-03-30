import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		// Declaro mi scanner para obtener un día de la semana
		Scanner cad = new Scanner(System.in);
		System.out.println("Por favor ingresa un numero del 0 al 4 para cada día de la semana, considerando el número 0 para viernes, 1 para jueves, etc. y 4 para lunes: ");
		int numDia = cad.nextInt();
		

		// obtener horas y minutos por Scanner
		Scanner hr = new Scanner(System.in);
		System.out.println("Por favor ingresa una hora en formato 24 hrs");
		int hora = hr.nextInt();
		
		Scanner mn = new Scanner(System.in);
		System.out.println("Por favor ingresa minutos del 1 al 60");
		int min = mn.nextInt();
		mn.close(); //cierro mi scanner
		
		
		//llamo mi funcion difHoras
		int faltanteFS = difHoras(numDia, hora, min);
		System.out.println("Faltan " + faltanteFS + " minutos para el fin de semana!!!");
	} //cierro metodo void
	
	
	//abro metodo para diferencia de horas
	public static int difHoras(int numDia, int hora, int min) {
        int calculo = 0;
        if (numDia == 5 && hora >= 15) {
        	calculo= 0;
        } else{
        	calculo = (numDia * 24 * 60);
            if (hora >= 15) {
            	calculo += (hora - 15) * 60;
            } else {
            	calculo += (15 - hora) * 60;
            }
            calculo += min;
        }
        return calculo;
    }
}