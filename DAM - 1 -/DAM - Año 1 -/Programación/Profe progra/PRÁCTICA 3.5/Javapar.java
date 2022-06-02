import java.util.Scanner;

public class Javapar{;

public static void main (String[] args) {;
	Scanner dato= new Scanner(System.in);
	int numero, par;
		do {
            System.out.print("Introduce un número entero: ");
            numero = dato.nextInt();
			if (numero<=1){
				System.out.print("El número es incorrecto \n");
			}
		} while (numero<=1);
		
		//Mostrar los números pares desde el 1 hasta el número que nos digan
		System.out.println("Números pares desde 1 hasta " + numero + " : ");
        for (par=1 ; par < numero; par++) {
            if (par % 2 == 0) {
                System.out.println(par);
			}
		}		
	}	
}	