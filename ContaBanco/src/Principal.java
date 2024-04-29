import br.com.contabanco.model.ContaTerminal;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta !");
        conta.setNumero(teclado.nextInt());
        teclado.nextLine(); //limpar buffer
        System.out.println("Por favor, digite o número da Agência !");
        conta.setAgencia(teclado.nextLine());
        System.out.println("Por favor, digite o nome do titular");
        conta.setNome(teclado.nextLine());
        System.out.println("Por favor, digite o valor do Saldo");
        conta.setSaldo(teclado.nextDouble());
        System.out.println("Olá "+ conta.getNome() + ", obrigado por criar uma conta em nosso banco,\n" +
                "sua agência é: "+ conta.getAgencia() +" conta: " + conta.getNumero() + " e seu saldo R$"+ conta.getSaldo()
                + " já está disponível para saque");
    }
}
