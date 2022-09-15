import java.util.Scanner;
import java.io.IOException;
public class P6_2_3 {
	public static void main (String [] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		String nom,ape1,ape2;
			System.out.println("Introduce el nombre del alumno");
			nom=entr.nextLine();
			System.out.println("Introduce el primer apellido");
			ape1=entr.nextLine();
			System.out.println("Introduce el tercer apellido");
			ape2=entr.nextLine();
			nom=nom.concat(" "+ape1+" ").concat(ape2+" ");
			System.out.println(nom);	
		}
}