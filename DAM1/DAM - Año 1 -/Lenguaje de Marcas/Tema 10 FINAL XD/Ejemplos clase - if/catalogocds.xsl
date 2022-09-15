<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
   <head>
      <title>Mi colección de CDs</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
      <link rel="stylesheet" href="catalogo.css"/>	  
    </head>
  <body>
    	<h2>Mi colección de CDs</h2>
	<table border="1">
		<tr bgcolor="#9acd32">
			<th>Titulo</th>
			<th>Artista</th>
			<th>Precio</th>
		</tr>
      		<xsl:for-each select="catalogo/cd">
			<xsl:sort select="precio"/>	
			<xsl:if test="precio >= 10">
				
      		<tr>
        		<td><xsl:value-of select="titulo"/></td>
        		<td><xsl:value-of select="artista"/></td>
			<td><xsl:value-of select="precio"/></td>
      		</tr>
			</xsl:if>
      		</xsl:for-each>
    	</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>


