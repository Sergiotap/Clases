import java.util.Scanner;
import java.io.IOException;
public class P3_7_2 {
	public static void main(String[] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		int n;
		int cont,acu;
		do {
			System.out.println("Introduzca un numero positivo");
			n=entr.nextInt();
			if (n<=0) {System.out.println("ERROR! Introduzca numeros positivos"); };
		} while (n<=0);
		cont=0;
		acu=0;
		do {
			cont++;
			if (n%cont==0 && n>cont) {
				acu+=cont;
				System.out.println(cont);
			};
		} while (cont!=n);
		if (acu==n) {
			System.out.println("El siguiente número se considera perfecto: "+cont);	
		} else {System.out.println("No se considera un número perfecto"); };
	}
}