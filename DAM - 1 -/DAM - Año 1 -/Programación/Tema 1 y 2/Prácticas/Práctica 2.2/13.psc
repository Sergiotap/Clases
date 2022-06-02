Proceso P_2_2_3
	
	Definir a,b,c,d,t,tt,t1,tf Como real;
	
	
	//bloque cositas
	Escribir "Introduce el valor A";
	Leer a;
	Escribir "Introduce el valor B";
	Leer b;
	Escribir "Introduce el valor C";
	Leer c;
	Escribir "Introduce el tiempo de llegada";
	Leer t;
	
	//Trabajillo
	a <- a*3600;
	b <- b*60;
	tt <- a+b+c;
	t1 <- a+b+c+t;
	
	
	//conversiones
	a <- trunc(t1/3600);
	d <- t1-a*3600;
	b <- trunc(d/60);
	c <- t1 mod 60;
	
	//Nuevo valor
	Escribir a;
	Escribir b;
	Escribir c;
	
FinProceso
