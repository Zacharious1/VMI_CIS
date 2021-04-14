/*
Q10: Suppose a binary tree stores integers. Write efficient methods (and give Big-oh running times) that take a
reference to the binary tree root T and compute

a. The number of even data items

b. The sum of all the items in the tree

c. The number of nodes with two children that contains the same value

d. The length of the longest strictly increasing sequence of numbers that follow a path down the tree. The
path does not have to include the root

e. The length of the longest strictly increasing sequence of numbers that follow a path down the tree. The
path must include the root

Test your code with appropriate main method to verify correctness of methods in a − e above.
*/

public class TreeMethodsForNumbers<AnyType> {
    public static int evenElements(BinaryNode<Integer> tree) {
        if(tree == null) return 0;
        int evens = 0;
        if(tree.getElement() % 2 == 0 )
            evens = 1;
        return evens + evenElements(tree.getLeft()) + evenElements(tree.getRight());
    }

    public static int sum(BinaryNode<Integer> tree) {
        if (tree == null) return 0;
        return tree.getElement() + sum(tree.getLeft()) + sum(tree.getRight());
    }

    //public static int sameVal(BinaryNode<Integer> tree) {
        //not sure how to check all nodes against all other nodes.
        //if it was in a BST, i would check the 2 children of a parent to see if they had an identical value, then increment a counter.
    //}
    public static void main(String[] args) {

    }

}
