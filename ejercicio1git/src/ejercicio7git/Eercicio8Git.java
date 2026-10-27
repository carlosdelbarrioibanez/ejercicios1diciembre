package ejercicio7git; // Define el paquete al que pertenece esta clase

import java.util.Scanner; // Importa la clase Scanner para leer la entrada desde la consola

public class Ejercicio7Git { // Declara la clase principal Ejercicio7Git

	public static void main(String[] args) { // Método principal donde inicia la ejecución del programa
		
		// Crear un objeto Scanner para capturar la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar el primer número al usuario
		System.out.print("Ingresa el primer número: ");
		double num1 = scanner.nextDouble();

		// Solicitar el segundo número al usuario
		System.out.print("Ingresa el segundo número: ");
		double num2 = scanner.nextDouble();

		// Evaluar las tres posibilidades para mostrar un único mensaje final
		if (num1 > num2) {
			// Caso 1: El primer número es estrictamente mayor que el segundo
			System.out.println("El primer número (" + num1 + ") es mayor que el segundo (" + num2 + ").");
		} else if (num2 > num1) {
			// Caso 2: El segundo número es estrictamente mayor que el primero
			System.out.println("El segundo número (" + num2 + ") es mayor que el primero (" + num1 + ").");
		} else {
			// Caso 3: Ninguno es mayor que el otro, por lo tanto son iguales
			System.out.println("Ambos números son iguales (" + num1 + ").");
		}

		// Cerrar el objeto Scanner para liberar los recursos asignados
		scanner.close();
	}

}