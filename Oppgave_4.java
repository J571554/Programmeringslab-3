package java_programering_3;
import java.text.DecimalFormat;
public class Oppgave_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat numberFormat = new DecimalFormat("#.000");
		
		String s = String.format("%-3s", "X i grader " + "X i radianer " + "sin(x) " + "cos(x)");
		System.out.println(s);
		
		
		for(int x = 0; x <= 180; x = x + 15) {
		System.out.print("	" + x + "	");
		for(int y = 0; y < 1; y++) {
			double rad = x * Math.PI/180;
			System.out.print(numberFormat.format(rad)+ "	");
		
		for(int c = 0; c < 1; c++) {
			double sin = Math.sin(rad);
			System.out.print(numberFormat.format(sin)+ "	");
		}
		for(int q = 0; q < 1; q++) {
			double cos = Math.cos(rad);
			System.out.println(numberFormat.format(cos)+ "    ");
		}
		}
		}
		
		
	}
}
