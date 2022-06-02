import java.util.Scanner;
import java.io.IOException; //*** captura errores
public class Pruebachar {
	//captura de errores se debe importar " java.io.IOException
	public static void main(String[] args) throws IOException {
		char Letra1,Letra2,Letra3,Letra4;
		int codigoLetra;
		
		Scanner entr=new Scanner(System.in);
		
		codigoLetra=entr.nextInt();
		
		//System in read captura la primera letra, las demás las asigna a enter, etc contra barra, etc
		Letra1=(char)System.in.read();
		Letra2=(char)System.in.read();
		Letra3=(char)System.in.read();
		Letra4=(char)System.in.read();
		
		System.out.println("Letra capturada: "+Letra1);
		
		System.out.println("Letra capturada: "+Letra2);
		
		System.out.println("Letra capturada: "+Letra3);
		
		System.out.println("Letra capturada: "+Letra3);
		
	}
}