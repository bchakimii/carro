import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarações
        Carro meuCarro = new Carro();

        // Inicializando
        meuCarro.modelo = "Azera";
        meuCarro.marca = "Hyundai";
        meuCarro.placa = "TADS24";
        meuCarro.ano = 2012;
        meuCarro.velocidade = 0.0;
        meuCarro.combustivel = 25.0; // Combustível inicial

        // informações do carro
        System.out.println(meuCarro);

        // Acelerando
        System.out.print("Informe o valor para acelerar: ");
        double valorAcelerar = scanner.nextDouble();
        meuCarro.acelerar(valorAcelerar);
        System.out.println(meuCarro);

        // Freando
        System.out.print("Informe o valor para frear: ");
        double valorFrear = scanner.nextDouble();
        meuCarro.frear(valorFrear);
        System.out.println(meuCarro);

        // Abastecendo
        System.out.print("Informe o valor para abastecer: ");
        double valorAbastecer = scanner.nextDouble();
        meuCarro.abastecer(valorAbastecer);
        System.out.println(meuCarro);

        // Tentando acelerar sem combustível
        meuCarro.combustivel = 0; // Simulando tanque vazio
        System.out.print("Tentando acelerar sem combustível. Informe o valor:");
        valorAcelerar = scanner.nextDouble();
        meuCarro.acelerar(valorAcelerar);
        System.out.println(meuCarro);

        scanner.close();
    }
}
