import java.util.Scanner;
//Inicio del programa y declaración de variabes:
public class p3_3_8{
	public static void main(String [] args) {
	Scanner dato= new Scanner(System.in);
	int gramos;
	int zona;
	//Solicitar peso y zona de envío
		System.out.println("Introduzca la zona donde lo va a enviar:");
		System.out.println("1-America del norte");
		System.out.println("2-America Central");
		System.out.println("3-America del Sur");
		System.out.println("4-Europa");
		System.out.println("5-Asia");
		zona= dato.nextInt();
		System.out.println("Introduzca el peso en gramos que va a mandar");
		gramos=dato.nextInt();
		//Revisaremos si se puede enviar el paquete
	   if (gramos>5000||gramos<=0){
		System.out.println("La cantidad introducidad no esta permitida");
	   } else {
			switch (zona){
			case 1:
			System.out.println("El paquete de "+ gramos + " kilogramos que  va a enviar a America del norte vale " + (gramos*24)+ " euros");
			break;
			case 2:
			System.out.println("El paquete de "+ gramos + " kilogramos que va a enviar a America Central vale " + (gramos*20)+ " euros");
			break;
			case 3:
			System.out.println("El paquete de "+ gramos + " kilogramos que va a enviar a America del Sur vale " + (gramos*21)+ " euros");
			break;
			case 4:
			System.out.println("El paquete de "+ gramos + " kilogramos que va a enviar a Europa vale " + (gramos*10)+ " euros");
			break;
			case 5:
			System.out.println("El paquete de "+ gramos + " kilogramos que va a enviar a Asia vale " + (gramos*18)+ " euros");
			break;
			default:
			System.out.println("La zona introducida es errónea");
			break;
			}
	   }
	}
}	