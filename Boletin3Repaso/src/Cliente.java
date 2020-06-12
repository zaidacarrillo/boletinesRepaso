import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Cliente implements Comparable<Cliente> {
	private Float edad;
	private String nombre;
	private String dni;
	LocalDate fechaNacimiento;

	public Cliente(LocalDate fechaUsuario, String nombreUsuario, String dniUsuario, Float edadUsuario) {
		this.fechaNacimiento = fechaUsuario;
		this.nombre = nombreUsuario;
		this.dni = dniUsuario;
		this.edad = edadUsuario;
	}

	public Float getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = (float) edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public static float obtenerEdad(LocalDate fechaUsuario) {

		LocalDate hoy = LocalDate.now();
		float edadUsuario = ChronoUnit.YEARS.between(fechaUsuario, hoy);
		return edadUsuario;

	}

	public String toString() {
		return "Los datos del DNI introducido son :\n Nombre: " + nombre + "\n Edad: " + edad + "\n Dni: " + dni
				+ "\n Fecha Nacimiento: " + fechaNacimiento;
	}

	@Override
	public int compareTo(Cliente c1) {
		return edad.compareTo(c1.getEdad());
	}

}
