//help received: none
import java.util.ArrayList;

public class DoubleEndedPQ <AnyType extends Comparable>{

    private ArrayList<AnyType> list;
    private int min;
    private int max;

    public int findMin() { //Running time is O(1), because it is returning the instance variable min
        return min;
    } //O(1), because it is returning the instance variable min
    public int findMax(){//Running time is O(1), because it is returning the instance variable max
        return max;
    }
    public void insert(AnyType a) {     //the running time is O(1) because it is adding to an array list at a specified index
        if (a.compareTo(list.get(max)) > 0){
            list.add(a);
            max = list.indexOf(a);
        }
        if (a.compareTo(list.get(min)) < 0){
            list.add(a);
            min = list.indexOf(a);
        } else list.add(a);
    }

    public void deleteMin() { // Running time is O(N) because it is removing a value that may be at the front, requiring the elements to be shifted down
        if (list.size() != 0) list.remove(list.get(min));
    }
    public void deleteMax() { // Running time is O(N) because it is removing a value that may be at the front, requiring the elements to be shifted down
        if (list.size() != 0) list.remove(list.get(max));
    }
}
