//Help received: none
public class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int days) {
        super(days);
        if (days >= 10)
            this.setPrice(this.getPrice()/2);
        else this.setPrice(this.getPrice()/2);
    }

    @Override
    public String toString() {
        return super.toString() + "     (student)";
    }
}
