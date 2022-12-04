public class Bank {
    private String name;
    private String phoneNumber;
    private String addrress;
    private String cnpj;
    private String email;

    public Bank(String name, String phoneNumber, String addrress, String cnpj, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.addrress = addrress;
        this.cnpj = cnpj;
        this.email = email;
    }

    public Bank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddrress() {
        return addrress;
    }

    public void setAddrress(String addrress) {
        this.addrress = addrress;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
