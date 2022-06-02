import java.util.*;

public class P3_3_2 {
	public static void main(String[] args) {
		
		int tiem;
		//Iniciar Scanner
		Scanner entr = new Scanner(System.in);
		System.out.println("Introduzca un anio para saber si es bisiesto");
		tiem=entr.nextInt();
		
		if (tiem%4==0 & tiem%100!=0 | tiem%400==0) {
			System.out.println("El anio introducido es bisiesto");
		} else	{
			System.out.println("El anio no es bisiesto");
		}
		
		
	}
}