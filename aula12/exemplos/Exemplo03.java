package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        System.out.println(letra("Boa noite", 2));
    }

    private static char letra(String frase, int posicao){
        return frase.charAt(posicao);

    }
}
