/*
Q4.46: Two binary trees are similar if they are both empty or both nonempty and have
similar left and right subtrees. Write a method to decide whether two binary trees
are similar. What is the running time of your method?
*/

//Help Received: https://www.geeksforgeeks.org/check-if-two-trees-have-same-structure/ helped me understand what the
//Question was asking, I attempted to code it and got to line 3 before I looked at what they did to solve it
//Which is where line 4 comes from.

public class AreBinaryTreesSimilar<AnyType extends Comparable<AnyType>> {
    public boolean isSimilar(BinaryNode<AnyType> n1, BinaryNode<AnyType> n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 != null && n2 != null) return isSimilar(n1.left, n2.left) && isSimilar(n1.right, n2.right);
        return false;
    }
}
