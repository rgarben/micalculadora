package mi_calculadora;
import java.lang.StringBuilder;

public class Calculadora {

	
		/*
		 * Este metodo va agregando al StringBuilder principal 
		 * */
		public static void add(String cadena, StringBuilder sb) {
			
			if(cadena!=null && sb!=null) {
				sb.append(cadena);
			}
			
		}
		
		
		/*
		 * Este metodo limpia el Stringbuilder principal
		 * */
		public static void delete(String cadena, StringBuilder sb) {
			
			if(cadena.equals("clear")) {
				sb.setLength(0);
			}
			
		}
		
		
		/*
		 * Este metodo filtra y calcula el total de la operacion
		 * */
		public static int calculate(StringBuilder sb) {
			
			int total=0;
			String oPerador="";
			StringBuilder num = new StringBuilder();
						
			
			try {
				/*
				 * Este for va agregando numeros dependiendo del operador
				 * y va guardandolo en el total para finalmente mostrarlo
				 * */
				for(int i=0;i<sb.length();i++) {
					
					if(sb.charAt(i)=='+') {
						if(oPerador.equals("+")) {
							total+=Integer.valueOf(num.toString());
						}else if(oPerador.equals("-")) {
							total-=Integer.valueOf(num.toString());
						}else {
							total=Integer.valueOf(num.toString());
						}
						
						oPerador="+";
						num.setLength(0);
						
					}else if(sb.charAt(i)=='-') {
						if(oPerador.equals("+")) {
							total+=Integer.valueOf(num.toString());
						}else if(oPerador.equals("-")) {
							total-=Integer.valueOf(num.toString());
						}else {
							total=Integer.valueOf(num.toString());
						}
						
						oPerador="-";
						num.setLength(0);
						
					}else {
						num.append(sb.charAt(i));
					}
				}
				
				
				/*
				 * Aqui preguntamos cual era el ultimo operador para asignar el ultimo numero
				 * */
				if(oPerador.equals("+")) {
					total+=Integer.valueOf(num.toString());
				}else if(oPerador.equals("-")) {
					total-=Integer.valueOf(num.toString());
				}
				
			/*
			 * Caturamos el exception y enviamos un mensaje de error
			 * */
			} catch (Exception e) {
				sb.setLength(0);
				sb.append("Error");
			}
			
			return total;
			
			
		}
		
}
