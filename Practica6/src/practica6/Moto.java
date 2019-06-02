package practica6;

/**
 * Clase Coche
 * @author IGG
 * @version 2019
*/


public class Coche {
	String matricula= "";
	String atrib= "";
	String modelo= "";
	String fabricante= "";

	
/*
  ---REFACTORIZACIÓN-- ELIMINAR CODIGO DUPLICADO

	public Coche() {
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}
*/
	
	
	public String metodo1() {
		String resultado = "";
		String texto = TEXTO_INICIAL + matricula + " ";
		if (atrib == "Gasolina") {
			double precio=1.337;
			resultado = texto + metodoInfoPrecio(precio);
		} 
		else if (atrib == "Diesel") {
			double precio=1.052;
			resultado = texto + metodoInfoPrecio(precio);
		} 
		else if (atrib == "Híbrido") {

			resultado = texto + metodoNoInfoPrecio();
		} 
		else {
			resultado = texto + "no dispone de información";
		}
		return resultado;
	}
	
	//	  ---REFACTORIZACIÓN-- EXTRAER CONSTANTE
	  
	static final String TEXTO_INICIAL = "El coche con matricula";
	
    /**
     * Metodo metodoInfoPrecio.
     * devuelve información sobre el precio del carburante
     * @precio indica el precio
     * @return devuelve cadena de texto
     */  
	
	public String metodoInfoPrecio(double precio) {
		String info ="es un " + modelo + " y gasta" + precio +" euros por litro.";
		return info;
	}
	
    /**
     * Metodo metodoNoInfoPrecio.
     * devuelve información
     * @return devuelve cadena de texto
     */ 
	public String metodoNoInfoPrecio() {
		String info ="es un " + modelo + " y no necesita combustible";
		return info;
	}
}
