import java.util.*;
 
public class P_3_2_6_Combinatoria_v2{
	
	public static void main(String args[]){
		
		int num1, num2, num3,resultado;
		
		Scanner entrada=new Scanner(System.in);
		
		do{
			System.out.println(" Introduce nª de elementos: ");
			num1= entrada.nextInt();
			if(num1<=0) System.out.println("No puedes introducir valores negativos o 0");
		}while (num1<0); 
				
		do{
			System.out.println(" Introduce el número de números a grupar: ");
			num2= entrada.nextInt();			
			if(num2<=0 || num2>num1) System.out.println("No puedes introducir valores negativos o 0, ni menores que numero 1");
		}while (num2<0 || num2>num1);
		
		num3=num1-num2;
		
		
		//Calculo de factorial de m-n
	
		resultado = factorial(num1)/(factorial(num2)*factorial(num3));
				
		System.out.println("El resultado de la operación de la combinatoria de factoriales es: "+resultado);	
	}
	
	public static int factorial(int n){
		int fac=n;
		if(n==0) fac=1;
		else{
			for(int contador=n-1;contador>=1;contador--){
				fac=fac*contador;
			}
		}
		return fac;
	}
	
}