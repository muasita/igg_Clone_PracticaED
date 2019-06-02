package practica6;

	private static final String MATRICULA = m;

public class Coche {
	String atrib = c;
	String modelo = mo;
	String fabricante = f;
	}

	public String metodo1() {
		String resultado = "";
		if (atrib == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		} else if (atrib == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoB(modelo, fabricante);
		} else if (atrib == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoC(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}
}
