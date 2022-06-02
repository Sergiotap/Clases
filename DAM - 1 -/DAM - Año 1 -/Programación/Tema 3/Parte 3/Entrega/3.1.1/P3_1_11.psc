Proceso P3_1_11
	
	//Bloque de definiciones
	Definir a,b,c,numa,numd,numt Como Real;
	
	//Bloque de introducción
	Escribir "Introduzca el valor A";
	Leer a;
	Escribir "Introduzca el valor B";
	Leer b;
	Escribir "Introduzca el valor C";
	Leer c;
	
	//Bloque de variables
	numa <- 0;
	numd <- 0;
	numt <- 0;
	
	//Bloque de instrucciones
	Si a>b y a>c y b>c Entonces
		numa	<- (numa+a);
		numd <- (numd+b);
		numt <- (numt+c);
		
	SiNo
		Si a>b y a>c y c>b Entonces
			numa	<- (numa+a);
			numd <- (numd+c);
			numt <- (numt+b);
			
		Sino
			Si b>a y b>c y a>c Entonces
				numa	<- (numa+b);
				numd <- (numd+a);
				numt <- (numt+c);
				
			SiNo
				Si b>a y b>c y c>a Entonces
					numa	<- (numa+b);
					numd <- (numd+c);
					numt <- (numt+a);
					
				SiNo
					Si c>a y c>b y a>b Entonces
						numa	<- (numa+c);
						numd <- (numd+a);
						numt <- (numt+b);
						
					SiNo
						Si c>a y c>b y b>a Entonces
							numa	<- (numa+c);
							numd <- (numd+b);
							numt <- (numt+a);
						Finsi
						
					FinSi
					
				FinSi
				
			FinSi
			
		FinSi
		
	FinSi
	
	Escribir numa, " > ", numd, " > " ,numt, " Se han ordenador de mayor a menor";
	
	
	
	
FinProceso 
