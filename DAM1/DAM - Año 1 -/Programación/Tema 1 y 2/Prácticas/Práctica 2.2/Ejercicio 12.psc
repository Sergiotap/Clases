Proceso P2_2_12
	
	Definir r,m,h Como Real;
	
	Repetir 
		Escribir "Introduce los minutos para realizar la conversión";
		leer m;
	Hasta que m > 0;
	
	h <- trunc(m/60);
	r <- m mod 60 ;
	
	Escribir h,"horas ",r,"minutos";
	
	
FinProceso
