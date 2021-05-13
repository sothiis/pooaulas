
public class Pessoa {
    private String nome, telefone;

    // PRIVATE SOMENTE ACESSIVEL NA CLASSE QUE FOI CRIADA


    public Pessoa(String nome, String telefone) {
        this.nome =  nome;
        this.telefone = telefone;
    }

    public String getNome(){
        //uma vez definido nome, não pode mais mudar, usando o get
        return nome;
    }

    public String exibir(){
        return "Nome: "+ nome + ":" + telefone;
    }

    @Override
    public String toString() {
        return "Nome: "+ nome + ":" + telefone;
    }

  


}

