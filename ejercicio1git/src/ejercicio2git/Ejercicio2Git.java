package ejercicio2git; // Define el paquete al que pertenece esta clase

import java.util.Scanner; // Importa la clase Scanner para poder leer datos desde la consola

public class Ejercicio2Git { // Declara la clase principal Ejercicio2Git

	public static void main(String[] args) { // Método principal donde inicia la ejecución del programa
		
		// Crear un objeto Scanner para capturar la entrada del usuario desde la consola
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese un número entero
		System.out.print("Ingresa un número entero: ");
		
		// Leer el número entero ingresado y guardarlo en la variable 'numero'
		int numero = scanner.nextInt();

		// Comprobar si el residuo de la división entre 10 es igual a 0
		if (numero % 10 == 0) {
			// Se ejecuta si el número es divisible exactamente entre 10
			System.out.println("El número " + numero + " es múltiplo de 10.");
		} else {
			// Se ejecuta si la división entre 10 deja un residuo distinto de 0
			System.out.println("El número " + numero + " NO es múltiplo de 10.");
		}

		// Cerrar el objeto Scanner para liberar los recursos asignados
		scanner.close();
	}

}