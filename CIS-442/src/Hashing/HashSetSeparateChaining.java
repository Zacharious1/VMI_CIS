//HR Cadet Estes is my partner

package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetSeparateChaining<AnyType> {
    public static final int DEFAULT_TABLE_SIZE = 101;
    private HashSet<AnyType>[] theHashes;
    private int currentSize;
    private int tableSize;
    private int collisions;


    //Running Time: O(N), as the for loop must fill each array slot with a new HashSet
    public HashSetSeparateChaining(int size){
        theHashes = new HashSet[nextPrime(size)];
        tableSize = theHashes.length;
        for (int i = 0; i < theHashes.length; i++) {
            theHashes[i] = new HashSet<>();
        }
    }


    //Running Time: O(N)is the average run time but if it needs to rehash, the run time goes up to O(N^2)
    //Because every element must be copied over to the new array
    public void insert(AnyType x) {
        HashSet<AnyType> whichList = theHashes[hash(x)];

        if (!whichList.contains(x)) {
            whichList.add(x);
            if (++currentSize >= tableSize) rehash();
        }
        else{ collisions++; }
    }


    //Running Time: O(N^2), as every element needs to be copied over to the new array
    public void rehash() {
        HashSet<AnyType>[] oldLists = theHashes;
        theHashes =new HashSet[nextPrime(2* theHashes.length)];
        for (int i = 0; i < theHashes.length; i++) {
            theHashes[i] = new HashSet<>();
        }
        for (int i = 0; i < oldLists.length; i++) {
            for(AnyType item: oldLists[i]){
                insert(item);
            }
        }
    }



    //Running Time: O(1), is the average, but if every element was hashed to the same index
    //it would be O(N), as we must go through every element at that index. We should never see this runtime.
    public boolean contains(AnyType x) {
        HashSet<AnyType> whichList = theHashes[hash(x)];
        return  whichList.contains(x);
    }



    //Running Time: O(1) is the average, as it finds the element and removes it but if every element was hashed to the same index,
    //it could go up to O(N). We should never see this runtime
    public void remove(AnyType x) {

        HashSet<AnyType> whichList = theHashes[hash(x)];
        if (whichList.contains(x)) {
            whichList.remove(x);
            currentSize--;
        }
    }

    private int hash(AnyType x){
        int hashVal = x.hashCode();
        hashVal %= theHashes.length;
        if(hashVal < 0)
            hashVal += theHashes.length;
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



    //Running Time: O(N), as each element is replaced with null
    public void makeEmpty() {
        Arrays.fill(theHashes, null);
    }



    public static void main(String[] args) {
        HashSetSeparateChaining<Integer> a = new HashSetSeparateChaining<Integer>(11);
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

        for (int i = 0; i < a.tableSize; i++) {
            System.out.println(a.theHashes[i]);
        }
        System.out.println();
        System.out.println(a.contains(11));
        System.out.println();
        a.remove(11);
        for (int i = 0; i < a.tableSize; i++) {
            System.out.println(a.theHashes[i]);
        }
    }
}

