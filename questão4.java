package lista1;
import java.util.Scanner;
public class questão4 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		
		
		System.out.println("Quantos metros quadrados tem a área a ser pintada?");
		double area = scan.nextInt(); 
		
		double q_tinta = area/3; 
		double q_latas = Math.ceil (q_tinta/18); 
		
		System.out.println("A quantidade de latas de tinta necessária é: " + q_latas); 
		
		double valor_f = q_latas*80;
		System.out.println("O o valor final da compra é de: " + valor_f); 
		
		
		
		
		
	}

}
