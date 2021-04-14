package Hashing;
import java.util.List;
import java.util.LinkedList;

public class SeparateChaining<AnyType> {
    public static final int DEFAULT_TABLE_SIZE = 101;
    private List<AnyType> [] theLists;
    private int currentSize;
    private int tableSize;
    private int collisions;

    public SeparateChaining(int size){

        theLists = new LinkedList[nextPrime(size)];
        tableSize = theLists.length;
        for (int i = 0; i < theLists.length; i++) {
            theLists[i] = new LinkedList<>();
        }

    }

    public SeparateChaining(){
        this(DEFAULT_TABLE_SIZE);
    }

    public void insert(AnyType x) {
        List<AnyType> whichList = theLists[hash(x)];

        if (!whichList.contains(x)) {
            whichList.add(x);
            if (++currentSize >= tableSize) rehash();
        }
        else{ collisions++; }
    }

    public void rehash() {
        List<AnyType>[] oldLists = theLists;
        theLists =new List[nextPrime(2* theLists.length)];
        for (int i = 0; i < theLists.length; i++) {
            theLists[i] = new LinkedList<>();
        }
        for (int i = 0; i < oldLists.length; i++) {
            for(AnyType item: oldLists[i]){
                insert(item);
            }

        }

    }

    public boolean contains(AnyType x) {
        List<AnyType> whichList = theLists[hash(x)];
        return whichList.contains(x);
    }

    public void remove(AnyType x) {
        List<AnyType> whichList = theLists[hash(x)];
        if (whichList.contains(x)) {
            whichList.remove(x);
            currentSize--;
        }
    }

    private int hash(AnyType x){
        int hashVal = x.hashCode();
        hashVal %= theLists.length;
        if(hashVal < 0)
            hashVal += theLists.length;
        return hashVal;
    }

    private static int nextPrime(int n){
        if (n % 2 == 0) n++;
        for (; !isPrime(n) ; n += 2)
            ;
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
        SeparateChaining<Integer> a = new SeparateChaining<Integer>(11);
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
            System.out.println(a.theLists[i]);
        }
        System.out.println();
        System.out.println(a.contains(11));
        System.out.println();
        a.remove(11);
        for (int i = 0; i < a.tableSize; i++) {
            System.out.println(a.theLists[i]);
        }
    }
}

