import java.util.Scanner;
public class velocidad {
	public static void main (String [] args) {
		Scanner entr = new Scanner(System.in);
		int distancia,tiempo,velocidadmax;
		double velocidad,velocidadmaxp,porcentaje;
		do {
			System.out.println("Introduce la cantidad de KMs");
			distancia=entr.nextInt();
			System.out.println("Introduce la velocidad máxima permitida");
			velocidadmax=entr.nextInt();
			System.out.println("Introduce la duración en segundos");
			tiempo=entr.nextInt();
			if (distancia>=0 !! velocidadmax>=0 !! tiempo>=0) {System.out.println("ojo");}
		} while (distancia>=0 && velocidadmax>=0 && tiempo>=0)
		
		
		velocidad=(distancia*3600)/((double)tiempo*1000);
		
		
		if (velocidad>velocidadmax*1.20) {
			System.out.println("PUNTOS");
		} else {
			if (velocidad>velocidadmax) {
				System.out.println("MULTA");
			} else {System.out.println("OK");}
		}
		

	}
}






