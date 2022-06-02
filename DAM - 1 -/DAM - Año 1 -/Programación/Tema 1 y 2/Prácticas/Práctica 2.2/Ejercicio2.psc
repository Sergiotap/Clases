Proceso Lapaguita
	
	//Entornos
	Definir name Como Caracter;
	Definir sueldo,irpf,ss,neto Como Real;
	//Instrucciones
	Escribir "Introduzca su nombre completo";
	Leer name;
	Escribir "Introduzca su sueldo";
	Leer sueldo;
	irpf <- sueldo*0.12;
	Escribir "Se te reduce", irpf ,"de irpf";
	ss <- sueldo*0.052;
	Escribir "Se te reduce", ss ,"de Seguridad Social";
	neto <- sueldo-irpf-ss;
	Escribir "Lo que vas a cobrar manín es", neto;
	
FinProceso
