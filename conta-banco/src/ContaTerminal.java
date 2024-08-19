import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Digite o número de sua conta ");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.next();

        System.out.println("Digite o sobrenome do cliente");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite o saldo atual da conta");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo +
                " já está disponível para saque");
    }
}