package ex00;

public class User {
    private int identificator;
    private String name;
    private int balance;

    public void userIdentificator(int identificator) {
        this.identificator = identificator;
    }

    public void userName(String name) {
        this.name = name;
    }

    public void valueOfBalance(int balance) {
        this.balance = balance;
    }

    public Integer getIdentifier() {
        return identificator;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public User(int identificator, String name, int balance) {
        userIdentificator(identificator);
        userName(name);
        valueOfBalance(balance);
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            System.err.println("Error, balance cant be negative");
            System.exit(-1);
        }
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "identifier=" + identificator +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
