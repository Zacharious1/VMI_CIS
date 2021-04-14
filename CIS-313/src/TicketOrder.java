//Help received: none
public class TicketOrder {
    private static int total = 0;
    private static Ticket[] tix;


    public static int totalPrice(Ticket[] tickets) {
        for (int i = 0; i < tickets.length; i++){
            if (tickets[i] != null) {
                total += tickets[i].getPrice();
            }
        }
        return total;
    }

    public static String order(Ticket[] tickets) {
        String ord = "";
        for (int i = 0; i < tickets.length; i++)
            if(tickets[i] != null)
            ord += "\n " + tickets[i].toString();
        return ord;
    }

    public static void add(Ticket ticket) {
        for (int i = 0; i < tix.length; i++) {
            if (tix[i] == null) {
                tix[i] = ticket;
                break;
            }
        }
    }

    public static void main(String[] args) {
        tix = new Ticket[1001];
        AdvanceTicket a = new AdvanceTicket(20);
        ComplimentaryTicket c = new ComplimentaryTicket();
        WalkupTicket w = new WalkupTicket();
        StudentAdvanceTicket s = new StudentAdvanceTicket(16);
        add(a);
        add(c);
        add(w);
        add(s);
        System.out.println(order(tix));
        System.out.println("The total price is : $" + totalPrice(tix));
    }


}
