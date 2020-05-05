
public class Ejercicio2 {

	public static void main(String[] args) {
	 String cadenaNumerica="";
	 String cadenaAlphabetic="";
	 String cadenaSinTextoNiNumeros="";
	 char [] micadenadeTexto= {'1','@','Z','2','D','@','A','6'};

	for(int i=0; i<micadenadeTexto.length; i++){
		  char a= micadenadeTexto[i];
		  if(Character.isDigit(a)) {
			  cadenaNumerica=cadenaNumerica+a;
		  }else {
		 if(Character.isLetter(a)) {
			 cadenaAlphabetic= cadenaAlphabetic+a;
		 }else {
			 cadenaSinTextoNiNumeros= cadenaSinTextoNiNumeros + a;
			 
		    }
			 
		 }
		 
		
		 }
	  System.out.println(cadenaNumerica+"\n"+cadenaAlphabetic+"\n"+cadenaSinTextoNiNumeros);
	  caracteraCaracter(cadenaNumerica,cadenaAlphabetic,cadenaSinTextoNiNumeros);
	 }
	
	public static void caracteraCaracter(String cadenaNumerica, String cadenaAlphabetic, String cadenaSinTextoNiNumeros) {
		String cadenaSumadeTodas=cadenaNumerica+cadenaAlphabetic+cadenaSinTextoNiNumeros;
		for(int i=0; i<cadenaSumadeTodas.length(); i++){
			System.out.println(cadenaSumadeTodas.charAt(i));
			
		}
		
	}

}
