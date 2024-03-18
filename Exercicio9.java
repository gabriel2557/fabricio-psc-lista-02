import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC");
        System.out.println("------------------");

        // Solicitar peso e altura
        System.out.print("Informe o peso atual (em quilogramas): ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a altura (em centímetros): ");
        double altura = scanner.nextDouble();

        // Converter altura para metros
        altura /= 100;

        // Calcular IMC
        double imc = calcularIMC(peso, altura);

        // Calcular peso ideal e peso ideal ajustado
        double pesoIdeal = calcularPesoIdeal(altura);
        double pesoIdealAjustado = calcularPesoIdealAjustado(imc, pesoIdeal);

        // Exibir resultados
        System.out.println("\nSeu IMC é: " + imc);
        System.out.println("Peso ideal: " + pesoIdeal + " kg");
        System.out.println("Peso ideal ajustado: " + pesoIdealAjustado + " kg");

        scanner.close();
    }

    // Método para calcular IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para calcular peso ideal (IMC 22)
    public static double calcularPesoIdeal(double altura) {
        return 22 * (altura * altura);
    }

    // Método para calcular peso ideal ajustado
    public static double calcularPesoIdealAjustado(double imc, double pesoIdeal) {
        return pesoIdeal * (imc / 22);
    }
}
