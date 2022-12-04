public class Client {
    private String street;
    private String city;
    private String name;
    private String postalCode;
    private String addrress;
    private String email;
    private String country;
    private String cpf;

    public Client(String street, String city, String name, String postalCode, String addrress, String email, String country, String cpf) {
        this.street = street;
        this.city = city;
        this.name = name;
        this.postalCode = postalCode;
        this.addrress = addrress;
        this.email = email;
        this.country = country;
        this.cpf = cpf;
    }

    public Client() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddrress() {
        return addrress;
    }

    public void setAddrress(String addrress) {
        this.addrress = addrress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
