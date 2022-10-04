package ejerciciospuntuable;

import java.util.Scanner;

public class EjercicioPuntuable10 {

	public static void main(String[] args) {
		double lanzamiento; //Creamos la variable double
		//Creamos el escáner
		Scanner ma = new Scanner(System.in); 
		System.out.println("¿Cuántos metros ha recorrido el lanzamiento?");//Le pedimos al usuario que introduzca la longitud del lanzamiento
		lanzamiento = ma.nextDouble(); //El usuario introduce el valor de la variable
		lanzamiento *= 100; //Mediante el comando calcularemos la distancia en centímetros
		System.out.println("La distancia recorrida en centímetros son "+ (int) lanzamiento+ " centímetros"); //El sistema imprimirá el resultado final del lanzamiento
		ma.close(); //Cerramos el escaner

			}

}
