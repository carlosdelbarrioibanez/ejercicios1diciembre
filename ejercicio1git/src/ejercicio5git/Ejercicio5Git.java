package ejercicio5git; // Define el paquete al que pertenece esta clase

import java.util.Scanner; // Importa la clase Scanner para leer la entrada desde la consola

public class Ejercicio5Git { // Declara la clase principal Ejercicio5Git

	public static void main(String[] args) { // Método principal donde inicia la ejecución del programa
		
		// Crear un objeto Scanner para capturar la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar el primer carácter al usuario
		System.out.print("Ingresa el primer carácter: ");
		// Lee la palabra ingresada y obtiene el primer carácter (posición 0)
		char caracter1 = scanner.next().charAt(0);

		// Solicitar el segundo carácter al usuario
		System.out.print("Ingresa el segundo carácter: ");
		// Lee la siguiente palabra e extrae su primer carácter
		char caracter2 = scanner.next().charAt(0);

		// Comprobar si AMBOS caracteres están entre la 'a' y la 'z' minúsculas
		if ((caracter1 >= 'a' && caracter1 <= 'z') && (caracter2 >= 'a' && caracter2 <= 'z')) {
			// Se ejecuta si los dos caracteres son letras minúsculas
			System.out.println("Ambos caracteres ('" + caracter1 + "' y '" + caracter2 + "') son letras MINÚSCULAS.");
		} else {
			// Se ejecuta si al menos uno de los caracteres NO es minúscula
			System.out.println("NO ambos caracteres son minúsculas.");
		}

		// Cerrar el objeto Scanner para liberar los recursos asignados
		scanner.close();
	}

}