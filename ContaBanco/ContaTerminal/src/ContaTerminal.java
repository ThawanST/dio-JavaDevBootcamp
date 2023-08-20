import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // recebendo a agência
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = sc.next();
        // recebendo o númerp da conta
        System.out.println("Por favor, digite o numero da conta: ");
        int conta = sc.nextInt();
        // recebendo o nome do cliente
        System.out.println("Por favor, digite o nome do cliente: ");
        String nome = sc.next();
        // recebendo o valor do saldo em conta
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        // exibindo os valores apresentados
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

}
