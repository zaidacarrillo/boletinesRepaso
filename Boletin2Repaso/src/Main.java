import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int opcion=0;
		Scanner sc = new Scanner(System.in);
		Libro l1 = new Libro("Don Quijote", "Cervantes","1512");
		Libro l2 = new Libro("T-.Error","Jordi Sierra i Fabra","2012");
		Libro l3 = new Libro("Crónica de una muerte anunciada","Gabriel García Márquez","1981");
		Pelicula p1 = new Pelicula("Ready Player One","Steven Spielberg","Olivia Cooke,Tye Sheridan","28 de marzo de 2018");
		Pelicula p2 = new Pelicula("Rogue One","Gareth Edwards","Felicity Jones,Diego Luna","15 de diciembre de 2016 ");
		Pelicula p3 = new Pelicula("Psicosis","Alfred Hitchcock","Anthony Perkins,Janet Leigh","2 de agosto de 1971");
		Set <Libro> listaLibros=new HashSet<Libro>();
		listaLibros.add(l1);
		listaLibros.add(l2);
		listaLibros.add(l3);
		while (opcion != 4) {
			System.out.println("Introduzca la acción deseada: 1-Introducir datos adicionales\n 2-Mostrar Datos\n 3-Eliminar Datos\n 4-Exit");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				
			case 2:
						l1.mostrarDatos();
						l2.mostrarDatos();
						l3.mostrarDatos();
						p1.mostrarDatos();
						p2.mostrarDatos();
						p3.mostrarDatos();
						break;

			case 3:
				Iterator<Libro> it= listaLibros.iterator();
				
				while(it.hasNext()) {
					String nombre_libro=it.next().getTitulo();
					if(nombre_libro.equals("Don Quijote")) {
						it.remove();
					}
				}
				break;
			default: 
				System.out.println("No existe esta opción");
				break;

			}
		}

	}

}
