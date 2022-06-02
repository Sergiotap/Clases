Proceso p3_1_7
	
	//Bloque de definiciones
	Definir a,r Como Real;
	
	//Instroducción de teclado
	Escribir "Introduzca un número para saber su ráiz";
	Leer a;
	
	//Bloque de instrucciones
	Si a > 0 Entonces
		r <- rc(a);
		Escribir "La raíz cuadrada es la siguiente: ",r;
		
	Sino
		Escribir "Error, ha introducido un valor negativo";
		
	FinSi
FinProceso
 