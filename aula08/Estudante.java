public class Estudante extends Pessoa {
    //HERANÇA
    private String curso;

    public Estudante(String nome, String telefone, String curso){
        super(nome, telefone);
        this.curso = curso;
        //CHAMANDO CONSTRUTOR DA SUPER CLASSE
        //CHAMA A CLASSE PESSOA()

    }

    @Override //sobrecarregar
    public String exibir(){
        return super.getNome() + " : " + curso;
    }

    @Override
    public String toString() {
        return super.toString() + " : " + curso; 
    }
}
