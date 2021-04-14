/*
Q4.15: Write a program to evaluate empirically the following strategies for removing nodes
with two children:
a. Replace with the largest node, X, in TL and recursively remove X.

b. Alternately replace with the largest node in TL and the smallest node in TR, and
recursively remove the appropriate node.

c. Replace with either the largest node in TL or the smallest node in TR (recursively
removing the appropriate node), making the choice randomly.

Which strategy seems to give the most balance? Which takes the least CPU time to
process the entire sequence?
*/

//Help Received: The book provided the base code for remove, I modified it to fit the requirements.
public class RemovingNodesRecursively<AnyType extends Comparable<AnyType>> {

    private BinaryNode<AnyType> findMax(BinaryNode<AnyType> t) {
        if (t == null) return null;
        else if (t.right == null) return t;
        return findMax(t.right);
    }

    public BinaryNode<AnyType> remove(BinaryNode<AnyType> t)
    {
        if (t == null)
            return t; // Item not found; do nothing

        int compareResult = findMax(t).theElement.compareTo(t.theElement);

        if (compareResult < 0)
            t.left = remove(t.left);
        else if(compareResult > 0)
            t.right = remove(t.right );
        else if( t.left != null && t.right != null ) // Two children
        {
            t.theElement = findMax(t.right).theElement;
            t.right = remove(t.right);
        }
        else
            t = ( t.left != null ) ? t.left : t.right;
        return t;
    }

    private BinaryNode<AnyType> remove(AnyType x, BinaryNode<AnyType> t) {
        if(t == null)
            return t; // Item not found; do nothing
        int compareResult = x.compareTo(t.theElement);
        if(compareResult < 0)
            t.left = remove(x, t.left);
        else if(compareResult > 0)
            t.right = remove(x, t.right);
        else if(t.left != null && t.right != null) // Two children
        {
            t.theElement = findMax(t.right).theElement;
            t.right = remove(t.theElement, t.right);
        }
        else
            t = ( t.left != null ) ? t.left : t.right;
        return t;
    }
}
