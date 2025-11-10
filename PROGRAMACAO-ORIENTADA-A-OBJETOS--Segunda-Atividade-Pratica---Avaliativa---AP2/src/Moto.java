
// Classe que herda de Veiculo
public class Moto extends Veiculo {
    private int cilindrada;

    // Construtor
    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    // Métodos de acesso ao atributo privado cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Implementação do método abstrato
    @Override
    public String informacoesVeiculo() {
        return "Moto: " + marca + " " + modelo +
               " (" + getAno() + "), " +
               cilindrada + " cilindradas.";
    }
}
