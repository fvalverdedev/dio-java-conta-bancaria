import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Classe Scanner
        // Exibir mensagem
        // Receber valores digitados
        // Exibir a mensagem
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor informe o seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Informe o número da agência: ");
        String numeroAgencia = scanner.nextLine();
        
        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.print("Informe o saldo da conta: ");
        double saldo = scanner.nextDouble();
        
        System.out.print("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(numeroAgencia).concat(", conta ") + numeroConta + " e seu saldo " + saldo + " já disponível para saque.");
        
        scanner.close();
    }
}
