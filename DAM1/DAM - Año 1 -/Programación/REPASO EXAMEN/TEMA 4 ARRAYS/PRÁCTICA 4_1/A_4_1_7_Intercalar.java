import java.util.*;
public class A_4_1_7_Intercalar {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		int [] TB_NUM = new int [100] ;
		int num;
		boolean sustituido=false;
		System.out.print("Tu vector es: ");
		for (int i=0; i<TB_NUM.length; i++)  {
			TB_NUM[i]=(int)(Math.random()*100);
			System.out.print(TB_NUM[i]+" ");
		}
		System.out.print("\nEl vector ordenado es: ");
		Arrays.sort(TB_NUM);
		for (int i=0; i<TB_NUM.length; i++)  {
			System.out.print(TB_NUM[i]+" ");
		}
		System.out.println("\nIntroduzca un numero para intercalarlo en el vector");
		num=entrada.nextInt();
		if (num>TB_NUM[TB_NUM.length-1]) {
			TB_NUM[TB_NUM.length-1]=num;
		}else {
			for (int i=0; i<TB_NUM.length && !sustituido; i++)  {
				if (num<TB_NUM[i]) {
				TB_NUM[i]=num;
				sustituido=true;
				}
			}
		}
		System.out.println("\nEl vector con el nuevo valor es:");
		for (int i=0; i<TB_NUM.length; i++)  {
			System.out.print(TB_NUM[i]+" ");
		}	
	}
}