
// Classe que herda de Veiculo
public class Carro extends Veiculo {
    public int numeroPortas;

    // Construtor
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    // Implementação do método abstrato
    @Override
    public String informacoesVeiculo() {
        return "Carro: " + marca + " " + modelo +
               " (" + getAno() + "), " +
               numeroPortas + " portas.";
    }
}
