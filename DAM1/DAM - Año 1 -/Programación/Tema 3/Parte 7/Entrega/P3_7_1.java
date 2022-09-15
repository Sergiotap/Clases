import java.util.Scanner;
import java.io.IOException;
public class P3_7_1 {
	public static void main(String[] args) {
		int n,m,r;
		Scanner entr = new Scanner(System.in);
		System.out.println("Intoduce un valor");
		n=entr.nextInt();
		System.out.println("Introduce un valor");
		m=entr.nextInt();
		r=n%m;
		
		do {
		if (r==0) {
			System.out.println("El máximo ccomún divisor de los números introducidos son los siguientes: "+m);
		} else {
			n=m;
			m=r;
			r=n%m;
			if (r==0) {
			System.out.println("El máximo común divisor de los números introducidos son los siguientes: "+m);
				};
			};
		} while (r!=0);
	}
}