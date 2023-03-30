import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// Declaro mi scanner para obtener una cadena
		Scanner cad = new Scanner(System.in);
		System.out.println("Pofr favor ingresa una frase: ");
		String cadena = cad.nextLine();
		cad.close(); //cierro mi scanner
		
		String cadenaInv = "";
		for(int i = cadena.length()-1 ; i>=0 ; i--) {
			cadenaInv += cadena.charAt(i);//voy metiendo cada caracter recorrido a mi cadena vacia
		}
		System.out.println("Cadena al revés: ");
		System.out.println(cadenaInv);
	}

}