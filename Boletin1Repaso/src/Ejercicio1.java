
public class Ejercicio1 {

	public static void main(String[] args) {
		 
		String cadenaTexto="as15j7@21";
		int suma=0;
		
		for(int i=0; i<cadenaTexto.length(); i++) {
			char a=cadenaTexto.charAt(i);
			if (Character.isDigit(a)) {
				suma=suma+(a-48);
				
			}

		}
		System.out.println("La suma es "+suma);
	}

}
