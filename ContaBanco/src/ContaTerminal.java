import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Bem vindo ao Nosso Banco! Para criar sua conta, por favor, primeiro digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Otimo! Agora digite o número da sua conta: ");
            int numero = scanner.nextInt();
            System.out.println("Perfeito! Próximo passo é a sua agência: ");
            String agencia = scanner.next();
            System.out.println("Por fim, digite o saldo inicial da sua conta: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                    + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
        }
    }
}
