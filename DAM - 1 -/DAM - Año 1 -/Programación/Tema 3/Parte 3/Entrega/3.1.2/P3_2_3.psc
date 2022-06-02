Proceso P3_2_3
	
	//Bloque de definiciones
	Definir num,j,cont,resul,a Como Entero;
	
	//Bloque de variables
	cont <- 0;
	a<-0;
	
	
	//Bloque de instrucciones
	
	Escribir "Introduzca la tabla que desea utilizar";
	Leer num;
	
	Para j<-0 Hasta 9 Con Paso 1 Hacer
		
		Escribir "Introduce el resultado de ", num, " por ",cont;
		leer resul;
		cont <- cont+1;
		a<-a+1;
		si resul = num * a Entonces
			Escribir "el resltado es correcto";
			
		FinSi
		
	FinPara
	
FinProceso
