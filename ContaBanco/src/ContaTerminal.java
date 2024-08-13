import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu primeiro nome");
        String nome = scanner.next();
        System.out.println("Digite seu segundo nome");
        String sobrenome = scanner.next();

        System.out.println("Digite seu Saldo");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco sua agencia é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        scanner.close();
    }   
}
