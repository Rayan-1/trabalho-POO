package rayan;
import java.util.Scanner;

public class atv1 {
	//escreva um programa e java que leia o numero de prestaçao de um produto
	//o se valor de venda e calcule o valor da prestaçao
	public static void main(String[] agrs) {
		
		Scanner alimento = new Scanner(System.in);
		int compras;
		System.out.println("Digite um numero de prestaçao de um produto:");
		
		 int nprest = alimento.nextInt();
		
		
			System.out.println("Digite quantos produtos desejado: ");

		
		double valor=alimento.nextDouble();
		
		double valorp = valor/nprest;
		System.out.println("a prestaçao e: " + valorp);

		
		
		
	}
	

}
