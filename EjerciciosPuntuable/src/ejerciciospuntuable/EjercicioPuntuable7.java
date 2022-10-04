package ejerciciospuntuable;

import java.util.Scanner;

public class EjercicioPuntuable7 {

	public static void main(String[] args) {
		double milimetros; //Declaramos la variable que hace referencia a los milímetros
		double centimetros; //Declaramos la variable que hace referencia a los centímetros
		double metros; //Declaramos la variable que hace referencia a los metros
		double distancia; //Declaramos la variable que hace referencia a la distancia
		//Creamos un escáner para poder leer nuestras variables
		Scanner ma = new Scanner(System.in);
		
		System.out.println("¿Podría darme una distancia en milímetros?"); //Le pedimos al usuario que nos introduzca un número que hará referencia a la distancia en milímetros
		milimetros = ma.nextDouble(); //El usuario introducirá un valor para la variable
		System.out.println("¿Podría darme una distancia en centímetros?"); //Le pedimos al usuario que nos introduzca un número que hará referencia a la distancia en centímetros
		centimetros = ma.nextDouble(); //El usuario introducirá un valor para la variable
		System.out.println("¿Podría darme una distancia en metros?"); //Le pedimos al usuario que nos introduzca un número que hará referencia a la distancia en metros
		metros =  ma.nextDouble(); //El usuario introducirá un valor para la variable
		distancia = (milimetros/10)+centimetros+(metros*100); //Mediante factores de conversión calculamos la variable distancia
		
		System.out.println("La suma de las 3 longitudes será "+ distancia +" centímetros"); //Introducimos le resultado con la correspondiente unidad tras él
		ma.close(); //Cerramos el escáner

	}

}
