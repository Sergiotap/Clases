import java.util.Scanner;
import java.io.IOException;
public class P3_8_2 {
	public static void main(String[] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		int num,base,pos,resto,a;
		String rep="";
		do {
			System.out.println("Introduce el número que desee convertir");
			num=entr.nextInt();
			System.out.println("Introduce la base");
			base=entr.nextInt();
			pos=0;
			a=1;
			do {
				resto=num%base;
				pos=pos+(resto*a);
				a=a*10;
				num=num/base;
			} while (num!=0);
			System.out.println(pos);
			System.out.println("Desea convertir de nuevo?");
			System.out.println("(S/N");
			rep=System.in.read();
		}while(rep=="s");	
	}
}