import java.util.Scanner;
import java.io.IOException;
public class P6_2_1 {
	public static void main(String[] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		char fin,e;
		String pru,si;
		do {	
			System.out.println("Introduce una palabra");
			pru=entr.nextLine();
			System.out.println("Introduce una sílaba para saber su posición en la palabra");
			si=entr.nextLine();
			System.out.println("La posición de la sílaba "+si+" es la siguiente: "+pru.indexOf(si));
			if (pru.indexOf(si)<0) {System.out.println("ERROR! Debe introducir una sílaba que aparezca en la palabra inicial");};
			System.out.println("¿Desea continuar?");
			fin=(char)System.in.read();
			entr.nextLine();//Limpia buffer (guarda enter)
		} while (fin!='n' && fin!='N');
	}
}