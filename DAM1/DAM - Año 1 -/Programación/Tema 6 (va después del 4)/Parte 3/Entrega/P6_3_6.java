import java.util.Scanner;
import java.io.IOException;
public class P6_3_6 {
	public static void main (String [] args) {
		Scanner entr = new Scanner(System.in);
		double num, radical,resul;
		System.out.println("Introduce un numero");
		num=entr.nextInt();
		System.out.println("Introduce su radical");
		radical=entr.nextInt();
		
		resul=Math.pow(num,1/radical);
		System.out.println(resul);
		
		
	}
}