import java.util.Scanner;
import java.io.IOException;
public class P3_6_5 {
	public static void main(String[] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		int r,n,m,tot;
		int cont;
		System.out.println("Introduzca el valor de N");
		n=entr.nextInt();
		cont=0;
		m=1;
		r=1;
		tot=1;
		if (m==1) {System.out.println("1");};
		while (cont<n-1) {
			cont+=1;
			System.out.println(tot);
			tot=m+r;
			m=r;
			r=tot;
		};
	}
}