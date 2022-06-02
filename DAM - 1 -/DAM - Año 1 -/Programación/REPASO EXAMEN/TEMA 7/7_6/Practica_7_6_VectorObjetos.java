package p_7_6;

public class Practica_7_6_VectorObjetos {
	
	public static void main(String[] args) {
		
		Empleado empleados[]= new Empleado[5];
		
		empleados[0]=new Empleado("Grisha Jäeger","2",49,2000);
		empleados[1]=new Empleado("Reiner Braun","2",32,1500);
		empleados[2]=new Empleado("Armin Arlett","4",43,1900);
		empleados[3]=new Empleado("Jean Kirstein","1");
		empleados[4]=new Empleado("Karl Fritz","5");
		
		Empleado.sacarListado(empleados);
		
		System.out.println("\nEl total pagado por la empresa es "+Empleado.totalPagado(empleados));
	}
}
