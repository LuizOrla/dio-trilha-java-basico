package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Por favor, digite o níúmero da conta: ");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o saldo: ");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é a %s, conta %s e seu saldo %s já está disponível para saque.", nome, agencia, conta, saldo);


    }
}
