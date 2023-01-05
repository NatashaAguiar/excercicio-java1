package lista1;
import java.util.Scanner;
public class questão3 {
public static void main(String[] args) {
		
	Scanner scan =  new Scanner(System.in);
	
	double x,y,z,d,t,c;
	
	System.out.println("Digite um número inteiro.");
	x = scan.nextDouble();
	System.out.println("Digite outro número inteiro.");
	y = scan.nextDouble();
	System.out.println("Digite, agora, um número real.");
	z = scan.nextDouble();
	
	d = (2*x)+(y/2);
	t = (3*x)+z; 
	c = z*z*z; 
	
	System.out.println("O produto do dobro do primeiro com metade do segundo é:" +d);
	System.out.println("A soma do triplo do primeiro com o terceiro é" +t);
	System.out.println("O terceiro elevado ao cubo é:" +c);
	
	

	}

}
