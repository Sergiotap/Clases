import java.util.Scanner;
import java.io.IOException;
public class P6_3_1 {
	public static void main(String [] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		int num,iden=0,iden2=0;
		String co;
		
		do {
			System.out.println("Introduce un número");
			num=entr.nextInt();
			iden++;
			if (num<0) {
			num=Math.abs(num);
			System.out.println("Número convertido a: "+num);
			iden2++;
			}
			System.out.println("Desea continuar?");
			entr.nextLine();
			co=entr.nextLine();
		} while (co.equalsIgnoreCase("si"));
		System.out.println("Usted ha insertado "+iden+" números y "+iden2+" numeros negativos");	
	}
}