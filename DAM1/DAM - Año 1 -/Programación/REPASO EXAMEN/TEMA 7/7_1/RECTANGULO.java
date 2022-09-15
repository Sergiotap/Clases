
public class RECTANGULO {
    //Atributos
     int base;
     int altura;

    //Metodos
    public void Pintar (){
        for(int i=0;i<altura;i++){
            for(int j=0;j<base;j++){
            	if(i!=0 && i!=altura-1 && j!=0 && j !=base-1) {
            		System.out.print(" ");
            	}else {
            		System.out.print("*");
            	}
            
            }
            System.out.println("");
        }
    }

    public void PintarSigno(char s){
    	for(int i=0;i<altura;i++){
            for(int j=0;j<base;j++){
            	if(i!=0 && i!=altura-1 && j!=0 && j !=base-1) {
            		System.out.print(" ");
            	}else {
            		System.out.print(s);
            	}
            
            }
            System.out.println("");
        }
    }

    public void Invertir (){
    	for(int i=0;i<base;i++){
            for(int j=0;j<altura;j++){
            	if(i!=0 && i!=base-1 && j!=0 && j !=altura-1) {
            		System.out.print(" ");
            	}else {
            		System.out.print("*");
            	}
            }
            System.out.println("");
        }
    }

    public void CentrarHorizontal (){
    	int pantalla = 40-(altura/2);
	        
	        for(int i=0;i<altura;i++){
	            for (int k=0;k<=pantalla;k++){
	                System.out.print(" ");
	            }
	            for(int j=0;j<base;j++){
	            	if(i!=0 && i!=altura-1 && j!=0 && j !=base-1) {
	            		System.out.print(" ");
	            	}else {
	            		System.out.print("*");
	            	}
	            
	            }
	            System.out.println("");
	        }
    	}

    public void CentrarPantalla (){
        int pantalla = 40-(base/2);
        int vertical = 12-(altura/2);
        
        for(int i=0;i<=80;i++){
            System.out.print("-");
        }
        
        for(int i=0;i<=vertical;i++){
            System.out.println("");
        }
        
        for(int i=0;i<altura;i++){
            for (int k=0;k<=pantalla;k++){
                System.out.print(" ");
            }
            for(int j=0;j<base;j++){
            	if(i!=0 && i!=altura-1 && j!=0 && j!=base-1) {
            		System.out.print(" ");
            	}else {
            		System.out.print("*");
            	}
            
            }
            System.out.println("");
        }
        
        for(int i=0;i<=vertical;i++){
            System.out.println("");
        }
        
        for(int i=0;i<=80;i++){
            System.out.print("-");
        }
    }

    public void Area (){
        System.out.println("El area es de: "+(altura*base)+" signos^2");
    }

    public void Perimetro (){
        System.out.println("El perimetro es de: "+(2*altura+base*2)+" signos");
    }
}