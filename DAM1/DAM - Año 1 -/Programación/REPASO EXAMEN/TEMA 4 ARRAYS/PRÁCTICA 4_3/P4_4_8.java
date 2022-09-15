//package p4_3;
import java.util.*;
public class Ej9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double potencias[][]=new double[20][2];
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < potencias.length; i++) {
			for (int j = 0; j < potencias[i].length; j++) {
				System.out.println("introduzca el exponente para la potencia en base 2: ");
				potencias[i][j]=sc.nextDouble();
				j++;
				potencias[i][j]=(Math.pow(2, (potencias[i][j-1])));
			}
		}
		for (int i = 0; i < potencias.length; i++) {
			for (int j = 0; j < potencias[i].length; j++) {
				System.out.print("\t"+potencias[i][j]);
			}
			System.out.println("\t");
		}
		sc.close();
	}
}
