import java.util.Scanner;

public class PruebaISO {

    public static void main(String[] args)  {
		
		String nombre;
		Scanner sc= new Scanner (System.in, "cp850");
		
		System.out.print("Nombre:");
		nombre=sc.nextLine();
		
		System.out.println("Nombre capturado "+nombre);
	}
}