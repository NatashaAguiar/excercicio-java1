package lista1;
import java.util.Scanner;
public class quest�o7 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
double area, q_tinta, q_latas, q_galoes, valor_g,valor_g1,q_lata2, v_lata, resto, c_l=18, c_g=3.6, q_gal�o, v_gal�o, vf; 
		
		
		System.out.println("Qual o tamamho da �rea em metros quadrados?");
		area = scan.nextDouble();
		System.out.println("Voc� ter� 3 op��es de compra.");
		System.out.println("");
		
		System.out.println("A primeira ser� comprar apenas gal�es de 18 litros.");
		 q_tinta = area/6; 
		 q_latas = Math.ceil (q_tinta/18);
		 valor_g = q_latas*80;
		System.out.println("Nessa op��o voc� precisar� comprar: " +q_latas+ " latas de tinta.");
		System.out.println("E o valor final da sua compra ser�: R$"+valor_g);
		System.out.println("");
		 
		System.out.println("A segunda op��o ser� comprar apenas gal�es de 3,6 litros.");
		 q_tinta = area/6;
		 q_galoes = Math.ceil (q_tinta/3.6);
		 valor_g1 = q_galoes*25;
		System.out.println("Nessa op��o voc� precisar� comprar: " +q_galoes+ " latas de tinta.");
		System.out.println("E o valor final da sua compra ser�: R$"+valor_g1);
		System.out.println("");

double litro =(q_tinta + (q_tinta*0.1));		
		
		System.out.println("A terceira op��o ser� comprar latas e gal�es a fim de evitar o desperd�cio.");
		 q_tinta = area/6;
		 q_lata2 =Math.floor (litro/c_l);
		 v_lata = q_lata2*80;
		 resto = litro % c_l; 
		 q_gal�o = Math.ceil (resto/c_g); 
		 v_gal�o = q_gal�o * 25;
		 vf = v_lata + v_gal�o; 
		System.out.println("Aqui voc� precisar� comprar "+q_lata2+ " latas e " +q_gal�o+ " gal�es");
		System.out.println("Caso voc� escolha essa op��o o valor da compra ser� de: R$"+vf);
		 
		  
		
		 
	}

}
