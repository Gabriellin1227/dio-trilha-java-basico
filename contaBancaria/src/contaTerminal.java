
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int numero;
        String agencia, nome;
        double saldo;

        System.out.print("Digite o número do banco! \n");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o número da Agencia! \n");
        agencia = scanner.nextLine();
        System.out.print("Digite o seu Nome! \n");
        nome = scanner.nextLine();
        System.out.print("Digite o seu Saldo! \n");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque", nome, agencia, numero, saldo );

    }
}
