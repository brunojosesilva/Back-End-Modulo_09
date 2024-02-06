import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        System.out.print("Digite um número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        Integer wrapperInteiro = Integer.valueOf(numeroInteiro);
        Double wrapperDecimal = Double.valueOf(numeroDecimal);

        System.out.println("Valor inteiro (primitiva): " + numeroInteiro);
        System.out.println("Valor decimal (primitiva): " + numeroDecimal);
        System.out.println("Valor inteiro (wrapper): " + wrapperInteiro);
        System.out.println("Valor decimal (wrapper): " + wrapperDecimal);

        scanner.close();
    }
}