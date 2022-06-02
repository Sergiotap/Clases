// Importar el paquete(libreria)
//import java.util.*;

public class Practica_3_2_1 {
	public static void main (String args[]) {
		int day;
		String dayString;
		//crear un objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);
		
		System.out.print("Introduzca numero de dia de la semana:");
		day=dato.nextInt();   //Ejecutar el método nextInt() para capturar un entero
		
		// instrucción switch con tipo de datos int
		switch (day) {
			case 1:
				dayString = "Lunes";
				break;	
			case 2: 
				dayString = "Martes";
				break;		
			case 3: 
				dayString = "Miercoles";
				break;		
			case 4: 
				dayString = "Jueves";
				break;		
			case 5: 
				dayString = "Viernes";
				break;	
			case 6: 
				dayString = "Sabado";
				break;	
			case 7: 
				dayString = "Domingo";
				break;	
			default:
				dayString = "Dia inválido";
				break;	
		}
		System.out.println(dayString);

	}
}
