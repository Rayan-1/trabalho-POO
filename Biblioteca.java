package trabPOO;



public class Biblioteca {
	
	public static void main (String [] args) {
			
		
			System.out.println("                BEM-VINDOS(A) ASAS                      ");
			System.out.println();
			
			Funcionario funcionario1 = new Funcionario();
			funcionario1.setNome("Adriano");
			funcionario1.setMatricula(476900);
			funcionario1.loginFuncionario();
	
	 		Cliente cliente1 = new Cliente ();
			cliente1.setNome("Jorge");
			cliente1.setData_De_Nascimento("23/08/1999");
			cliente1.setTelefone("85999734170");
			cliente1.setEndereco("Rua Floro Bartolomeu, 838");
	//		cliente1.cadastroConcluido();		
			cliente1.informacoesCliente();
		
			Livro livro1 = new Livro();	
			livro1.setAutor("Viegas Bruno"); 
			livro1.setTituloPrincipal("Java para programador");
			livro1.setEdicao("2017");
			livro1.setStatus(true);
			livro1.aluguel();
			
			Multa multa = new Multa ();
			multa.analise();
		//	multa.setPagamento(1);					
	}
	
}


