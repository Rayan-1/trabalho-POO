package trabPOO;

public class Cliente extends DadosPessoais implements Transacoes{
	
	public void informacoesCliente () {
			System.out.println("Nome do cliente: " +getNome());
			System.out.println("Data de nascimento: " +getData_De_Nascimento());
			System.out.println("Telefone: " +getTelefone());
			System.out.println("Endereco: " +getEndereco());
			System.out.println("-----------------------------------------------");
	
	}

	@Override
	public void CadastroRelizado() {
		// TODO Auto-generated method stub
		System.out.println("Cliente cadastrado com sucesso");
	}		
}
