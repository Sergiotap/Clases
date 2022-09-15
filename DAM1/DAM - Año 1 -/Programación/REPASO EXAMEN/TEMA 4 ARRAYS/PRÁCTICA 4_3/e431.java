
public class e431 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A)
		int tabla [][] = new int[10][10]; 
		//B)
		for (int c = 0; c < 10; c++) {
			for (int f=0; f< 10; f++) {
				if (f%2==0) {
					tabla[f][c]=1;
				}else{
					tabla[f][c]=0;
				}
			}
		}
		//C
		for (int f = 0; f < 10; f++) {
			for (int c=0; c< 10; c++) {
				System.out.print("\t"+tabla[f][c]);
			}
			System.out.println("");
			
		}
	}
}