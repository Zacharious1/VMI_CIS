//Help received: none
public class InterestCheckingAccount extends Account implements InterestBearingAccount {
    private double interestAmount = 0.03;

    public InterestCheckingAccount(String name, int accountNum, int balance) {
        this.setBalance(balance);
        this.setAccountNum(accountNum);
        this.setName(name);
    }

    public InterestCheckingAccount() {

    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }

    @Override
    public void addInterest() {
        this.setBalance(this.getBalance() + (this.getBalance() * interestAmount));
    }

    public void addInterest(double interest) {
        this.setBalance(this.getBalance() + (this.getBalance() * interest));
    }

    @Override
    public String toString() {
        return super.toString() + " with an interest rate of : " + (this.getInterestAmount()*100) + "%";
    }
}
