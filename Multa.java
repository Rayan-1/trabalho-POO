package trabPOO;

import java.util.Scanner;
import java.util.Random;

public class Multa {
		private	double taxa= 0.50;
		private int pagamento;
		private int data=30;
		private int dias=33;
		public String debitos;
		
		public String validade;
		public int CVV;
		public double numberCartao;
		Scanner entrada = new Scanner (System.in);
		
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public int getDias() {
			return dias;
		}
		public void setDias(int dias) {
			this.dias = dias;
		}
		
		public double getTaxa() {
			taxa=(dias-data) * taxa;
			return taxa;
		}
		public void setTaxa(double taxa) {
			this.taxa = taxa;
		}
		public int getPagamento() {
			return pagamento;
		}
		public void analise() {
				if (dias > data) {
					System.out.println("Bloqueado!, pague a taxa de: "+getTaxa()+" para liberar seu acesso" );
					System.exit(0);
				}else {
					System.out.println("Acesso liberado");
				}
		}
		public enum opcoesPagamento{
				CREDITO, BOLETO;
		}
		public void setPagamento(int pagamento) {
				System.out.println("Digite a forma de pagamento: (1) cartão , (2) boleto bancário");
							
						switch (pagamento) {
						case 1:
							opcoesPagamento opcao = opcoesPagamento.CREDITO;
								System.out.println("Tipo de pagamento solicitado: " +opcao);
								System.out.println("Digite a numeraçaõ do cartão: ");	
										numberCartao=entrada.nextDouble();
								
									if (numberCartao >= 10) {
											System.out.println("Insira o CVV sem pontos e traços: ");
												CVV= entrada.nextInt();
												
												System.out.println("Uhuul, tudo certo! Pagamento aprovado");
										}else {
											System.out.println("Numeração incorreta, tente novamente mais tarde!!");
										}
										
							break;
							
							case 2:
									Random gerador = new Random();
										opcoesPagamento opcao2 = opcoesPagamento.BOLETO;
										System.out.println("Tipo de pagamento selecionado: " +opcao2);
									for (int i = 0; i < 36 ; i++) {
										System.out.println("N° boleto: " +gerador.nextInt());										
									}
							break;
							
							default:
									System.out.println("Opção inválida");
								
						}
			this.pagamento = pagamento;
		}
			
		
}