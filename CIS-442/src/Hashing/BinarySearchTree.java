package Hashing;

public class BinarySearchTree<AnyType extends Comparable<AnyType>> {
    public BinaryNode<AnyType> root;
    public BinaryNode<AnyType> left;
    public BinaryNode<AnyType> right;

    public BinarySearchTree() {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> t) {
        if (t == null) return new BinaryNode<>(x, null, null);

        int compareResult = x.compareTo(t.theElement);
        if (compareResult < 0) t.left = insert(x, t.left);
        else if (compareResult > 0) t.right = insert(x, t.right);
        else ;
        return t;
    }

    public BinaryNode<AnyType> getRoot() {
        return root;
    }

    public AnyType findMin() {
        if (isEmpty()) return null;
        return findMin(root).theElement;
    }

    public BinaryNode<AnyType> findMin(BinaryNode<AnyType> t) {
        if (t == null) return null;
        else if (t.left == null) return t;
        return findMin(t.left);
    }

    public BinaryNode<AnyType> findMax(BinaryNode<AnyType> t) {
        if (t == null) return null;
        else if (t.right == null) return t;
        return findMax(t.right);
    }

    public void insert(AnyType x) {
        root = insert(x, root);
    }



    public BinaryNode<AnyType> remove( AnyType x, BinaryNode<AnyType> t ) {
        if( t == null )
            return t; // Item not found; do nothing
        int compareResult = x.compareTo( t.theElement );
        if( compareResult < 0 )
            t.left = remove( x, t.left );
        else if( compareResult > 0 )
            t.right = remove( x, t.right );
        else if( t.left != null && t.right != null ) // Two children
        {
            t.theElement = findMin( t.right ).theElement;
            t.right = remove( t.theElement, t.right );
        }
        else
            t = ( t.left != null ) ? t.left : t.right;
        return t;
    }

    public boolean contains(AnyType x, BinaryNode<AnyType> t ) {
        if (t == null) {
            return false;
        }
        int compareResult = x.compareTo( t.theElement );
        if( compareResult < 0 )
            return contains( x, t.left );
        else if( compareResult > 0 )
            return contains( x, t.right );
        else
            return true;
    }

    public boolean isBST(BinaryNode<AnyType> root, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt) {
        if (root == null)
            return true;
        if (lt != null && root.theElement.compareTo(lt.theElement) <= 0) return false;
        if (rt != null && root.theElement.compareTo(rt.theElement) >= 0) return false;
        return isBST(root.left, left, right) && isBST(root.right, root, rt);
    }

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

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.insert(3);
        BinaryNode<Integer> root = bst.getRoot();
        System.out.println(root.toString());
        bst.insert(1);
        System.out.println(root.toString());
        bst.insert(4);
        System.out.println(root.toString());
        bst.insert(6);
        System.out.println(root.toString());
        bst.insert(9);
        System.out.println(root.toString());
        bst.insert(2);
        System.out.println(root.toString());
        bst.insert(5);
        System.out.println(root.toString());
        bst.insert(7);
        System.out.println(root.toString());

        //System.out.print(root.toString());
        System.out.println();
        System.out.println(bst.findMax(root) + " is the max value");
        System.out.println();
        System.out.println(bst.findMin(root) + " is the min value");
        System.out.println();
        System.out.println(bst.isBST(root, bst.left, bst.right));
        System.out.println(bst.numLeaves(root));
        System.out.println(bst.numFullNodes(root));
        System.out.println(bst.numNodes(root));



    }
}
