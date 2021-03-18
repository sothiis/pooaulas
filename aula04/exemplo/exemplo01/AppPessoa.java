package exemplo.exemplo01;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(); //instaciar um objeto do tipo Pessoa
        Pessoa p2 = new Pessoa(); 
        String telefone; //variavel do main, variavel local

        p.nome = "Bellinha";
        p.telefone = "55556856";
        p.apresentar();
        telefone = p.obterTelefone();
        System.out.println(telefone);

        p2.nome = "Paxx";
        p2.telefone = "96695565";
        p2.apresentar();
        System.out.println(p2.obterTelefone());


    
    }
}
