import java.util.*;
public class A_4_1_6_Notas {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		int aprobados=0,suspensos=0,contmedia=0,alumnos=4;		
		double media,suma=0;	
		double [] ArrayVector = new double [alumnos];
		for (int i=0; i<ArrayVector.length; i++) {
			System.out.println("Introduce la nota del alumno "+(i+1));
			do {
				ArrayVector[i]=entrada.nextDouble();
				if (ArrayVector[i]<0 || ArrayVector[i]>10) System.out.println("ERROR. La nota introducida tiene que estar entre 0 y 10. Prueba otra vez.");
			}while (ArrayVector[i]<0 || ArrayVector[i]>10);
			if (ArrayVector[i]<5) {
				suspensos++;
			}else { aprobados++; }
			suma=suma+ArrayVector[i];
			System.out.println(ArrayVector[i]);
		}
		media=suma/alumnos;
		for (int i=0; i<ArrayVector.length; i++) {
			if (ArrayVector[i]>media) {
				contmedia++;
			}
		}
		System.out.println("El numero de alumnos suspensos es de: "+suspensos);
		System.out.println("El numero de alumnos aprobados es de: "+aprobados);
		System.out.println("la nota media de la clase es de: "+media);
		System.out.println("Hay "+contmedia+" notas que estan por encima de la media");
	}
}