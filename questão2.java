package lista1;
import java.util.Scanner;
public class questão2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int área, l, da; 
		
		System.out.println("Qual é o lado do quadrado?");
		l = scan.nextInt();
		
		área = l*l;
		da = área*2; 
		
		System.out.println("o dobro da área do quadrado é: " + da);
	}

}
