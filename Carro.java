public class Carro {

    // Atributos
    String modelo;
    String marca;
    String placa;
    int ano;
    double velocidade;
    double combustivel;
    double capacidadeMaximaCombustivel = 50.0;

    // Métodos
    void acelerar(double valor) {
        if (combustivel <= 0) {
            velocidade = 0;
            System.out.println("Não é possível acelerar sem combustível no tanque. Velocidade: " + velocidade + " km/h.");
            return;
        }

        double incremento = valor * 0.1;
        if (velocidade == 0 && incremento < 5) incremento = 5;
        
        combustivel -= valor * 0.01;
        if (combustivel < 0) combustivel = 0;

        velocidade += incremento;
        if (velocidade > 150) velocidade = 150;

        System.out.println("Acelerou para " + velocidade + " km/h.");
    }

    void frear(double valor) {
        velocidade -= valor * 0.1;
        if (velocidade < 0) velocidade = 0;

        // Perde um pouco de combustível ao frear
        combustivel -= valor * 0.005; // Diminui 0.5% do valor em combustível
        if (combustivel < 0) combustivel = 0;

        System.out.println(velocidade > 0 ? "Freou para " + velocidade + " km/h." : "O carro já está parado.");
    }

    void abastecer(double valor) {
        combustivel += valor;
        if (combustivel > capacidadeMaximaCombustivel) combustivel = capacidadeMaximaCombustivel;
        System.out.println(combustivel == capacidadeMaximaCombustivel ? "Tanque cheio!" : "Abastecido com " + valor + " litros.");
    }

    public String toString() {
        return "Carro" +
               "\n\tModelo: " + modelo +
               "\n\tMarca: " + marca +
               "\n\tPlaca: " + placa +
               "\n\tAno: " + ano +
               "\n\tVelocidade: " + velocidade + " km/h" +
               "\n\tCombustível: " + combustivel + " litros";
    }
}
