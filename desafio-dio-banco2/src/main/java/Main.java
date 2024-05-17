import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new  Cliente();
        Conta conta = new Conta() {
            @Override
            public void imprimirExtrato() {

            }
        };

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);


        cc.depositar(1500);
        cp.depositar(5000);


        System.out.println("Banco do brasil");
        var s = new Scanner(System.in);
        var escolha = " ";

        System.out.println("Digite sua agencia");
        conta.getAgencia(s.nextLine());

        do {
            System.out.println("Escolha qual conta! Corrente ou Poupança");
            escolha = s.nextLine();

            if ("Conta Corrente".equals(escolha)){
                cc.imprimirExtrato();
            }else if ("Conta Poupança".equals(escolha)){
                cp.imprimirExtrato();
            }
            System.out.println("Deseja continuar 'Continuar' caso contrario digite qualquer coisa");
        }while (s.nextLine().equals("Continuar"));
        System.out.println("Sessão encerrada");





    }
}
