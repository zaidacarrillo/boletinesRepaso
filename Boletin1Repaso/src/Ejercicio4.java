import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		int operacion = 1;
		
		int[] arrayEnteros= {1,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige una opción:\n 1.-1\n 2.-2\n 3.-3\n 4.-4\n");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			for(int i=0; i<arrayEnteros.length; i++){
				operacion= operacion + arrayEnteros[i];
			}
			System.out.println("La suma de los valores Array es:"+operacion);
			break;
			
		case 2:
			for(int i=0; i<arrayEnteros.length; i++){
				operacion= operacion - arrayEnteros[i];
			}
			System.out.println(operacion);
			break;
			
		case 3:
			for(int i=0; i<arrayEnteros.length; i++){
				operacion= operacion * arrayEnteros[i];
			}
			System.out.println(operacion);
			break;
		default:
			System.out.println("Error opción inexistente. Programa terminado.");
			
		}
		
       sc.close();
	}

}
