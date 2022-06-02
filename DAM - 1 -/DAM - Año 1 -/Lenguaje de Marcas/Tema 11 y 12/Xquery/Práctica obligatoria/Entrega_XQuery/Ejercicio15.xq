<html>
  <head>
    <title>Tabla Ejercicio 15</title>
    <link rel="stylesheet" href="ejercicio15.css"/>
  </head>
  <body>
    <table>
      {
        for $prueba in doc("xml/productos.xml")//produc
        return <tr>
                    <td>{$prueba/cod_zona}</td>
                    <td>{$prueba/stock_minimo}</td>
                    <td>{$prueba/stock_actual}</td>
                    <td>{$prueba/precio}</td>
                    <td>{$prueba/denominacion}</td>
                    <td>{$prueba/cod_prod}</td>
               </tr>
      }
    </table>
  </body>
</html>