import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        sc.nextLine();
        String numeroAgencia = sc.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldoConta = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque %n"
                            ,nomeCliente, numeroAgencia, numeroConta, saldoConta);



    }
}