//Help Received: Dr. Lasisi

public class BinaryNode<AnyType extends Comparable<AnyType>> {
    public AnyType theElement;
    public BinaryNode<AnyType> left;
    public BinaryNode<AnyType> right;

    public BinaryNode(AnyType theElement) {
        this(theElement, null, null);

    }

    public BinaryNode() {
        this(null, null, null);

    }

    public BinaryNode(AnyType theElement, BinaryNode<AnyType> left, BinaryNode<AnyType> right) {
        this.theElement = theElement;
        this.left = left;
        this.right = right;
    }

    public AnyType getElement() {
        return theElement;
    }

    public BinaryNode<AnyType> getLeft() {
        return left;
    }

    public BinaryNode<AnyType> getRight() {
        return right;
    }

    public void setLeft(BinaryNode<AnyType> left) {
        this.left = left;
    }

    public void setRight(BinaryNode<AnyType> right) {
        this.right = right;
    }

    public void setTheElement(AnyType theElement) {
        this.theElement = theElement;
    }

    public StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder sb) {

        if(right != null)
            right.toString(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);

        sb.append(prefix).append(isTail ? "└── " : "┌── ").append(theElement.toString()).append("\n");

        if(left != null)
            left.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);

        return sb;
    }

    @Override
    public String toString() {

        return this.toString(new StringBuilder(), true, new StringBuilder()).toString();
    }



    public static void main(String[] args) {

        BinaryNode<Character> anode = new BinaryNode<>('a');
        BinaryNode<Character> bnode = new BinaryNode<>('b');
        BinaryNode<Character> cnode = new BinaryNode<>('c');
        cnode.setRight(anode);
        cnode.setLeft(bnode);
    }
}