package ejercicio6git; // Define el paquete al que pertenece esta clase

import java.util.Scanner; // Importa la clase Scanner para leer la entrada desde la consola

public class Ejercicio6Git { // Declara la clase principal Ejercicio6Git

	public static void main(String[] args) { // Método principal donde inicia la ejecución del programa
		
		// Crear un objeto Scanner para capturar la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar el primer número (dividendo) al usuario
		System.out.print("Ingresa el primer número (dividendo): ");
		double dividendo = scanner.nextDouble();

		// Solicitar el segundo número (divisor) al usuario
		System.out.print("Ingresa el segundo número (divisor): ");
		double divisor = scanner.nextDouble();

		// Comprobar si el divisor es igual a cero para evitar una división indeterminada
		if (divisor == 0) {
			// Se ejecuta si el divisor es 0, mostrando el aviso de error
			System.out.println("Error: No se puede dividir entre cero.");
		} else {
			// Se realiza la división y se almacena el resultado
			double resultado = dividendo / divisor;
			System.out.println("El resultado de la división es: " + resultado);
		}

		// Cerrar el objeto Scanner para liberar los recursos asignados
		scanner.close();
	}

}