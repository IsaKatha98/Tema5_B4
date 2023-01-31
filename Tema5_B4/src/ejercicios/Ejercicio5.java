package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * El “número de la suerte” de una persona puede calcularse a partir de sus
	 * números favoritos. De entre estos, se seleccionan dos números diferentes al
	 * azar, que se eliminarán de la lista, pero en su lugar se añade la media
	 * aritmética de los dos eliminados a la lista de números favoritos. El proceso
	 * se repite hasta que solo quede un número, que resultará el número de la
	 * suerte para esa persona. Para calcular bien el número de la suerte es
	 * imprescindible que la lista de números se encuentre siempre ordenada. Escribe
	 * una aplicación que solicite al usuario sus números favoritos y calcula su
	 * número de la suerte.
	 */

	public static void main(String[] args) {

		// Creemos los array y las variables pertinentes.
		int tam;
		int index1;
		int index2;

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario la cantidad de números favoritos que tiene.
		System.out.println("Indique la cantidad de números favoritos que tiene: ");
		tam = sc.nextInt();

		// Creamos el array con dicho tamaño.
		int[] tabla = new int[tam];

		// Le preguntamos por sus números favoritos.
		for (int i = 0; i < tam; i++) {

			System.out.println("Indique sus números favoritos: ");
			tabla[i] = sc.nextInt();
		}

		// Ordenamos la tabla.
		Arrays.sort(tabla);

		// Mostramos el array.
		System.out.println(Arrays.toString(tabla));

		// Ahora hay que randominzar la posición de dos números, hacer la media, sustituir index1 con el nuevo valor y eliminar index2.
		//Hacemos un bucle while para que el bucle se repita hasta llegar a un valor.
		while(tabla.length!=1) {
			
			//hacemos un bucle que compruebe que los valores 1 y 2 no son iguales.
			
			index1 = (int) (Math.random() * tabla.length);
			
			do {
				
				index2 = (int) (Math.random() * tabla.length);
				
			} while (index1==index2);
			
			System.out.println("Los números elegidos son: "+index1+" y "+index2);
			
			//Hacemos la media de los valores, asignándolos a index1.
			tabla[index1]=(tabla[index1]+tabla[index2])/2;
			
			//Eliminamos la segunda posición. 
			// Desplazamos los elementos a la derecha del elemento eliminado,
			// una posición a la izquierda.
			System.arraycopy(tabla, index2 + 1, tabla, index2, tabla.length - index2 - 1);

			// Lo copiamos en la misma tabla, con una posición menos.
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
			
			//Ordenamos la tabla.
			Arrays.sort(tabla);
			
			//Mostramos el resultado
			System.out.println(Arrays.toString(tabla));
		}
		
		//Cerramos el escáner.
		sc.close();
		
	}

}
