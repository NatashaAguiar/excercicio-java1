package lista1;
import java.util.Scanner;
public class quest�o9 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Double x,p,l;
		System.out.println("Qual � o pre�o da gasolina?");
		p = scan.nextDouble();
		System.out.println("Quanto voc� pagou?");
		x = scan.nextDouble();
		l = x/p;
		System.out.println("A quantidade de gasolina em litros que foi colocada no tanque �:"+l);
	}

}
