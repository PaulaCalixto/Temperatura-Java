import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Converter de Celsius para Fahrenheit");
        System.out.println("2. Converter de Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = converterCelsiusParaFahrenheit(celsius);
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = converterFahrenheitParaCelsius(fahrenheit);
            System.out.println("A temperatura em Celsius é: " + celsius);
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }
        scanner.close();
    }
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

