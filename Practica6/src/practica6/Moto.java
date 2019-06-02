package practica6;

/**
 * Clase Moto
 * @author IGG
 * @version 2019
*/

public class Moto {
	String matricula="";
	int cilindrada=0;

	
/* 
---REFACTORIZACIÓN-- ELIMINAR CODIGO DUPLICADO
	 
	public Moto() {
		matricula = "";
		cilindrada = 0;
	}

	public Moto(String m, int c) {
		matricula = m;
		cilindrada = c;
	}
*/
	
	public String getMatricula() {
		return matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setMatricula(String m) {
		matricula = m;
	}

	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
