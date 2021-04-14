import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetAndMap<AnyType> {
    private Set<AnyType> set;
    private Map<AnyType, Set<AnyType>> map;

    public TreeSetAndMap() {
        set = new TreeSet<>();
        map = new TreeMap<>();
    }

    public void insertInSet(AnyType x) {
        if (!set.contains(x)) {
            set.add(x);
        }
    }

    public void insertInMap(AnyType key, Set<AnyType> value) {
        map.put(key, value);
    }
}
