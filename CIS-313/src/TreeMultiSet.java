import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMultiSet<AnyType> implements MultiSet<AnyType> {

    private Map<AnyType, Integer> treeMap;

    public TreeMultiSet() {
        treeMap = new TreeMap<>();
    }

    @Override
    public void add(AnyType x) {
        if (contains(x))
            treeMap.replace(x, count(x)+1);
        else treeMap.put(x, 1);
    }

    @Override
    public boolean contains(AnyType x) {
        if (treeMap == null)
            return false;
        return treeMap.containsKey(x);
    }

    @Override
    public int count(AnyType x) {
        if (contains(x))
            return treeMap.get(x);
        else return 0;
    }

    @Override
    public boolean removeOne(AnyType x) {
        if (contains(x)) {
            if (count(x) > 1)
                treeMap.replace(x, count(x)-1);
            else treeMap.remove(x);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(AnyType x) {
        if (contains(x)) {
            treeMap.remove(x);
            return true;
        }
        return false;
    }

    @Override
    public void toArray(AnyType[] x) {
        Set<AnyType> keySet = treeMap.keySet();
        int i = 0;
        for (AnyType item : keySet) {
            x[i++] = item;
        }
    }

    @Override
    public String toString() {
        return treeMap.toString();
    }

    public static void main(String[] args) {
        TreeMultiSet<Character> tm = new TreeMultiSet<>();
        tm.add('A');
        tm.add('A');
        tm.add('A');
        System.out.println(tm.toString());
        Character[] arr = new Character[10];
        tm.toArray(arr);

    }
}
