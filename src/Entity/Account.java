package Entity;

public class Account {
    private String id;
    private double balance;
    public Account(){;}
    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(this.getId())
                .append(":=")
                .append(this.getBalance())
                .toString();
    }
}
