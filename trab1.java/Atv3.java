package rayan;

 import java.util.Scanner;
public class Atv3 {
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
	int velocidade,velocidadeMax, tipodeVeiculo;
	
	System.out.println("Digite a velocidade: ");
	velocidade = entrada.nextInt();
	System.out.println("Digite a velocidade Maxima: ");
	velocidadeMax = entrada.nextInt();
	
	System.out.println("Qual o tipo de veiculo?: ");
	System.out.println("1- Passeio");
    System.out.println("2- Carga");	
	tipodeVeiculo = entrada.nextInt();


	if(tipodeVeiculo == 1 && velocidade > velocidadeMax * 1.1){
	    
	    	 System.out.println("Veiculo de Passeio Multado");
	}else if(tipodeVeiculo == 2 && velocidade > velocidadeMax * 1.05){
		
		 System.out.println("Veiculo de Carga Multado");
		 
	}else {
		 System.out.println("Nenhuma multa registrada");
		 
	
	
	  }
	}
}

