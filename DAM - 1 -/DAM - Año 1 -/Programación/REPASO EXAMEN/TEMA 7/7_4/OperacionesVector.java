import java.util.Arrays;

public class OperacionesVector {
	
	public void cargar(int [] num){
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*101);
		}
	}
	
	public  void visualizar(int [] num) {
		int o=num.length/2;
		int l=0;
		for(int i: num) {
			System.out.printf(" %3d ",i);
			l++;
			if(l==o)System.out.println();
		}
	}
	public int max(int [] num){
			int MAX=0;
		for(int i=0;i<num.length;i++) {
			if(MAX<num[i])MAX=num[i];
		}
		return MAX;
	}
	public int minimo(int [] num){
		int MIN=num[0];		
		for(int i=0;i<num.length;i++) {
			if(MIN> num[i])MIN=num[i];
		}
		return MIN;
	}
	public double media(int [] num) {
		double medida,suma=0;
		suma=suma(num);
		/*
		for(int i=0;i<num.length;i++) {
			suma+=num[i];
			}
		*/
		medida=(double)suma/num.length;
		
		return medida;
	}
	public double mediana(int [] num) {
		double mediana=0;
		Arrays.sort(num);
		if(num.length%2==0) {
		mediana=((double)(num[num.length/2]+num[(num.length/2)-1])/2);
		}else {
			mediana=num[num.length/2];
		}
		return mediana;
	}
	public int suma(int [] num) {
		int suma=0;
		for(int i=0;i<num.length;i++) {
			suma+=num[i];
		}
		return suma;
	}
}