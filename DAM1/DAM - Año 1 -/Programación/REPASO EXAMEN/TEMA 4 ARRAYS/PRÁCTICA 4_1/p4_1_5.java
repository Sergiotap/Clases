import java.util.Scanner;

public class p4_1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato=new Scanner(System.in);
		int estaturaTotal=0;
		float mediaEstatura=0;
		int bajos=0;
		int altos=0;
		
		System.out.println("Cuantos alumnos hay en clase:");
		int numalumnos=dato.nextInt();
		
		int array[]= new int[numalumnos];
		for(int i=0;i<array.length;i++) {
			System.out.println("Dime la altura del "+ (i+1) +"º en centimetros");
			array[i]=dato.nextInt();
		}
		for(int a=0;a<array.length;a++) {
			estaturaTotal=estaturaTotal+array[a];
		}
		mediaEstatura=estaturaTotal/(float)numalumnos;
		System.out.println("La altura media de los alumnos es: "+mediaEstatura);
		
		for(int b=0;b<array.length;b++) {
			if(mediaEstatura>array[b]){
				bajos++;
			}else {
				if(mediaEstatura<array[b]) {
					altos++;
				}
			}
		}
		System.out.printf("Hay %2d alumnos más altos que la media y %2d alumnos más bajos.", altos, bajos);
	}
}