package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	/*
	 * Escribir un programa que genere 20 números enteros aleatorios entre 0 y 10 y
	 * los almacene en una tabla. A continuación, debe solicitar al usuario un
	 * número entero. El programa debe eliminar de la tabla todos los números que
	 * sean mayores que un número dado. La tabla no está ordenada ni hay que
	 * ordenarla.
	 */

	public static void main(String[] args) {

		// Creemos los array y las variables pertinentes.
		int[] tabla = new int[20];

		int numBorrar;
		int index = 0;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle for que se repitirá 10 veces, asignando los números
		// aleatorios al array.
		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 10 + 1);

		}

		// Presentamos la tabla.
		System.out.println(Arrays.toString(tabla));

		// Wir fragen dem user nach der info wir brauchen.
		System.out.println("Dada la siguiente tabla, qué número eliminaría: ");
		numBorrar = sc.nextInt();

		// Hacemos un bucle que recorra la tabla pero se pare en los números
		// correspondientes.

		while (index < tabla.length) {

			if (tabla[index] >= numBorrar) {

				// Desplazamos los elementos a la derecha del elemento eliminado,
				// una posición a la izquierda.
				System.arraycopy(tabla, index + 1, tabla, index, tabla.length - index - 1);

				// Lo copiamos en la misma tabla, con una posición menos.
				tabla = Arrays.copyOf(tabla, tabla.length - 1);

			} else {
				
				index++;
			}
		}
		
		System.out.println(Arrays.toString(tabla));
	}

}
