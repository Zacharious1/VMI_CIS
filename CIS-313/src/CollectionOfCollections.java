import java.util.*;
public class CollectionOfCollections {
    public static int count(Collection<Collection<String>> c, String str) {
        int counter = 0;
        for(Collection<String> ds : c)
            for(String s : ds)
                if (s.equals(str))
                    counter++;
        return counter;
    }

    public static void main(String[] args) {
        ArrayList<Collection<String>> ml = new ArrayList<>();
        Stack<String> sta = new Stack<>();
        ArrayList<String> alist = new ArrayList<>();
        LinkedList<String> link= new LinkedList<>();
        Queue<String> q = new LinkedList<>();
        PriorityQueue<String> pq = new PriorityQueue<>();
        alist.add("Adam");
        alist.add("Sam");
        alist.add("Zach");

        link.add("Adam");
        link.add("Sam");
        link.add("Zach");

        sta.add("Adam");
        sta.add("Sam");
        sta.add("Zach");

        q.add("Adam");
        q.add("Sam");
        q.add("Zach");

        pq.add("Adam");
        pq.add("Sam");
        pq.add("Zach");

        ml.add(alist);
        ml.add(link);
        ml.add(sta);
        ml.add(q);
        ml.add(pq);

        System.out.println(count(ml, "Adam"));
    }
}
