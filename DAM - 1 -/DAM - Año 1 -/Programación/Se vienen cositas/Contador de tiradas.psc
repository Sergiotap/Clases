Proceso Contador_tiradas
	
	//Bloque del modo sexo
	Definir sexo,mondongo Como Real;
	
	//Bloque de la moto
	Escribir "Introduzca la cantidad de Protogemas";
	leer sexo;
	Escribir "Introduzca la cantidad de Deseos";
	Leer mondongo;
	
	//Bloque del sancocho
	Sexo <- (sexo/160);
	Sexo <- trunc(sexo);
	mondongo <- (mondongo+sexo);
	
	Escribir"Las tiradas que tienes disponibles son las siguientes: ",mondongo, " basura inútil";
	
FinProceso
