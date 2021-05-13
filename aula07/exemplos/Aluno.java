package exemplos;

public class Aluno {
    private String nome;
    private String telefone;

    //contrutor
    public Aluno(String nome, String telefone){
        //iniciar nome e telefone
        //inicializar strings 
        this.nome =  nome;
        this.telefone = telefone;
    }

    //metodo retornar nome aluno
    public String getNome(){
        return nome;
    }


}
