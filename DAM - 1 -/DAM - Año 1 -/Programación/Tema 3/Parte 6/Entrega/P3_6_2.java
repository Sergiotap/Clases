import java.util.Scanner;

public class P3_6_1 {
	public static void main(String[] args) {
		Scanner entr = new Scanner(System.in);
		int n,a,r,tot,cont,sum;
		System.out.println("Introduzca terminos");
		n=entr.nextInt();
		System.out.println("Introduzca primer termino");
		a=entr.nextInt();
		System.out.println("Introduzca razon");
		r=entr.nextInt();
		cont=1;
		tot=a;
		sum=a;
		do {
		tot=tot*r;
		sum+=tot;
		cont++;
		System.out.println(tot);
		} while (cont!=n);
		System.out.println("La suma seria la siguiente: "+sum);
		

		
		
		
		
	}
}

