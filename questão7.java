package lista1;
import java.util.Scanner;
public class questão7 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
double area, q_tinta, q_latas, q_galoes, valor_g,valor_g1,q_lata2, v_lata, resto, c_l=18, c_g=3.6, q_galão, v_galão, vf; 
		
		
		System.out.println("Qual o tamamho da área em metros quadrados?");
		area = scan.nextDouble();
		System.out.println("Você terá 3 opções de compra.");
		System.out.println("");
		
		System.out.println("A primeira será comprar apenas galões de 18 litros.");
		 q_tinta = area/6; 
		 q_latas = Math.ceil (q_tinta/18);
		 valor_g = q_latas*80;
		System.out.println("Nessa opção você precisará comprar: " +q_latas+ " latas de tinta.");
		System.out.println("E o valor final da sua compra será: R$"+valor_g);
		System.out.println("");
		 
		System.out.println("A segunda opção será comprar apenas galões de 3,6 litros.");
		 q_tinta = area/6;
		 q_galoes = Math.ceil (q_tinta/3.6);
		 valor_g1 = q_galoes*25;
		System.out.println("Nessa opção você precisará comprar: " +q_galoes+ " latas de tinta.");
		System.out.println("E o valor final da sua compra será: R$"+valor_g1);
		System.out.println("");

double litro =(q_tinta + (q_tinta*0.1));		
		
		System.out.println("A terceira opção será comprar latas e galões a fim de evitar o desperdício.");
		 q_tinta = area/6;
		 q_lata2 =Math.floor (litro/c_l);
		 v_lata = q_lata2*80;
		 resto = litro % c_l; 
		 q_galão = Math.ceil (resto/c_g); 
		 v_galão = q_galão * 25;
		 vf = v_lata + v_galão; 
		System.out.println("Aqui você precisará comprar "+q_lata2+ " latas e " +q_galão+ " galões");
		System.out.println("Caso você escolha essa opção o valor da compra será de: R$"+vf);
		 
		  
		
		 
	}

}
