package lista1;
import java.util.Scanner;
public class quest�o5 {
public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	double a, v, t, tf;
	
	System.out.println("Para saber o tempo estimado para dowload de um arquivo digite as informa��es a seguir");
	System.out.println("Qual � o tamanho do arquivo em Mb?");
	a = scan.nextDouble();
	
	System.out.println("Qual a velocidade da internet em Mbps?");
	v = scan.nextDouble();
	
	t = a / (v/8);
	tf = t/60;
	
	System.out.printf ("O tempo estimado, em minutos, para o dowload do arquivo � de: %.2f" ,tf );
	

	}

}
