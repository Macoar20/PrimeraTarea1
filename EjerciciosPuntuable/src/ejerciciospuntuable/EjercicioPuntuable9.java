package ejerciciospuntuable;

import java.util.Scanner;

public class EjercicioPuntuable9 {

	public static void main(String[] args) {
		int numero1; //Declaramos nuestra primera variable
		int numero2; //Declaramos nuestra segunda variable
		boolean total; //Declaramos un boolean que será necesario para obtener la respuesta final
		//Creamos un escaner
		Scanner ma = new Scanner(System.in);
		
		System.out.println("¿Me podrías dar 2 números?"); //Le pedimos al usuario que eintroduzca 2 números
		numero1 = ma.nextInt(); //Introduce la primera variable
		numero2 = ma.nextInt(); //Introduce la segunda variable
		total= numero1 == numero2 ? true : false; //Mediante el boolean obtendremos una respuesta u otra en función de si los números anteriores son iguales o no
		System.out.println("¿Son los dos números iguales?: "+ total); //Introducimos el resultado obtenido del boolean el cual os dará la respuesta
		ma.close(); //Cerramos el escáner

	}

}
