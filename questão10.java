package lista1;
import java.util.Scanner;
public class quest�o10 {
public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	Double si, sa, sf;
	System.out.println("Qual seu sal�rio atual?");
	si= scan.nextDouble(); 
	sa = si + (si*0.15);
	sf = sa - (sa*0.08);
	System.out.println("Seu sal�rio inicial era R$"+si);
	System.out.println("Com o aumento ficou R$"+sa);
	System.out.println("Descontando os impostos voc� ir� receber R$"+sf);
	

}

}
