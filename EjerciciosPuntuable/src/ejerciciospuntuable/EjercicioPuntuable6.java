package ejerciciospuntuable;

import java.util.Scanner;

public class EjercicioPuntuable6 {

	public static void main(String[] args) {
		int segundos; //Declaramos la variable que hace referencia a los segundos
		int minutos; //Declaramos la variable que hace referencia a los minutos
		int horas; //Declaramos la variable que hace referencia a las horas
		//Creamos un escáner para poder permitirle al usuario introducir el valor de las variables
		Scanner ma = new Scanner(System.in);
		
		System.out.println("¿Podría darme una cantidad de segundos?"); //Le pedimos al usuario que introduzca una cantidad de segundos
		segundos = ma.nextInt(); //El usuario introducirá un valor para los segundos
		minutos = segundos/60; //Obtenemos el la cantidad de minutos existentes en esos segundos
		segundos = segundos%60; //Obtenemos el resto de los segundos restantes en la conversión a minutos
		horas = minutos/60; //Obtenemos la cantidad de horas existentes en esos minutos
		minutos = minutos%60; //Obtenos los minutos restantes al pasarlo a horas
		System.out.println("Eso es equivalente a "+ horas +" horas "+ minutos +" minutos "+ segundos +" segundos"); //Introducimos cada una de nuestras variables con la unidad correspondiente tras ellas, para que se entienda bien el resultado
		ma.close(); //Cerramos el escáner

	}

}
