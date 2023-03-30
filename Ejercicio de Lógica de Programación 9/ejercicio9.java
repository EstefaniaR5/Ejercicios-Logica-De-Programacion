import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio9 {
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
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa una palabra en español: ");
		String palabra = scanner.nextLine();
		
		if(dictionary.containsKey(palabra)) {
			System.out.println("Traduccion: " + dictionary.get(palabra));
		}
		else {
			System.out.println("La palabra no se encuentra en el diccionario");
		}
		scanner.close();
	}
}