package T9Ej2;

/**
*
* @autor: Carlos sanchis Poveda Ejercicio 2 Tema 9 – Interfaces ….
*/
public class Revista extends Publicaciones {
	private int numero;

	public Revista(int codigo, String año, boolean prestado, int numero) {
		super(codigo, año, prestado);

		this.numero = numero;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String ToString() {
		return ("Codigo: " + getCodigo() + " año de publicion: " + getAño() + " prestado o no: " + isPrestado()
				+ " numero de revista: " + getNumero());

	}

}
