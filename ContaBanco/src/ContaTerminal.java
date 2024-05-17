import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", " + "obrigado por criar uma conta em nosso banco!!");
        System.out.println("Sua Conta: " + conta);
        System.out.println("Sua Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Seu saldo ja esta disponível para saque.");
    }
}
