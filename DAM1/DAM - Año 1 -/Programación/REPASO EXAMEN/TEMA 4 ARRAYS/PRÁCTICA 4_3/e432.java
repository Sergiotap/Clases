
public class e432 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//A)
				int diagonal [][] = new int[5][5]; 
				//B)
				for (int f = 0; f < diagonal.length; f++) {
					for (int c=0; c< diagonal[f].length; c++) {
						if(f==c){
							diagonal[f][c]=1;
						}else{
							diagonal[f][c]=0;
						}
					}
				}
				for (int f = 0; f < diagonal.length; f++) {
					for (int c=0; c< diagonal[f].length; c++) {
						System.out.print("\t"+diagonal[f][c]);
					}
					System.out.println("");
					
				}
	}

}
