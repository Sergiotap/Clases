import java.util.Scanner;
public class P6_3_3 {
	public static void main (String [] args) {
		Scanner entr = new Scanner(System.in);
		double rc=0,rc2;
		String conti;
		do {
			do{
				System.out.println("Introduzca un número para calcular su raíz");
				rc=entr.nextDouble();
				if (rc<=0) {System.out.println("ERROR! debe introcir números superiores a 0");}
			} while (rc<=0);
			rc2=Math.sqrt(rc);
			System.out.println("La raíz cuadrada de "+rc+" es la siguiente: "+rc2+"");
			System.out.println("Desea continuar (Si/No)");
			entr.nextLine();
			conti=entr.nextLine();
		} while (conti.equalsIgnoreCase("Si"));
	}
}