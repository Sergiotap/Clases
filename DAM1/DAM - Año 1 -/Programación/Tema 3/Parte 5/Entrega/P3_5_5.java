import java.util.Scanner;
public class P3_5_5{
	public static void main(String[] args) {
		int num,mum,menum, fact, fact2, fact3,op;
		Scanner entr = new Scanner(System.in);
		fact3=0;
		do {	
			System.out.println("Introduce un numero factorial");
			num=entr.nextInt();
			if (num <1) {
				System.out.println("ERROR! debe introducir un valor superior a 0");
			}
		} while (num<1);
		do {	
		System.out.println("Introduce un segundo numero factorial");
			mum=entr.nextInt();
			if (mum <1 || mum<num) {
				System.out.println("ERROR! debe introducir un valor superior a "+num);
			}
		} while (mum<1 || mum<num);
		
		
		
		if (num!=mum) { menum=mum-num;
			} else { menum=1; };
			
			
			
			fact=num;
		for (int i=num-1;i>=1;i--) {
			fact=fact*i;
			};
			
			
			
			fact2=mum;
		for (int j=mum-1;j>=1;j--) {
			fact2=fact2*j;
			};
		
		System.out.println("menum-> "+menum);
		
			fact3=menum;
		for (int g=menum-1;g>=1;g--) {
			fact3=fact3*g;
			};
		
		
		
		
		System.out.println("fact1-> "+fact);
		System.out.println("fact2-> "+fact2);
		System.out.println("fact3-> "+fact3);
		
		op=fact2/(fact*fact3);
		
		System.out.println("op-> "+op);
	}
}