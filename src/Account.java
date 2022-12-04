public class Account {
    private int number;
    private String cpf;
    private long value;

    public Account(int number, String cpf, long value) {
        this.number = number;
        this.cpf = cpf;
        this.value = value;
    }

    public Account() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
