import java.util.Scanner;
import java.io.IOException;
public class P6_1v2 {
	public static void main(String[] args) throws IOException {
		Scanner entr = new Scanner(System.in);
		String alumme, alumma, alum;
		char cont;
		int numme,numma;
		System.out.println("Introduce el nombre del alumno");
		alumme=entr.nextLine();
		alumma=alumme;
		do {
			System.out.println("Introduce otro nombre de alumno");
			alum=entr.nextLine();
			if (alum.length()>alumma.length()) {
				alumma=alum;
			} else {
				if (alum.length()<alumme.length()) {
					alumme=alum;
				};
			};
			System.out.println("¿Desea continuar? (Si/No)");
			cont=(char)System.in.read();
			alum=entr.nextLine(); //limpiador buffer
		} while (cont != 'n' && cont != 'N');
		System.out.println(alumma+" es cosiderado el nombre más largo de la lista introducida y tiene "+alumma.length()+" carácteres");
		System.out.println(alumme+" es cosiderado el nombre más corto de la lista introducida y tiene "+alumme.length()+" carácteres");
	}
}