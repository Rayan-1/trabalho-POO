package trabPOO;

import java.util.Scanner;

public class Funcionario implements Transacoes{
	
	private String nome;
	private int matricula;
	public int senha; //senhapadrão
	
	Scanner entrada = new Scanner (System.in);
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", getNome()=" + getNome() + "]";
	}
	public void loginFuncionario() {
			System.out.println("Funcionário:  " +getNome());
			System.out.println("Matricula: " +getMatricula());
			System.out.println("Digite sua senha: ");
				senha=entrada.nextInt();
					if (senha == 12345) {
								LoginFuncionario();
					}else {
						System.out.println	("Senha incorreta, digite novamente");
							loginFuncionario();
					}	
				
			System.out.println("-----------------------------------------------");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void LoginFuncionario () {
		System.out.println("Funcionário logado com sucesso!!");
	}
}