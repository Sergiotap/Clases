// 1er. paso Importar el paquete(libreria)
import java.util.Scanner;

public class P_3_3_2_Bisiesto {
	public static void main (String args[]) {
		//Entorno
		int anio;
		//2º paso:instanciar objeto de la clase Scanner
		Scanner dato = new Scanner(System.in);
		do {
			System.out.print("\nIntroduzca un año a partir de 1900:");
			//3er. paso: uso del método nextInt()
			anio=dato.nextInt();
			if(anio<1900) System.out.print("El año introducido debe ser >= 1900");
		}while(anio<1900);
		
		if((anio%4==0 && anio%100!=100) || (anio%400==0)) 
			System.out.print("El año "+anio+" es bisiesto");
		else
			System.out.print("El año "+anio+" no es bisiesto");
	}
}
