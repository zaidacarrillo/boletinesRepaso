import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Libro> listaLibros = new ArrayList();
		ArrayList<Pelicula> listaPeliculas = new ArrayList();
		while (opcion != 4) {
			opcion = 0;
			while (opcion == 0) {
				System.out.println(
						"IQue accion desea realizar:\n 1-Nuevos datos\n 2-Ver listado de peliculas y libros\n 3-Eliminar Datos\n 4-Salir");
				try {
					opcion = sc.nextInt();
				} catch (InputMismatchException ex) {
					System.out.println("No existe esa opcion, debe ser un numero entre 1 y 4");
					sc.nextLine();
				}
			}
			switch (opcion) {
			case 1:
				int añadir = 0;
				while (añadir == 0) {
					System.out.println("1-Nuevo libro\n2-Nueva pelicula");
					try {
						añadir = sc.nextInt();
					} catch (InputMismatchException ex) {
						System.out.println("No existe esa opcion, debe ser un numero entre 1 y 4");
						sc.nextLine();
					}
				}
				switch (añadir) {
				case 1:
					Libro libro;
					
					System.out.println("Introduzca los datos del libro\nTitulo: ");
					String titulo = sc.nextLine();
					System.out.println("Autor: ");
					String Autor =sc.nextLine();
					System.out.println("Fecha de publicacion: ");
					String fechadePublicacion = sc.nextLine();
					
					libro= new Libro(titulo, Autor, fechadePublicacion);
					listaLibros.add(libro);
					break;
					
				case 2:
					Pelicula peli;

					System.out.println("Introduzca los datos de la pelicula\\nTitulo:");
					String titulo1 = sc.nextLine();
					System.out.println("Director: ");
					String Autor1 = sc.nextLine();
					System.out.println("Fecha de estreno: ");
					String fechadePublicacion1 = sc.nextLine();
					System.out.println("Actores destacados: ");
					String actoresDestacados = sc.nextLine();

					peli = new Pelicula(titulo1, Autor1, fechadePublicacion1, actoresDestacados);
					listaPeliculas.add(peli);
					break;

				default:
					System.out.println("No existe esa opcion, debe ser un numero entre 1 y 4");
					break;

				}
				break;

			case 2:
				for (Libro lib : listaLibros) {
					lib.mostrarDatos();
				}
				
				for (Pelicula pel : listaPeliculas) {
					pel.mostrarDatos();
				}
				break;

			case 3:
				int eliminar = 0;
				while (eliminar == 0) {
					System.out.println("1-Eliminar libro\n2-Eliminar pelicula");
					try {
						eliminar = sc.nextInt();
					} catch (InputMismatchException ex) {
						System.out.println("No existe esa opcion, debe ser un numero entre 1 y 4");
						sc.nextLine();
					}
				}
				switch (eliminar) {
				case 1:
					String nombreLib = Libro.obtenerTitulo();
					for (Libro lib : listaLibros) {
						if (lib.getTitulo().equals(nombreLib)) {
							listaLibros.remove(lib);
						}
					}
					for (Libro lib : listaLibros) {
						lib.mostrarDatos();
					}
					break;
					
				case 2:
					String nombrePel = Pelicula.obtenerTitulo();
					for (Pelicula pel : listaPeliculas) {
						if (pel.getTitulo().equals(nombrePel)) {
							listaPeliculas.remove(pel);
						}
					}
					for (Pelicula pel : listaPeliculas) {
						pel.mostrarDatos();
					}
					break;

				default:
					System.out.println("No existe esa opcion, debe ser un numero entre 1 y 4");
					break;
				}

				break;

			case 4:
				System.out.println("Hasta otra.");
				break;

			default:
				System.out.println("No existe esa opcion, debe ser un numero entre 1 y 4");
				break;
			}
		}
		sc.close();
	}
}