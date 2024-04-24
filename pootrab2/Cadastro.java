package trabPoo2;

import java.util.ArrayList;

/**
 * @author Jorge Sousa & Rayan Victor
 */

public class Cadastro {
    private int Id;
    private String Nome;
    ArrayList<Usuario> ListaFunc;

    public Cadastro() {
        ListaFunc = new ArrayList();
    }

    public Cadastro(int Id, String Nome) {
        this.Id = Id;
        this.Nome = Nome;
        ListaFunc = new ArrayList();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Usuario> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Usuario> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }
    
    public void addFunc(Usuario F){
        F.setDep(this);
        ListaFunc.add(F);
    }
}
