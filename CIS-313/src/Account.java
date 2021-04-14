//Help received: none
public abstract class Account {
    private String name;
    private int accountNum;
    private double balance;

    public Account(String name, int accountNum, int balance) {
        this.name = name;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public Account() {}


    public int getAccountNum() {
        return accountNum;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Account " + this.name + " , has account number " + this.accountNum + " and currently has a balance of $" + this.getBalance();
    }
}
