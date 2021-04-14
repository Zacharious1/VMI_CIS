package Hashing;

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

}
