Proceso P3_2_4
	//Entornos
	Definir name Como Caracter;
	Definir sueldo,irpf,ss,neto,acumu,tsueldo Como Real;
	//Bloque de variables
	Acumu <- 0;
	tsueldo <- 0;
	//Instrucciones
	Escribir "Introduzca su nombre completo";
	Leer name;
	Escribir "Introduzca su sueldo";
	Leer sueldo;
	Mientras sueldo > 0 Hacer
	irpf <- sueldo*0.12;
	Escribir "Se te reduce ", irpf ," de irpf";
	ss <- sueldo*0.052;
	Escribir "Se te reduce ", ss ," de Seguridad Social";
	neto <- sueldo-irpf-ss;
	Escribir "Lo que vas a cobrar manín es ", neto;
	acumu <- acumu+irpf+ss;
	tsueldo <- tsueldo+sueldo;
	Escribir "Introduzca su nombre completo";
	Leer name;
	Escribir "Introduzca su sueldo";
	Leer sueldo;
	Finmientras
	Escribir "El total otorgado al estado es el siguiente: ",acumu;
	Escribir "La empresa ha pagado un total de ",tsueldo;
FinProceso
