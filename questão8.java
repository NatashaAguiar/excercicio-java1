package lista1;
import java.util.Scanner;
public class quest�o8 {
public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		float peso, valor;
		System.out.println("Qual � o peso?");
		peso = scan.nextFloat(); 
		valor = peso*12;
		System.out.println("O valor a ser pago pela refei��o ser� de R$"+valor);
		
	}

}
