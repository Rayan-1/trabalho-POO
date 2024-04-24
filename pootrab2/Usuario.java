package trabPoo2;


public class Usuario {
   private int Codigo;
   private String Nome;
   private Cadastro Dep;

   public Usuario() {
   }

   public Usuario(int Codigo,String Nome) {
       this.Codigo = Codigo;
       this.Nome = Nome;
   }

   public int getCodigo() {
       return Codigo;
   }

   public void setCodigo(int Codigo) {
       this.Codigo = Codigo;
   }

   public String getNome() {
       return Nome;
   }

   public void setNome(String Nome) {
       this.Nome = Nome;
   }

   public Cadastro getDep() {
       return Dep;
   }

   public void setDep(Cadastro Dep) {
       this.Dep = Dep;
   }
   
   
}