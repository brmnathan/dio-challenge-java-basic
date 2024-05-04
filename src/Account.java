public class Account {
    private int number;
    private String clientName;
    private String agency;
    private Double balance;

    public Account(int number, String clientName, String agency, Double balance) {
        this.number = number;
        this.clientName = clientName;
        this.agency = agency;
        this.balance = balance;
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
                ", thank you for joining our institution, " +
                "your bank agency is " + agency +
                ", account " + number +
                "and your balance $" + balance +
                " is already available for withdraw and deposit.");
    }
}
