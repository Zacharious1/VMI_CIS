import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetAndMap {
    private Set<String> states;
    private Map<Integer, Set<String>> map;
    HashSetAndMap() {
        states = new HashSet<>();
        map = new HashMap<>();
    }

    public void insertInSet(String x) {
        states.add(x);
    }

    public Set<String> getSet() {
        return states;
    }

    public void insertInMap(Integer a, Set<String> value) {
        if (!map.containsKey(a))
            map.put(a, value);
    }

    public Set<Integer> getMapKeys() {
        return map.keySet();
    }

    public Set<String> getMapValue(Integer a) {
        return map.get(a);
    }

    public void printSet() {
        for (String item : states) {
            System.out.print(item + " ");
        }
    }
}