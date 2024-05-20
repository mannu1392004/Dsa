import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(1);

        //size of set
        System.out.println(set.size());
        // remove
        set.remove(1);

        //iterator
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println((int)it.next());;
        }
    }
}
