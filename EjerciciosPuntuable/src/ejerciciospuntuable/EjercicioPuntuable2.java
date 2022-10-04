package ejerciciospuntuable;

import java.util.Scanner;

public class EjercicioPuntuable2 {

	public static void main(String[] args) {
		//Definimos las variables
		int numero; //Variable que hará referencia al número introducido
		int resto; //Variable que se usará para la cuenta final
		int suma; //Variable que será el número a sumar para que sea múltiplo de 7
		//Creamos el escáner de nombre "ma"
		Scanner ma = new Scanner(System.in);
		//Le pedimos un número al usuario el cual será el que usaremos para operar
		System.out.println("¿Podría darme un número entero?");
		numero = ma.nextInt(); // Aquí introducimos le número
		resto = numero%7; //Operación para obtener el resto y así obtener el número necesario para ser múltiplo d e7
		suma = 7-resto; //Operación que nos dará el número a sumar 
		//Imprimimos el número obtenido en la operación final
		System.out.println("Usted necesita sumar "+ suma +" para que este sea múltiplo de 7");
		ma.close(); //Cerramos el escáner

	}

}

