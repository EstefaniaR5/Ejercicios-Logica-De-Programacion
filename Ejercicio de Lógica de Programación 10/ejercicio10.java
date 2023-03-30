import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
Map<String, String> dictionary = new HashMap<>();
		
		dictionary.put("dolor","ache");
		dictionary.put("reconocer","acknowledge");
		dictionary.put("ventaja", "advantage");
		dictionary.put("comodo", "comfortable");
		dictionary.put("enfermedad", "disease");
		dictionary.put("tonto", "dumb");
		dictionary.put("terremoto", "earthquake");
		dictionary.put("edificio", "building");
		dictionary.put("caos", "chaos");
		dictionary.put("isla", "island");
		dictionary.put("problema", "issue");
		dictionary.put("sueter", "sweater");
		dictionary.put("mitad", "half");
		dictionary.put("etiqueta", "label");
		dictionary.put("entusiasmo", "enthusiasm");
		dictionary.put("higiene", "hygiene");
		dictionary.put("tener", "have");
		dictionary.put("literatura", "literature");
		dictionary.put("musica", "musician");
		dictionary.put("increible", "unbelievable");
		
		int tradCorrecta = 0;
		int tradInconrrecta = 0;
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			int rd = (int) (Math.random() * dictionary.size());
			String palabra = (String) dictionary.keySet().toArray()[rd];
			System.out.println("Por favor traduce unicamente en minusuclas la palabra: " + palabra);
			
			String trad = scan.nextLine();
			// validando si la trad es correcta
			if(trad.equals(dictionary.get(palabra))) {
				System.out.println("Muy bien! Correcto");
				tradCorrecta++;
			} else {
				System.out.println("¡Lo siento! Incorrecto");
				tradInconrrecta++;
				System.out.println("La traduccion correcta es: "+ dictionary.get(palabra));
			}
		}
		scan.close();
		System.out.println("Has tenido " + tradCorrecta + " palabras correctas");
        System.out.println("Has tenido " + tradInconrrecta + " palabras erroneas");
	}
}