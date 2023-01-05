package lista1;
import java.util.Scanner;
public class questão1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double x, y; 
		
		System.out.println("Digite um número em metros:");
		x = scan.nextDouble(); 
		
		y = x*100;
		System.out.println("O número em centímetros é:" + y);
		
	}

}
