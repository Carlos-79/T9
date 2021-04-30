package T9Ej2;

/**
*
* @autor: Carlos sanchis Poveda Ejercicio 2 Tema 9 – Interfaces ….
*/

public class Libro extends Publicaciones {
	private String autor;

	public Libro(int codigo, String año, boolean prestado,String autor) {
		super(codigo, año, prestado);

		this.autor = autor;

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
	
	public String ToString () {
		return ("Codigo: " + getCodigo() + " Autor: "+ getAutor() +" año de publicion: " + getAño() + " prestado o no: " + isPrestado());
		
	}

}
