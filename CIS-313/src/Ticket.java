//Maj. Lasisi helped class write the program
public abstract class Ticket {
    private int serialNum;
    private int[] serialList = new int[1001];
    public static final int TICKET_SIZE = 1001;

    public Ticket() {
        serialNum = generateSerialNum();
    }

   public abstract int getPrice();

    public int getSerialNum() {
        return this.serialNum;
    }

    @Override
    public String toString() {
        return "SN: " + getSerialNum() + ", $" + getPrice();
    }

    private int generateSerialNum() {
        while (true) {
            int randNum = 1 + (int)(Math.random() * TICKET_SIZE);
            if (serialList[randNum] != randNum) {
                serialList[randNum] = randNum;
            }
            return randNum;
        }
    }

    public static void main(String[] args) {
        //Ticket t = new Ticket();
    }
}
