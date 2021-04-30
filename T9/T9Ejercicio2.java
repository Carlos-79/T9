package T9Ej2;

public class T9Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Publicaciones p = new Publicaciones(0000001, "8/5/1921", false);
		Revista R = new Revista(8952291, "8/5/1921", true, 102);
		Libro L = new Libro(8567294, "8/5/1921", false, "Rick Jordan");

		System.out.println(p.toString());

		System.out.println(R.toString());

		System.out.println(L.toString());

	}

}