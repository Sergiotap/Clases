import java.util.Scanner;
public class P6_3_5 {
	public static void main(String[] args) {
		Scanner entr = new Scanner(System.in);
		double bas,pot;
		String fin;
		do {
			System.out.println("Introduce la base");
			bas=entr.nextDouble();
			System.out.println("Introduce la potencia");
			pot=entr.nextDouble();
			bas=Math.pow(bas,pot);
			System.out.println("El resultado es el siguiente: "+bas);
			System.out.println("Desea continuar? - Para finalizar escriba fin");
			entr.nextLine(); //limpiar buffer
			fin=entr.nextLine();
		} while (!fin.equalsIgnoreCase("fin"));
	}
}