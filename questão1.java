package lista1;
import java.util.Scanner;
public class quest�o1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double x, y; 
		
		System.out.println("Digite um n�mero em metros:");
		x = scan.nextDouble(); 
		
		y = x*100;
		System.out.println("O n�mero em cent�metros �:" + y);
		
	}

}
