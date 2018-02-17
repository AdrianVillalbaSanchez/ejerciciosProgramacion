package funciones;

public class ArrayUni {

	public static void muestraArray (int[] array) {
		
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
		
	}
	
	public static int[] generaArrayInt(int tamano, int maximo, int minimo) {

		int[] array = new int[tamano];

		for (int i = 0; i < tamano; i++) {
			int numero = (int) (Math.random() * maximo - minimo + 1) + minimo;
			array[i] = numero;
		}

		return array;
	}

	public static int minimoArrayInt(int[] array) {

		int minimo = 999;

		for (int i = 0; i < array.length; i++) {

			if (array[i] < minimo) {
				minimo = array[i];
			}

		}

		return minimo;

	}

	public static int maximoArrayInt(int[] array) {

		int maximo = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > maximo) {
				maximo = array[i];
			}

		}

		return maximo;
	}

	public static int mediaArrayInt(int[] array) {

		int acumulador = 0;

		for (int i = 0; i < array.length; i++) {
			acumulador += array[i];
		}

		return (acumulador / array.length);

	}

	public static boolean estaEnArrayInt(int[] array, int numero) {

		boolean resultado = false;
		int aux;

		for (int i = 0; i < array.length; i++) {

			aux = array[i];

			if (aux == numero) {
				resultado = true;
			}

		}

		return resultado;

	}

	public static int posicionEnArray(int[] array, int posicion) {

		int resultado = 0;

		if (posicion > array.length || posicion < 0) {
			System.out.println("La posicion que has indicado no se encuentra en el array.");
		} else {

			for (int i = 0; i < array.length; i++) {

				if (i == posicion) {
					
					System.out.print("En la posici�n " + posicion + " se encuentra el n�mero ");
					resultado = array[i];
					
				}

			}

		}

		return resultado;

	}
	
	public static int[] volteaArrayInt (int[] array) {
		
		int[] arrayAux = new int [array.length];
		int contador =  array.length-1;
		
		for (int i = array.length; i < array.length; i++) {
			
			arrayAux[i] = array[contador];
			contador--;
		}
		
		return arrayAux;
	}
	
	
	
	
	
	
	
	
	

}
