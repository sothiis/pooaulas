import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Bellinha", "991222983", "Gastrononia");
        Professor professor = new Professor("Paxx", "992401974", 20000);

        Pessoa pessoa;
        pessoa = professor;
        professor = (Professor)pessoa;

        System.out.println(pessoa.exibir()); //Polimorfismo
        // System.out.println(p);
        // System.out.println(ps.exibir());

        ArrayList<Pessoa> lista = new ArrayList<>();
        lista.add (new Estudante("E1", "T2", "C1"));
        lista.add (new Professor("P1", "T2", 10000));

        for (Pessoa p : lista) {
            System.out.println(p.exibir());
        }
    }
}
