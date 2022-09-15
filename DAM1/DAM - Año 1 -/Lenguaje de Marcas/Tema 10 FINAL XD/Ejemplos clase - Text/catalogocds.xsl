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
			<xsl:for-each select="catalogo/cd[precio>10]">
				<p><xsl:value-of select="titulo"/>
				<xsl:text> </xsl:text>
				<xsl:value-of select="artista"/>
				</p>
			</xsl:for-each>
</body>
</html>
</xsl:template>
</xsl:stylesheet>


