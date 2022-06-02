package p_7_6;

public class Empleado {
	
	//Atributos
	String nombre, departamento;
	int edad;
	double salario;
	
	//Constructores
	public Empleado() {};
	
	public Empleado(String nombre,String departamento,int edad, double salario) {
	this.nombre=nombre;
	this.departamento=departamento;
	this.edad=edad;
	this.salario=salario;
	}
	
	public Empleado(String nombre,String departamento) {
		this.nombre=nombre;
		this.departamento=departamento;
	}
	
	//Métodos
	public String toString() {
		return "nombre="+nombre+" dpto="+departamento+" edad="+edad+" salario="+salario;
	}
	
	public void listado() {
		
	}
	
	public static double totalPagado(Empleado[] emp) {
		double total=0;
		
		for (int i = 0; i < emp.length; i++) {
			total+=emp[i].salario;
		}
		return total;
	}
	
	public static void sacarListado(Empleado[] empleados) {
		System.out.println("DEPARTAMENTO\tEMPLEADO\t\tSALALRIO\n----------------------------------------------- ");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i].departamento+"\t\t"+empleados[i].nombre+"\t\t"+empleados[i].salario);
		}
	}
}
	
