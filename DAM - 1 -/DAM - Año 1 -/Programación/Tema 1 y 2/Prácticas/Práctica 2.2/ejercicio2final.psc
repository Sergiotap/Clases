Proceso Ejercicio
	
	//Entorno
	
	Definir name Como Caracter;
	Definir sueldo Como Real;
	Definir irpf Como Real;
	Definir ss Como Real;
	Definir impuesto Como Real;
	Definir neto Como Real;
	
	//Instrucciones
	
	Escribir "Introduzca su nombre por favor";
	Leer name;
	Escribir "Introduzca su sueldo al mes por favor";
	Leer sueldo;
	irpf <- sueldo*0.12;
	ss <- sueldo*0.052;
	impuesto <- irpf+ss;
	Escribir "Se le ha descontado un total de", impuesto;
	neto <- sueldo-impuesto;
	Escribir "Su sueldo neto es el siguiente", neto ;
	
FinProceso
