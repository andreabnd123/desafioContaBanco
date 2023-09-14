import java.util.Scanner;

public class ContaTerminal {
    private int numeroAgencia;
    private int numeroConta;
    private double saldo;
    private String nomeTitular;

    public class ContaTerminal(int numeroAgencia, int numeroConta, double saldo, String nomeTitular) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
        }
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao nosso banco!");

        System.out.print("Por favor, insira o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Insira o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.print("Insira o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Insira o saldo disponível: ");
        double saldo = scanner.nextDouble();

       
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + numeroAgencia + ", conta número " + numeroConta + ",");
        System.out.println("e seu saldo já está disponível para saque: R$" + saldo);

      
        scanner.close();
    }
}
