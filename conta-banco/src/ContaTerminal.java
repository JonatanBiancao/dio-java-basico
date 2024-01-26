
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por gentileza, digite o número da Conta: ");
        numeroConta = scanner.nextInt();
        System.out.println("Agora, digite o número da Agência: ");
        agencia = scanner.next();
        System.out.println("Informe seu nome: ");
        nomeCliente = scanner.next();
        scanner.nextLine();
        System.out.println("Informe o saldo a ser depositado: ");
        saldo = scanner.nextDouble();
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                            + agencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
