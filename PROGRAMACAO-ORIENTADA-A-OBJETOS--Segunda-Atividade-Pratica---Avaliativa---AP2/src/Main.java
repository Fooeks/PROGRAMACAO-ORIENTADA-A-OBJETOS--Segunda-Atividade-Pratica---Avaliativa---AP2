
public class Main {
    public static void main(String[] args) {
        // Cria um objeto da classe Carro
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);

        // Cria um objeto da classe Moto
        Moto moto = new Moto("Honda", "CB 500", 2021, 500);

        // Exibe as informações de cada veículo
        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}
