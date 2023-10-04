package mi_calculadora;
import java.lang.StringBuilder;

public class Calculadora {

		public static void add(String cadena, StringBuilder sb) {
			
			if(cadena!=null && sb!=null) {
				sb.append(cadena);
			}
			
		}
		
		public static void delete(String cadena, StringBuilder sb) {
			
			if(cadena.equals("clear")) {
				sb.setLength(0);
			}
			
		}
		
		public static int calculate(StringBuilder sb) {
			
			int total=0;
			String oPerador="";
			StringBuilder num = new StringBuilder();
			
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
			
			return total;
			
			
		}
		
}
