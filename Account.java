
import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> t1 = new ArrayList<Transaction>();

    public Account() {
    }

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public Account(String id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        this.name = name;
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

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        Transaction tt = new Transaction('D', deposit, this.getBalance(), "Deposit");
        this.t1.add(tt);
    }

    public ArrayList<Transaction> getT1() {
        return t1;
    }

    public int getArrayListSize() {
        return t1.size();
    }

    public Transaction getMember(int index) {
        return t1.get(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double withdraw) {
        if (this.balance - withdraw >= 0) {
            balance -= withdraw;
            t1.add(new Transaction('W', withdraw, this.getBalance(), "withdraw"));
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}