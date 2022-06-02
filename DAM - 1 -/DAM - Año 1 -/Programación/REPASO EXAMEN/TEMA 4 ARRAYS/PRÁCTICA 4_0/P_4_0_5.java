import java.util.*;

public class P_4_0_5{
	public static void main (String [] args){
		
		String array [] = new String [5];
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca 5 paises: ");
		for(int i=0; i<array.length; i++){
			System.out.print((i+1)+": ");
			array[i]=sc.next();
		}
		
		for(String var: array){
			System.out.println(var);
		}
	}
}