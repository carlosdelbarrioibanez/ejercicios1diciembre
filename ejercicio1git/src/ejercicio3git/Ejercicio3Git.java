package ejercicio3git; // Define el paquete al que pertenece esta clase

import java.util.Scanner; // Importa la clase Scanner para leer la entrada desde la consola

public class Ejercicio3Git { // Declara la clase principal Ejercicio3Git

	public static void main(String[] args) { // Método principal donde inicia el programa
		
		// Crear un objeto Scanner para capturar la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese un carácter
		System.out.print("Ingresa un carácter: ");
		
		// Lee la palabra o texto ingresado y extrae el primer carácter (posición 0)
		char caracter = scanner.next().charAt(0);

		// Comprobar si el carácter está entre la 'A' y la 'Z' mayúsculas
		if (caracter >= 'A' && caracter <= 'Z') {
			// Se ejecuta si el carácter es una letra mayúscula
			System.out.println("El carácter '" + caracter + "' es una letra MAYÚSCULA.");
		} else {
			// Se ejecuta si el carácter NO es una letra mayúscula
			System.out.println("El carácter '" + caracter + "' NO es una letra mayúscula.");
		}

		// Cerrar el objeto Scanner para liberar los recursos asignados
		scanner.close();
	}

}