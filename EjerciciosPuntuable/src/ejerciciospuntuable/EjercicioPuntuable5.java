package ejerciciospuntuable;

import java.util.Scanner;

public class EjercicioPuntuable5 {

	public static void main(String[] args) {
		int a; //Declaramos la variable a
		int b; //Declaramos la variable b
		int c; //Declaramos la variable c
		int x; //Declaramos la variable x
		int y; //Declaramos la variable y
		//Creamos un escáner que nos permitirá introducir valores a nuestras variables
		Scanner ma = new Scanner(System.in);
		
		System.out.print("Podría darme un valor para a "); //Pedimos un valor para la variable a
		a = ma.nextInt(); //El usuario introducirá un valor a la variable 
		System.out.print("Podría darme un valor para b "); //Pedimos un valor para la variable a
		b = ma.nextInt(); //El usuario introducirá un valor a la variable 
		System.out.print("Podría darme un valor para c "); //Pedimos un valor para la variable a
		c = ma.nextInt(); //El usuario introducirá un valor a la variable 
		System.out.print("Podría darme un valor para x "); //Pedimos un valor para la variable a
		x = ma.nextInt(); //El usuario introducirá un valor a la variable 
		y = a*(x*x)+(b*x)+c; //Introducimos la fórmula que nos permitirá resolver la ecuación e igualarlo a y
		System.out.print("El valor de Y será: "+ y ); //Introducimos le resultado obtenido con la variable y
		ma.close(); //Cerramos el escáner

	}

}
