package exemplos.exemplo01;

    public class Pessoa {
        String nome;
        double salario;
    

    public Pessoa (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    public Pessoa() {
        nome = "sem nome";
    }

    public void exibir() {
        System.out.println(nome + ", " + salario);

    }
}