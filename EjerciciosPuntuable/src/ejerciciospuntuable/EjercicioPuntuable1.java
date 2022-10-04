package ejerciciospuntuable;

import java.util.Scanner;

public class EjercicioPuntuable1 {

	public static void main(String[] args) {
		//Definimos las variables
				double decimal; //Declaramos nuestra primera variable, la que será el número decimal que pidamos al principio
				double b; //Declaramos la segundo variable, la cual nos permitirá rendondear el decimal anterior cuando transformemos esta a un int
				
				//Creamos el escáner que nos permitirá leer las variables mas tarde
				Scanner ma = new Scanner(System.in);
				
				//Introducimos un System.out.println para pedirle al usuario que escriba un número decimal
				System.out.println("¿Podría decirme un número decimal?");
				decimal = ma.nextDouble(); // Aquí leemos el número decimal que hemos escrito, el cual es nuestra variable
				b = decimal + 0.5; // Utilizaremos la variable b para redondear nuestro número decimal, ya que al sumarle 0,5 cuando este pase a ser un número entero, estará redondeado (ya que al introducir int, la aplicación trunca el número dejando solo la parte entera
				System.out.println("Su número redondeado es "+ (int) b); //Lanzamos un mensaje en el que muestre cual es el número rendondeado escogido por el usuario, utilizando un "int" antes de introducir nuestra variable b para que así nos aparezca como entero
				ma.close(); //Cerramos el escáner
				

			}
	}

