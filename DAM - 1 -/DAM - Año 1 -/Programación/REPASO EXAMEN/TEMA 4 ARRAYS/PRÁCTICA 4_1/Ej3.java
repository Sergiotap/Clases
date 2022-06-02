public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int par[];
		par=new int[10];
		for (int i = 0; i < par.length; i++) {
			par[i]=(int)(Math.random()*80);
			System.out.println(par[i]);
			if(par[i]%2==0) {
				System.out.println(par[i]+", "+i);
			}
		}
	}
}
