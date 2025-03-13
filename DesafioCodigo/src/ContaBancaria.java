import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // Na linha abaixo, implemente a entrada das três transações:
        double transacao1 = scanner.nextDouble();
        double transacao2 = scanner.nextDouble();
        double transacao3 = scanner.nextDouble();

        double totalTansacao = transacao1 + transacao2 + transacao3;

        // Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial - totalTansacao;
        
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}
