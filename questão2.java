package lista1;
import java.util.Scanner;
public class quest�o2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int �rea, l, da; 
		
		System.out.println("Qual � o lado do quadrado?");
		l = scan.nextInt();
		
		�rea = l*l;
		da = �rea*2; 
		
		System.out.println("o dobro da �rea do quadrado �: " + da);
	}

}
