//Help received: none
public class PlatinumCheckingAccount extends InterestCheckingAccount {

    public PlatinumCheckingAccount(String name, int accountNum, int balance) {
        this.setBalance(balance);
        this.setAccountNum(accountNum);
        this.setName(name);
    }

    @Override
    public void addInterest() {
        this.setBalance(this.getBalance() + (this.getBalance() * (2 * this.getInterestAmount())));
    }

    public void addInterest(double interest) {
        this.setBalance(this.getBalance() + (this.getBalance() * (2 * interest)));
    }

    @Override
    public double getInterestAmount() {
        return super.getInterestAmount() * 2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
