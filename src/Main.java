import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        BankSeerviceManagement BSM = new BankSeerviceManagement();
        int operation;
        do {
            System.out.println("Bem-Vindo ao Banco 24h, em que podemos ajudar?");
            System.out.println("1 - Abrir Conta\n2 - Checar Saldo\n3 - Transferencia\n4 - Deposito\n5 - Emprestimo\n6 - SAIR");
            operation = menu.nextInt();

            switch (operation) {
                case 1:
                    BSM.openAccount();
                    break;
                case 2:
                    BSM.showMoney();
                    break;
                case 3:
                    BSM.transfer();
                    break;
                case 4:
                    BSM.deposit();
                    break;
                case 5:
                    BSM.loan();
                    break;
                case 6:
                    System.exit(0);
            }


        } while (operation != 6);
    }
}