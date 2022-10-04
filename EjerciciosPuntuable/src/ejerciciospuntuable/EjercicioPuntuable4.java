package ejerciciospuntuable;

import java.util.Scanner;

public class EjercicioPuntuable4 {

	public static void main(String[] args) {
		float base; //Declaramos la variable base
		float altura; //Declaramos la variable altura
		double area; //Declaramos la variable area
		//Creamos un escáner que nos permitar leer las variables
		Scanner ma = new Scanner(System.in);
		System.out.println("Podría darme la base de un triángulo?"); //Preguntamos por un número al usuario que represente la base de un triángulo
		base = ma.nextFloat(); //Introducimos ese número
		System.out.println("Podría darme la altura de un triángulo?"); //Preguntamos por un número al usuario que represente la altura de un triángulo
		altura = ma.nextFloat(); //Introducimos ese número
		area = base*altura/2; //Mediante la fórmula del área obtenemos el resultado el cual se representa con la variable area
		System.out.println("El área de su triángulo será "+ area); //Introducimos ese resultado y lo representamos
		ma.close(); //Cerramos el escáner

	}

}
