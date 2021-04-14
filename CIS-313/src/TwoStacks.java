import java.util.Stack;

public class TwoStacks <AnyType extends Comparable> {
    private Stack<AnyType> items;
    private Stack<AnyType> mins;

    private TwoStacks(){
        items = new Stack<>();
        mins = new Stack<>();
    }

    private void push(AnyType x) {
        items.push(x);
        if (mins.isEmpty() || x.compareTo(mins.peek()) < 0)
            mins.push(x);
    }

    private AnyType findMin(){
        if (items.isEmpty()) return null;
        return mins.peek();
    }

    private AnyType pop(){
        if (mins.isEmpty()) return null;
        AnyType x = items.pop();
        if (x.compareTo(mins.peek()) == 0) {
            mins.pop();
        }
        return x;
    }

    private void printStack() {
        System.out.println("Items:");

        for (AnyType item : items)
            System.out.println(item);

        System.out.println("\n\n");
        System.out.println("Mins:");
        for (AnyType min : mins)
            System.out.println(min);
    }

    public static void main(String[] args) {
        TwoStacks<Integer> stacks = new TwoStacks<>();
        stacks.push(6);
        stacks.push(7);
        stacks.push(8);
        stacks.push(3);
        stacks.push(1);
        Integer min = stacks.findMin();
        System.out.println("min: " + min);
        stacks.pop();
        stacks.printStack();
    }

}
