package lista1;
import java.util.Scanner;
public class questão8 {
public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		float peso, valor;
		System.out.println("Qual é o peso?");
		peso = scan.nextFloat(); 
		valor = peso*12;
		System.out.println("O valor a ser pago pela refeição será de R$"+valor);
		
	}

}
