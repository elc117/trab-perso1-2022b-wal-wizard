import java.util.Scanner;

public class BankSeerviceManagement extends Account{
    private int quantity;
    private int installment;

    public int getInstallment() {
        return installment;
    }

    public void setInstallment(int installment) {
        this.installment = installment;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Client cliente = new Client();
    Scanner scan = new Scanner(System.in);

    public void openAccount(){
        System.out.println("----- Abertura de conta -----\n");

        System.out.println("Qual é seu nome: ");
        String nome = scan.next();
        cliente.setName(nome);

        System.out.println("Qual é seu endereço: ");
        String endereco = scan.next();
        cliente.setAddrress(endereco);

        System.out.println("Qual é sua cidade: ");
        String cidade = scan.next();
        cliente.setCity(cidade);

        System.out.println("Qual é o código postal: ");
        String postalCode = scan.next();
        cliente.setPostalCode(postalCode);

        System.out.println("Qual é seu estado: ");
        String city = scan.next();
        cliente.setCity(city);

        System.out.println("Qual é seu email: ");
        String email = scan.next();
        cliente.setEmail(email);

        System.out.println("Qual é seu cpf: ");
        String cpf = scan.next();
        cliente.setCpf(cpf);
    }

    public void showMoney(){
        System.out.println("Informações da conta: \n");
        System.out.println("Número da conta: "+ this.getNumber());
        System.out.println("CPF: "+ this.getCpf());
        System.out.println("Saldo em conta R$: "+ this.getNumber());
    }

    int deposit(){
        System.out.println("Quanto você gostarai de depositar R$ ");
        this.quantity = scan.nextInt();
        this.setNumber(this.quantity);
        System.out.println("Operação efetuada com sucesso!");
        return this.quantity;
    }

    public void loan() {
        System.out.println("Qual o valor do emprestimo?: ");
        this.quantity = scan.nextInt();

        System.out.println("Em quantoas vezes?: ");
        this.installment = scan.nextInt();

        int quantLoan = this.quantity / this.installment;

        System.out.println("Você ira pagar por mês R$ " + quantLoan);
    }

    public void transfer() {
        System.out.println("Quanto gostaria de transferir? ");
        this.quantity  = scan.nextInt();

        if(this.getValue() < this.quantity) {
            System.out.println("Infelizmente seu saldo é insuficiente para efetuar esta operação!");
        } else {
            long valueOfTransfer = this.getValue() - this.quantity;
            System.out.println("O Valor Tranferido foi R$: " + valueOfTransfer);
        }
    }
}
