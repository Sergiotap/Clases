Proceso P3_1_6
	
	//Bloque de definiciones
	Definir a,b,c,h,x,i Como Real;
	
	//Bloque de definiciones
	Escribir "Introduzca los valores de entrada - A - (Lado 1)";
	leer a;
	Escribir "Introduzca los valores de entrada - B - (Lado 2)";
	leer b;
	Escribir "Introduzca los valores de entrada - C - (Lado 3)";
	leer c;
	
	//Variables
	x <- 0;
	h <-0;
	i <-0;
	
	//Bloque de selección de hipotenusa
	Si a > b y a > c Entonces
		h <- h+a;
		x <- x+b;
		i <- i+c;
	
	Sino	
		Si b > a y b > c Entonces
			h <- h+b;
			x <- x+a;
			i <- i+c;
			
		Sino
			Si c > a y c > b Entonces	
				h <- h+c;
				x <- x+a;
				i <- i+b;
				
			FinSi
			
		Finsi
		
	FinSi
	
	//Instrucciones
	Si (x^2)+(i^2) = (h^2) Entonces
		Escribir "Es un triangulo rectángulo";
		
	SiNo
		Si (a=b y b<>c) o (a=c y b<>c) o (c=b y b<>a) Entonces
			Escribir "Es un triangulo isósceles";	
			
		SiNo
			Si a = b y a = c Entonces
				Escribir "Es un triangulo equilátero";
				
			Sino	
				Escribir "Es un triangulo escaleno";
				
			FinSi
			
		FinSi
		
	FinSi
	
FinProceso
