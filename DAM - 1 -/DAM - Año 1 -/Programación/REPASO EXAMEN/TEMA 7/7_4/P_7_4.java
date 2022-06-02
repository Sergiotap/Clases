import java.util.*;
public class P_7_4 {
	
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		OperacionesVector candida = new OperacionesVector ();
		int datos;
		do {
		System.out.println("cuanto elementos queire: ");
		datos=sc.nextInt();
		}while(datos<=0);
		int[] num = new int [datos];
		
		candida.visualizar(num);
		
		candida.cargar(num);
		System.out.println();
		candida.visualizar(num);
		System.out.println();
		System.out.println("Valor Maximo :"+candida.max(num));
		System.out.println("Valor minimo :"+candida.minimo(num));
		System.out.println("Valor media :"+candida.media(num));
		System.out.println("Valor mediana :"+candida.mediana(num));
		candida.visualizar(num);
	}

	
}