import java.util.Scanner;
import java.io.IOException;
public class P3_5_3{
	public static void main(String[] args) throws IOException {
		int num;
		Scanner entr = new Scanner(System.in);
		do {	
			System.out.println("Introduce un numero para saber cuantos pares tiene respecto al 1");
			num=System.in.read();
			if (num <1) {
				System.out.println("ERROR! debe introducir un valor superior a 0");
			}
		} while (num<=1);
		for (int i=1;i<=num;i++) {
			if (num%i==0) {
				System.out.println(i);
			}
		}
		System.out.println("Esta seria la lista completa de numeros pares entre 1 y "+num);
	}
}