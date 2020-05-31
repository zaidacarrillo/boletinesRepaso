import java.util.Scanner;

public class Libro {
	private String Titulo;
	private String Autor;
	private String fechadePublicacion;
		
	public Libro() {
			
	}
	
	public Libro(String Titulo, String Autor, String fechadePublicacion) {
		this.Autor=Autor;
		this.fechadePublicacion= fechadePublicacion;
		this.Titulo=Titulo;
	}
	
	public String getTitulo() {
		return Titulo;
	}
	
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	public String getAutor() {
		return Autor;
	}
	
	public void setAutor(String autor) {
		Autor = autor;
	}
	
	public String getFechadePublicacion() {
		return fechadePublicacion;
	}
	
	public void setFechadePublicacion(String fechadePublicacion) {
		this.fechadePublicacion = fechadePublicacion;
	}
	
	public void mostrarDatos() {
		System.out.printf("Titulo: %s\nAutor/Director: %s\nFecha de publicacion: %s\n",Titulo,Autor,fechadePublicacion);
	}
	
	public static String obtenerTitulo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el titulo del libro a eliminar: ");
		String nombreLib = sc.nextLine();
		return nombreLib;
	}
}