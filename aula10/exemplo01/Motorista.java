package exemplo01;

public class Motorista extends Funcionario {
    // ELE TEM A CARTEIRA DE HABILITAÇÃO
    // STRING CARTEIRA DE HABILITAÇÃO
    // NUMERO HABILITAÇÃO COMO TEXTO
    // TIPO CARTEIRA DE MOTORISTA
    // GET DADOS VAI MUDAR

    private String carteiraDeMotorista;

    public Motorista(String nome, double salario, String carteiraDeMotorista) {
        super(nome, salario);
        this.carteiraDeMotorista = carteiraDeMotorista;
        // CLASSE SUPER É A CLASSE FUNCIONARIO
    }

    @Override // SOBREESCREVENDO O METODO DA CLASSE FUNCIONARIO
    public String getDados() {
        return "Motorista" + getNome() + " - "  + getSalario() + carteiraDeMotorista;
        // return "Motorista:" + getNome() + " - " + getSalario() + " - " +
        // carteiraDeMotorista;

    }
}