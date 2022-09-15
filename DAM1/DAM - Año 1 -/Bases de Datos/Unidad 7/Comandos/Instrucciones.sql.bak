ei--InformaciÃ³n:
rownum valor que asigna oracle a un ejemplar, no tiene valor.


--Acceder como administrador total:
sqlplus sys as sysdba


--Listar bases alojadas
SELECT NAME FROM V$DATABASE;


--Listar usuarios en la base de datos
select username from dba_users;


--Lista todas las tablas y su propietario
select owner, table_name from all_tables;


--lista tablas dba_tables y su propietario
select owner,table_name from dba_tables;

--Lista todos los atributos de user_tables
select table_name from user_tables;


-- paquete flecha arriba rlwrap sqlplus se instala como siempre

--Abrirsql (nombre: alumno, password: alumno, nombre_base: xe)
rlwrap sqlplus alumno/alumno@xe

--Crear usuarios (nombre:javi,password:javivi,)
CREATE USER javi IDENTIFIED BY javivi;

--Dar privilegios al usuario
GRANT ALL PRIVILEGES TO javi;
GRANT EXECUTE ANY PROCEDURE TO javi;
GRANT UNLIMITED TABLESPACE TO javi;


--lista atributosde una tabla
describe emp;

--Lista ejemplares que son mayúsculas

select * from emp where ename=upper("Miller");

--Lista todos los ejemplares en minúsculas y job primera letra mayus

Select lower(ename), initcap(job) from emp;

--Convierte valores nulos (consultas no modifica) NVL(ATR,0)
Select ename, sal,sal+NVL(comm,0) as ganancia from emp;



