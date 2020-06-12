import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Cliente> clienteAdolescente = new ArrayList<>();
		ArrayList<Cliente> clienteJoven = new ArrayList<>();
		ArrayList<Cliente> clienteAdulto = new ArrayList<>();
		HashMap<String, Cliente> busquedaDni = new HashMap<String, Cliente>();
		int opcion = 0;
		while (opcion != 4) {
			opcion = 0;
			while (opcion == 0) {
				System.out.println(
						"Indique la opción deseada por favor:\n 1-Nuevo Cliente\n 2-Visualizar sus datos como cliente\n 3-Mostrar registro de clientes\n 4-SALIR");

				if (sc.hasNextInt()) {
					opcion = sc.nextInt();
					if (opcion <= 4) {

					} else {
						System.out.println("Teclea una opción válida por favor.");

					}
				} else {
					System.out.println("Teclea una opción válida por favor.");
					sc.next();

				}
				switch (opcion) {
				case 1:

					Cliente Cliente = registrarCliente();
					if (Cliente.getEdad() < 16) {
						break;
					}
					if (Cliente.getEdad() < 18 && Cliente.getEdad() >= 16) {
						clienteAdolescente.add(Cliente);
						busquedaDni.put(Cliente.getDni(), Cliente);
					}
					if (Cliente.getEdad() >= 18 && Cliente.getEdad() < 30) {
						clienteJoven.add(Cliente);
						busquedaDni.put(Cliente.getDni(), Cliente);
					}
					if (Cliente.getEdad() >= 30) {
						clienteAdulto.add(Cliente);
						busquedaDni.put(Cliente.getDni(), Cliente);
					}

					System.out.println("Guardado temporal de datos, realizado con éxito.");

					break;
				case 2:
					System.out.println("Introduzca el Dni del cliente, por favor.");
					String dniCliente = sc.next();

					if (busquedaDni.containsKey(dniCliente)) {
						System.out.println(busquedaDni.get(dniCliente));
					} else {
						System.out.println("Lo siento, no existe el cliente " + dniCliente);
					}
					break;
				case 3:
					ordenarCliente(clienteAdolescente, clienteJoven, clienteAdulto);
					break;
				case 4:
					System.out.println("Saliendo...");
					break;

				}

			}
		}

	}

	public static Cliente registrarCliente() {
		Scanner sc = new Scanner(System.in);
		Cliente Cliente = null;
		int dia = 0;
		System.out.println("Buenas introduce tu fecha de nacimiento, porfavor.\n -Día\n -Mes\n -Año");

		do {
			System.out.println("Día:");
			try {
				dia = sc.nextInt();
			} catch (InputMismatchException ex) {
				sc.next();
				System.out.println("Por favor un número válido.");
			}

		} while (dia == 0 || dia < 0 || dia > 31);

		int mes = 0;
		do {
			System.out.println("Mes:");
			try {
				mes = sc.nextInt();
			} catch (InputMismatchException ex) {
				sc.next();
				System.out.println("Por favor un número válido.");
			}

		} while (mes == 0 || mes < 0 || mes > 12);
		try {
			int anho = 0;
			System.out.println("Anho:");
			try {
				anho = sc.nextInt();
			} catch (InputMismatchException ex) {
				sc.next();
				System.out.println("Por favor un número válido.");
			}

			String fechaNacimiento = dia + "/" + mes + "/" + anho;
			LocalDate fechaUsuario = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("d/M/yyyy"));
			System.out.println(fechaUsuario);
			Float edadUsuario = Cliente.obtenerEdad(fechaUsuario);
			System.out.println(edadUsuario + "años");
			if (edadUsuario < 16) {
				String nombreUsuario = "";
				String dniUsuario = "";
				Cliente = new Cliente(fechaUsuario, nombreUsuario, dniUsuario, edadUsuario);
				System.out.println("Usuario no permitido como cliente, dado que es menor de edad.");

			} else {
				System.out.println("Cliente admitido. +16");

				System.out.println("Introduzca su nombre porfavor:");
				String nombreUsuario = sc.next();
				System.out.println("Introduzca su DNI, por favor.");
				String dniUsuario = sc.next();

				Cliente = new Cliente(fechaUsuario, nombreUsuario, dniUsuario, edadUsuario);

			}

			return Cliente;
		} finally {
		}
	}

	public static void ordenarCliente(ArrayList<Cliente> clienteAdolescente, ArrayList<Cliente> clienteJoven,
			ArrayList<Cliente> clienteAdulto) {
		Collections.sort(clienteAdolescente);
		Collections.sort(clienteJoven);
		Collections.sort(clienteAdulto);
		System.out.println("Lista Clientes Adolescentes");
		for (Cliente orden : clienteAdolescente) {
			System.out.println(orden);
		}
		System.out.println("Lista Clientes Joven");
		for (Cliente orden2 : clienteJoven) {
			System.out.println(orden2);
		}
		System.out.println("Lista Clientes Adultos");
		for (Cliente orden3 : clienteAdulto) {
			System.out.println(orden3);
		}

	}

}
