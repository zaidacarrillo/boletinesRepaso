
public class Pelicula extends Libro {
	private String actoresDestacados;
	private String Director;
	
	public Pelicula(String Titulo, String Director, String actoresDestacados, String fechadePublicacion ) {
		this.setTitulo(Titulo);
		this.setFechadePublicacion(fechadePublicacion);
		this.setAutor(Director);;
		this.actoresDestacados=actoresDestacados;
	}
	public String getActoresDestacados() {
		return actoresDestacados;
	}
	public void setActoresDestacados(String actoresDestacados) {
		this.actoresDestacados = actoresDestacados;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	@Override
	public void mostrarDatos() {
		System.out.printf("Actores Destacados:%s\n",actoresDestacados);
		super.mostrarDatos();
	}

}
