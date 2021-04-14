//Help received: none
public abstract class FixedPriceTicket extends Ticket {
    private int price = 30;

    public FixedPriceTicket(int p) {
            setPrice(p);

    }

    public FixedPriceTicket() {

    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
