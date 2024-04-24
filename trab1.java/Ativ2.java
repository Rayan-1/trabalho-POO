	package rayan;

		import java.util.Scanner;
		public class Ativ2 {
			
			public static void main(String[] args) {
			
				
				int num1;
				int num2;
				
				String operacao= "";
				int control=0;
				
				Scanner entrada= new Scanner(System.in);
				
				
				System.out.print("informe a operaçao desejada: (+,-,*,/,%): ");
				operacao = entrada.nextLine();
				
				System.out.println("informe outro numero: ");
				num1=Integer.parseInt(entrada.next());
				
				System.out.println("informe outro numero: ");
				num2=Integer.parseInt(entrada.next());
				
				
				if(operacao.equals("+")) {
					System.out.println("O resultado da soma e:" +(num1+num2));
					control++;		
				}
					if(operacao.equals("-")) {
						System.out.println("O resultado da subtraçao e:" +(num1-num2));
						control++;
					}
					
					if(operacao.equals("*")) {
						System.out.println("O resultado da multiplicaçao e:" +(num1*num2));
						control++;
						
					}
					
					if(operacao.equals("/")) {
						System.out.println("O resultado da divisao e:" +(num1/num2));
						control++;
					}
					
					if(operacao.equals("%")) {
						System.out.println("O resto da divisao e:" +(num1+num2));
						control++;
						
						if(control==0) {
							System.out.println("Operaçao invalida");
						}
						
					}
			}
		}






