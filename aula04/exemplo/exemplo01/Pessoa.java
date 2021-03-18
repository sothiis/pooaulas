package exemplo.exemplo01;

public class Pessoa {

    //atributos
    String nome;
    String telefone; //atributo, que existe dentro da pessoa


    //metodos - açoes
    void apresentar() { //metodo da classe pessoa
        System.out.println("Olá! Eu sou " + nome);
    }

    String obterTelefone() {
        return telefone;
    }

}