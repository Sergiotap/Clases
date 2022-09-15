
import java.util.Arrays;
import java.util.Scanner;

public class InsercionConDesplazamiento {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
    
	    int vector[]=new int[10];
	    boolean sw=true;
	    int p=0;
	    for(int i=0;i<vector.length;i++){
	        vector[i]=(int)(Math.random()*100);
	    }
	    
	    Arrays.sort(vector);
	   
	    visualizarVector(vector);
	           
	    System.out.println("\n\nIntroduzca el valor a intercalar");
	    int num = sc.nextInt();
		int i;
		
	    for(i=vector.length-1;i>0 && vector[i-1]>num;i--) {
	    	vector[i]=vector[i-1];        	
	    }
	    
	    vector[i]=num;
	    
	    visualizarVector(vector);
	}
	
	public static void visualizarVector(int [] v) {
		for (int j=0; j<v.length; j++) { 
			System.out.print("\t"+v[j]);
		}
	}
}
