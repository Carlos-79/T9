package T9Ej2;

/**
*
* @autor: Carlos sanchis Poveda Ejercicio 2 Tema 9 � Interfaces �.
*/
public class Revista extends Publicaciones {
	private int numero;

	public Revista(int codigo, String a�o, boolean prestado, int numero) {
		super(codigo, a�o, prestado);

		this.numero = numero;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String ToString() {
		return ("Codigo: " + getCodigo() + " a�o de publicion: " + getA�o() + " prestado o no: " + isPrestado()
				+ " numero de revista: " + getNumero());

	}

}
