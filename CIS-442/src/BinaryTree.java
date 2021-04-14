import java.util.LinkedList;
import java.util.Queue;

//Help Received: Dr. Lasisi
public class BinaryTree<AnyType extends Comparable<AnyType>> {

    private BinaryNode<AnyType> root;

    public BinaryTree() {
        root = null;

    }

    public BinaryTree(AnyType theElement) {
     root = new BinaryNode<>(theElement);
    }

    public BinaryNode<AnyType> getRoot() {
        return root;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public static <AnyType extends Comparable<AnyType>> int treeSize(BinaryNode<AnyType> rootNode) {
        if (rootNode == null) return 0;
        return 1+ treeSize(rootNode.getLeft()) + treeSize(rootNode.getRight());
    }

    public static <AnyType extends Comparable<AnyType>> int treeHeight(BinaryNode <AnyType> rootNode) {
        if (rootNode == null) return -1;
        return 1 + Math.max(treeHeight(rootNode.getLeft()), treeHeight(rootNode.getRight()));
    }

    public static <AnyType extends Comparable<AnyType>> void preOrder(BinaryNode<AnyType> rootNode) {
        System.out.print(rootNode.getElement() + " ");
        if(rootNode.getLeft() != null)
            preOrder(rootNode.getLeft());
        if(rootNode.getRight() != null)
            preOrder(rootNode.getRight());
    }

    public static <AnyType extends Comparable<AnyType>> void inOrder(BinaryNode<AnyType> rootNode) {
        if(rootNode.getLeft() != null)
            inOrder(rootNode.getLeft());

        System.out.print(rootNode.getElement() + " ");

        if(rootNode.getRight() != null)
            inOrder(rootNode.getRight());
    }

    public static <AnyType extends Comparable<AnyType>> void postOrder(BinaryNode<AnyType> rootNode) {
        if(rootNode.getLeft() != null)
            postOrder(rootNode.getLeft());

        if(rootNode.getRight() != null)
            postOrder(rootNode.getRight());

        System.out.print(rootNode.getElement() + " ");
    }

    public static <AnyType extends Comparable<AnyType>> void levelOrder(BinaryNode<AnyType> rootNode) {
        Queue<BinaryNode<AnyType>> queue = new LinkedList<>();

        queue.add(rootNode);

        while (!queue.isEmpty()) {
            BinaryNode<AnyType> node = queue.remove();
            System.out.println(node.getElement()+ " ");
            if (rootNode.getLeft() != null)
                queue.add(rootNode);
            if (rootNode.getRight() != null)
                queue.add(rootNode);
        }

    }


    public static <AnyType extends Comparable<AnyType>> BinaryNode<AnyType> duplicate(BinaryNode<AnyType> rootNode) {
        if (rootNode == null) return null;

        BinaryNode <AnyType> dupRootNode = new BinaryNode(rootNode.getElement());

        if (rootNode.getLeft() != null) dupRootNode.setLeft(rootNode.getLeft());
        if (rootNode.getLeft() != null) dupRootNode.setRight(rootNode.getRight());

        return dupRootNode;
    }

    public static <AnyType extends Comparable<AnyType>> BinaryNode<AnyType> mergeTree(AnyType theElement, BinaryTree<AnyType> t1, BinaryTree<AnyType> t2) {
        BinaryNode<AnyType> mergedNode = new BinaryNode<>(theElement, t1.getRoot(), t2.getRoot());
        t1.makeEmpty();
        t2.makeEmpty();

        return mergedNode;
    }

    public static void main(String[] args) {
        BinaryTree<Character> tree = new BinaryTree<>('-');
        BinaryNode<Character> root = tree.getRoot();

        BinaryNode<Character> bNode = new BinaryNode<>('m');
        BinaryNode<Character> cNode = new BinaryNode<>('e');

        root.setLeft(bNode);
        root.setRight(cNode);

        BinaryNode<Character> dNode = new BinaryNode<>('m');
        BinaryNode<Character> eNode = new BinaryNode<>('+');
        bNode.setLeft(dNode);
        bNode.setRight(eNode);

        BinaryNode<Character> fNode = new BinaryNode<>('a');
        BinaryNode<Character> gNode = new BinaryNode<>('b');
        dNode.setLeft(fNode);
        dNode.setRight(gNode);

        BinaryNode<Character> hNode = new BinaryNode<>('c');
        BinaryNode<Character> iNode = new BinaryNode<>('d');
        eNode.setLeft(hNode);
        eNode.setRight(iNode);
        System.out.println(root.toString());
        System.out.println(duplicate(root).toString());
        System.out.println();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);

    }
}