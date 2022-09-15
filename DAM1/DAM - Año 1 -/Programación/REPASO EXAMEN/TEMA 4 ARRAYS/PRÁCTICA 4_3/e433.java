import java.util.*;

public class e433 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/**System.out.println("Introduce cuántas filas quieres: ");
		
		*System.out.println("Introduce cuántas columnas quieres: ");
		*/
		int original [][] = new int[3][5];
		int camb[][]= new int [5][3];
		
		for (int f = 0; f < original.length; f++) {
			for (int c=0; c< original[f].length; c++) {
			original[f][c]=(int)(Math.random()*101);
			}
		}
		for (int f = 0; f < original.length; f++) {
			for (int c=0; c< original[f].length; c++) {
				System.out.print("\t"+original[f][c]);
			}
			System.out.println("");
			
		}
		System.out.println("\n");
		for (int f = 0; f < camb.length; f++) {
			for (int c=0; c< camb[f].length; c++) {
			camb[f][c]=original[c][f];
			}
		}
		for (int f = 0; f < camb.length; f++) {
			for (int c=0; c< camb[f].length; c++) {
				System.out.print("\t"+camb[f][c]);
			}
			System.out.println("");
			
		}
	}

}
