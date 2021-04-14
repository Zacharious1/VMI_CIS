//Help received: looked up the keyword instanceof to see syntax on usage
import java.util.ArrayList;

public class Bank extends Account {

    public double totalAssets(ArrayList list) {
        double total = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Account temp = (Account) list.get(i);
            total += temp.getBalance();
        }
        return total;
    }

    public static void addInterest(ArrayList list, double interest) {
        for (int i = 0; i < list.size(); i++) {
            Account temp = (Account) list.get(i);
            if (temp != null) {
                if (temp instanceof PlatinumCheckingAccount)
                    ((PlatinumCheckingAccount) temp).addInterest(interest);
                else if (temp instanceof InterestCheckingAccount)
                    ((InterestCheckingAccount) temp).addInterest(interest);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Account> acc = new ArrayList<>(15);
        InterestCheckingAccount ic = new InterestCheckingAccount("a", 15, 1500);
        PlatinumCheckingAccount pc = new PlatinumCheckingAccount("b", 15, 1500);
        acc.add(ic);
        acc.add(pc);
        addInterest(acc, 0.03);
        System.out.println(acc.get(0).toString());
        System.out.println(acc.get(1).toString());
    }
}
