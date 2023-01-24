package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
	 * menú con distintas opciones: Mostrar valores. Eliminar valor. Salir. La
	 * opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un
	 * valor V y eliminará todas las apariciones de V del array. El menú se repetirá
	 * indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el
	 * programa.
	 * 
	 */

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		String opcion;
		// Creemos los array y las variables pertinentes.
		int[] tabla = new int[10];

		int valor;
		int index;
		
		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle for que se repitirá 10 veces, asignando los números
		// aleatorios al array.
		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 100 + 1);

		}
		
		//Ordenamos el array.
		Arrays.sort(tabla);
		
		do {

			// Presentamos el menú al usuario y le pedimos que elija una opción.
			System.out.println("Elija una de las siguientes opciones: ");
			System.out.println("a) Mostrar los valores.");
			System.out.println("b) Introducir valores.");
			System.out.println("c) Salir.");

			System.out.println("Introduzca su selección: ");
			opcion = sc.next();

			switch (opcion) {

			case "A", "a":

				System.out.println(Arrays.toString(tabla));
				break;

			case "B", "b":

				// Solicitamos datos otra vez.
				System.out.println("Introduzca el valor que quiere eliminar: ");
				valor = sc.nextInt();

				// Buscamos en qué posición se encuentra ese valor.
				index = Arrays.binarySearch(tabla, valor);

				// En caso de que encuentre dicho valor.
				if (index >= 0) {

					// Desplazamos los elementos a la derecha del elemento eliminado,
					// una posición a la izquierda.
					System.arraycopy(tabla, index + 1, tabla, index, tabla.length - index - 1);

					// Lo copiamos en la misma tabla, con una posición menos.
					tabla = Arrays.copyOf(tabla, tabla.length - 1);

					System.out.println(Arrays.toString(tabla));

				} else {

					// Si no lo encuentra, mostramos un mensaje de error.
					System.out.println("No se encuentra ese valor.");
				}

				break;

			case "C", "c":

				System.out.println("Ha salido del programa.");
				break;

			default:
				System.out.println("Error. Opción no válida.");

			}

		} while (!opcion.equals("c") && !opcion.equals("C"));

	}

}
