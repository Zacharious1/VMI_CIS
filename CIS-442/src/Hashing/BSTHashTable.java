//Help Received: Cadet Estes is my partner. Cadet Jones helped with some debugging. We had the right code but it was calling classes outside of its package, which i didnt understand.
package Hashing;
import java.util.Arrays;

public class BSTHashTable<AnyType extends Comparable<AnyType>> {
    public static final int DEFAULT_TABLE_SIZE = 101;
    private BinarySearchTree<AnyType> [] treeLists;
    private int currentSize;
    private int tableSize;


    //Running Time: O(N), as the for loop must fill each array slot with a new BST
    public BSTHashTable(int size){

        treeLists = new BinarySearchTree[nextPrime(size)];
        tableSize = treeLists.length;
        for (int i = 0; i < treeLists.length; i++) {
            treeLists[i] = new BinarySearchTree<AnyType>();
        }
    }


    //Running Time: O(N)is the average run time But if it needs to rehash, the run time goes
    //up to O(N^2) because every element must be copied over to the new array
    public void insert(AnyType x) {
        BinarySearchTree<AnyType> whichList = treeLists[hash(x)];

        if (!whichList.contains(x, whichList.getRoot())) {
            whichList.insert(x);
            if (++currentSize >= tableSize) rehash();
        }
    }


    //Running Time: O(N^2), as every element needs to be copied over to the new array
    public void rehash() {
        BinarySearchTree<AnyType>[] oldTree = treeLists;
        treeLists = new BinarySearchTree[nextPrime(2 * treeLists.length)];
        for (int i = 0; i < treeLists.length; i++) {
            treeLists[i] = new BinarySearchTree();
        }
        for (int i = 0; i < oldTree.length; i++){
            if(oldTree[i].getRoot() != null)
                inOrder(oldTree[i].getRoot());
        }
    }

    public void inOrder(BinaryNode<AnyType> rootNode) {
        if(rootNode.left != null)
            inOrder(rootNode.left);

        insert(rootNode.theElement);
        
        if(rootNode.right != null)
            inOrder(rootNode.right);
    }


    //Running Time: O(1), is the average, but if every element was hashed to the same index
    // it would be O(N), as we must go through every element at that index. We should never see this runtime.
    public boolean contains(AnyType x) {
        BinarySearchTree<AnyType> whichList = treeLists[hash(x)];
        return whichList.contains(x, whichList.getRoot());
    }


    //Running Time: O(1) is the average, as it finds the element and removes it but if every element was
    // hashed to the same index, it could go up to O(N). We should never see this runtime
    public void remove(AnyType x) {
        BinarySearchTree<AnyType> whichList = treeLists[hash(x)];
        if (whichList.contains(x, whichList.getRoot())) {
            whichList.remove(x, whichList.getRoot());
            currentSize--;
        }
    }


    //Running Time: O(N), as each element is replaced with null
    public void makeEmpty() {
        Arrays.fill(treeLists, null);
    }

    private int hash(AnyType x){
        int hashVal = x.hashCode();
        hashVal %= treeLists.length;
        if(hashVal < 0)
            hashVal += treeLists.length;
        return hashVal;
    }

    private static int nextPrime(int n){
        if (n % 2 == 0) n++;
        while (!isPrime(n)) n += 2;
        return n;
    }

    private static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        BSTHashTable<Integer> a = new BSTHashTable<Integer>(11);
        a.insert(12);
        a.insert(23);
        a.insert(34);
        a.insert(11);
        a.insert(22);
        a.insert(13);
        a.insert(33);
        a.insert(18);
        a.insert(29);
        a.insert(15);
        System.out.println(a.contains(11));
        a.remove(11);
        a.makeEmpty();
    }
}

