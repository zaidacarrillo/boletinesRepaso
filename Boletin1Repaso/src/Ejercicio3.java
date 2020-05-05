import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] usuario = new int [3];
		for(int posicion=0;posicion<usuario.length;posicion++) {
			System.out.println("Introduce un valor hasta que la colección de datos termine:");
			int ValorUsuario=sc.nextInt();
			usuario [posicion]= ValorUsuario; 
	
		}for(int posicion=0; posicion< usuario.length; posicion++) {
			System.out.println("El valor es:"+usuario[posicion]);
		}	
		//for(int lectura:usuario) {
		//	System.out.println(lectura);
		//}
		 sc.close();
	}
  
}
