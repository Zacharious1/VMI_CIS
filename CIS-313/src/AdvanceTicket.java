//Help received: none
public class AdvanceTicket extends FixedPriceTicket{
    public AdvanceTicket(int days) {
        super();
        if (days >= 10)
            this.setPrice(super.getPrice());
        else this.setPrice(super.getPrice() + 10);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
