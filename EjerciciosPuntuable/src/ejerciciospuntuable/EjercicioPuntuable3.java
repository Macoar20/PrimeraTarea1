package ejerciciospuntuable;

import java.util.Scanner;

public class EjercicioPuntuable3 {

	public static void main(String[] args) {
		int numero1; //Declaramos la variable 1
		int numero2; //Declaramos la variable 2
		int resto; //Declaramos la variable resto
		int multiplicidad; //Declaramos la variable multiplicidad
		//Creamos un escáner con el que imprimiremos los números
		Scanner ma = new Scanner(System.in);
		//Le pedimos al usuario que nos de 2 números enteros
		System.out.println("¿Podría darme dos números enteros?");
		numero1 = ma.nextInt(); //Introducimos el primer número gracias a la variable y el escáner
		numero2 = ma.nextInt(); //Introducimos el segundo número gracias a la variable y el escáner
		resto = numero1%numero2; //Operamos entre los propios números para obtener el resto
		multiplicidad = numero2-resto; //Con el resto podemos obtener el número para que sea múltiplo
		//Imprimimos es número y especificamos lo que es
		System.out.println("Usted necesita sumar "+ multiplicidad +" para que este sea múltiplo de "+ numero2);
		ma.close(); //Cerramos el escáner


    }

}


