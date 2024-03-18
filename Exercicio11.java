import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Consumo de Energia");
        System.out.println("---------------------------------");

        // Solicitar os dados do equipamento
        System.out.print("Informe a potência do equipamento (em Watts): ");
        double potenciaWatts = scanner.nextDouble();

        System.out.print("Informe a quantidade de horas que o equipamento fica ligado por dia: ");
        double horasPorDia = scanner.nextDouble();

        System.out.print("Informe o valor do kW/h (em reais): ");
        double valorKWh = scanner.nextDouble();

        // Calcular o consumo de energia em kWh
        double consumoKWh = calcularConsumoEnergia(potenciaWatts, horasPorDia);

        // Calcular o valor pago pela energia
        double valorPago = calcularValorPago(consumoKWh, valorKWh);

        // Exibir os resultados
        System.out.println("\nConsumo de energia: " + consumoKWh + " kWh");
        System.out.println("Valor a ser pago: R$" + valorPago);

        scanner.close();
    }

    // Método para calcular o consumo de energia em kWh
    public static double calcularConsumoEnergia(double potenciaWatts, double horasPorDia) {
        return (potenciaWatts * horasPorDia) / 1000; // Dividindo por mil para converter de Watts para kWh
    }

    // Método para calcular o valor pago pela energia
    public static double calcularValorPago(double consumoKWh, double valorKWh) {
        return consumoKWh * valorKWh;
    }
}