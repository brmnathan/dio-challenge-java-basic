public class Account {
    private int number;
    private String clientName;
    private String agency;
    private Double balance = 0.0;

    public Account(int number, String clientName, String agency) {
        this.number = number;
        this.clientName = clientName;
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw (Double value){
        this.balance -= value;
    }

    public void deposit (Double value){
        this.balance += value;
    }

    @Override
    public String toString() {
        return ("Hello " + clientName +
                ", thank you for joining our institution." +
                "\nAgency: " + agency +
                "\nAccount: " + number +
                "\nBalance: $" + balance +
                "\nYour account is already available for withdraw and deposit.");
    }
}
