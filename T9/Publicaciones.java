package T9Ej2;

/**
 *
 * @autor: Carlos sanchis Poveda Ejercicio 2 Tema 9 � Interfaces �.
 */
public class Publicaciones implements Interface {
	private int codigo;
	private String a�o;
	private boolean prestado;

	public Publicaciones() {
		this.prestado = false;

	}

	public Publicaciones(int codigo, String a�o, boolean prestado) {

		this.codigo = codigo;
		this.a�o = a�o;
		this.prestado = prestado;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getA�o() {
		return a�o;
	}

	public void setA�o(String a�o) {
		this.a�o = a�o;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public void prestar() {
		if (prestado == true) {

			System.out.println("Se Presta");
			prestado = true;

		}
		if (prestado == false) {
			System.out.println("No se Presta");
			prestado = false;

		}

	}

	@Override
	public boolean Prestado() {
		prestar();

		return this.prestado = prestado;

	}

	public void devolver() {
		Prestado();
		
		if (prestado == true) {
			System.out.println("Se devuelve");
			prestado = true;

		}
		if (prestado == false) {
			System.out.println("No hay devolucion");
			prestado = false;

		}

	}

	public String toString() {

		return ("Codigo: " + getCodigo() + " a�o de publicion: " + getA�o() + " prestado o no: " + Prestado());

	}

}
