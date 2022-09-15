import java.util.Scanner;
public class Ejercicio_3_6_4_SumaNumeros {
    public static void main(String[] args) {
        int num;
		int contP=0, contI=0, contM3=0;
		int sumaP=0, sumaI=0, sumaM3=0;
		int valor=1;
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.print("Cuantos numeros quiere sumar");
			num=entrada.nextInt();
		}while(num<=0);
		
		while( contP<num || contI<num || contM3<num){
			if(valor%2==0 && contP<num){
				contP++;
				sumaP+=valor;
			} 
			if(valor%2!=0 && contI<num){
				contI++;
				sumaI+=valor;
			} 
			if(valor%3==0&& contM3<num){
				contM3++;
				sumaM3+=valor;	
			}
			valor++;		
		}
		System.out.println("La suma de los "+num+" primeros pares es :"+sumaP);
		System.out.println("La suma de los "+num+" primeros impares es :"+sumaI);
		System.out.println("La suma de los "+num+" primeros mult. 3 es :"+sumaM3);
		
	}
}