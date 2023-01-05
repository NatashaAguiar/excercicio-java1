package lista1;
import java.util.Scanner;
public class questão9 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Double x,p,l;
		System.out.println("Qual é o preço da gasolina?");
		p = scan.nextDouble();
		System.out.println("Quanto você pagou?");
		x = scan.nextDouble();
		l = x/p;
		System.out.println("A quantidade de gasolina em litros que foi colocada no tanque é:"+l);
	}

}
