import java.util.Scanner;

public class Exercicio5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Retângulo");
        System.out.println("-------------------------");

        System.out.print("Digite o valor da base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);
        double diagonal = calcularDiagonal(base, altura);

        System.out.println("\nResultados:");
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
        System.out.println("Diagonal do retângulo: " + diagonal);

        scanner.close();
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double calcularDiagonal(double base, double altura) {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}