package ejercicios;

import java.util.Arrays;

public class Ejercicio1 {
	
	/*
	 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los 
	 * almacene en un array. El programa debe eliminar todos los números impares.
	 */

	public static void main(String[] args) {
		
		//Creamos los arrays y las variables pertinentes.
		int [] tabla= new int[20];
		int index=0;
		
		
		
		//Creamos un bucle for que se repitirá 20 veces, asignando los números aleatorios al array.
		for (int i=0; i<tabla.length; i++) {
			
			tabla[i]=(int) (Math.random()*100+1);
			
		}
		
		//Ahora establecemos un bucle que recorra la tabla pero se detenga en los números impares.
		while (index<tabla.length) {
			
			//En caso de que en encuentre un número impar.
			if (tabla[index]%2!=0) {
				
				//Desplazamos los elementos a la derecha del elemento eliminado,
				//una posición a la izquierda.
				System.arraycopy(tabla, index+1, tabla, index, tabla.length-index-1);
				
				//Lo copiamos en la misma tabla, con una posición menos.
				tabla= Arrays.copyOf(tabla, tabla.length-1);
			
			//En caso de que sean pares, aumentamos en 1 la posición, para que haga otro bucle.
			} else {
				
				index++;
			}
		}
			
		System.out.println(Arrays.toString(tabla));
	}

}
