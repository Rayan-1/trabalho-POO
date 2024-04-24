package trabPOO;


import java.util.Calendar;
import java.util.Date;

public class Livro  extends Cliente{
		private String autor;
		private String TituloPrincipal;
		private String edicao;
		public boolean status=true;
		private Date dataDeAluguel;
		
		@Override
		public String toString() {
			return "Livro [autor=" + autor + ", TituloPrincipal=" + TituloPrincipal + ", edicao=" + edicao + "]";
		}
		
		
public String getAutor() {
			return autor;
		}


		public void setAutor(String autor) {
			this.autor = autor;
		}


		public String getTituloPrincipal() {
			return TituloPrincipal;
		}


		public void setTituloPrincipal(String tituloPrincipal) {
			TituloPrincipal = tituloPrincipal;
		}


		public String getEdicao() {
			return edicao;
		}


		public void setEdicao(String edicao) {
			this.edicao = edicao;
		}


		public boolean getStatus() {
				
			return status;
		}


		public void setStatus(boolean status) {
					if (status == true) {
				System.out.println("Livro disponível");
			}else {
				System.out.println("Livro indisponível");
			this.status = status;
		}
}


	//Verificar se a função é necessária
		public String statusLivro(String status) {
				
				switch (status) {
				case "1": 
					System.out.println("Livro indisponível");
						break;
				case "2":
					System.out.println("Livro disponível");
				default:
					System.out.println("Status não disponível");
				}
				return status;
				
		}
		
		public void aluguel() {
					if (status == true) {
						Date dataTeste = new Date();
						Calendar cal = Calendar.getInstance(); 
							cal.setTime(dataTeste ); 
								cal.add(Calendar.DATE, 31);
									dataTeste = cal.getTime();
									dataDeAluguel = dataTeste;
					System.out.println("Livro alugado com sucesso, Devolva-o em: " +dataTeste);	
					}else {
						System.out.println("Você não poderá alugar o livro, pois está indisponível");
					}
	}
				
	
		public Date getDataDeAluguel() {
			return dataDeAluguel;
		}


		public void setDataDeAluguel(Date dataDeAluguel) {
			this.dataDeAluguel = dataDeAluguel;
		}

	
}