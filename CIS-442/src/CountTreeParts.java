/*
Q4.31: Write efficient methods that take only a reference to the root of a binary tree, T, and
compute:

a. The number of nodes in T. Running Time is O(N) because the entire tree must be traversed to find the number of nodes

b. The number of leaves in T. Running Time is O(N) because the entire tree must be traversed to find the number of nodes

c. The number of full nodes in T. Running Time is O(N) because the entire tree must be traversed to find the number of nodes

What is the running time of your routines?
*/

// Help Received: https://www.geeksforgeeks.org/count-full-nodes-binary-tree-iterative-recursive/ helped me understand
//how to recursively find the number of full nodes. I knew that i would need to check if the node we are at has both a
//left and right that are not null, but i did not understand how to implement a counter that wouldnt have duplicates.
public class CountTreeParts<AnyType extends Comparable<AnyType>> {
    public  int numLeaves(BinaryNode<AnyType> root) {
        if (root == null) return 0;
        else if (root.left == null && root.right == null) return 1;
        else return numLeaves(root.left) + numLeaves(root.right);
    }

    public int numNodes(BinaryNode<AnyType> root) {
        if (root == null) return 0;
        return numNodes(root.left) + numNodes(root.right) + 1;

    }

    public int numFullNodes(BinaryNode<AnyType> root) {
        if (root == null) return 0;
        int counter = 0;
        if (root.left != null && root.right != null) //if parent has 2 children, increase count
            counter++;
        counter += (numFullNodes(root.left) + numFullNodes(root.right)); //traverse tree to next node on left and right side
        //and repeat the process of checking if the node has 2 children
        return counter;

    }
}
