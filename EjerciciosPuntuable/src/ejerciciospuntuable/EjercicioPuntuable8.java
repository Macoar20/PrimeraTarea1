package ejerciciospuntuable;

import java.util.Scanner;

public class EjercicioPuntuable8 {

	public static void main(String[] args) {
		double infantil; //Declaramos la variable que hace referencia a las entradas infantiles
		double adulto; //Declaramos la variable que hace referencia a las entradas de adulto
		double total; //Declaramos la variable que hace referencia al total
		double descuento; //Declaramos la variable que hace referencia al descuento en caso de necesitarlo
		//Creamos el escáner
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Necesito que me digas cuantas entradas infantiles y adultas hemos vendido"); //Le pedimos al usuario 2 números enteros que harán referencia a la cantidad de entradas vendidas de cada variable
		infantil = ma.nextDouble(); //Introduce la variable que hará referencia al total de entradas infantiles vendidas
		adulto = ma.nextDouble(); //Introduce la variable que hará referencia al total de entradas adultas vendidas
		infantil *= 15.50; //Mediante este comando aplicamos directamente la multiplicación para observar los beneficios infantiles
		adulto *= 20; //Mediante este comando aplicamos directamente la multiplicación para observar los beneficios adultos
		descuento = 5/100; //Declaramos como funcionará el descuento
		total = infantil+adulto > 100 ? infantil+adulto - descuento : infantil+adulto; //Creamos el comando mediante un ternario para aplicar el descuento en caso de necesitarlo, que será si el valor supera el número 100
		System.out.println("Los beneficios totales serán de "+ total +" $"); //Hacemos que se introduzca el precio total final tras aplicar o no aplicar el descuento, dependiendo de lo anterior
		ma.close(); //Cerramos el escáner
	}

}
