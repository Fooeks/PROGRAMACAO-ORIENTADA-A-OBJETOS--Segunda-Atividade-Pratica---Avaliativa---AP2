
// Classe abstrata que representa um veículo genérico
public abstract class Veiculo {
    // Atributos
    public String marca;
    public String modelo;
    private int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos de acesso ao atributo privado "ano"
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método abstrato - será implementado nas classes filhas
    public abstract String informacoesVeiculo();
}
