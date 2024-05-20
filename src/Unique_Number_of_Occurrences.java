import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Unique_Number_of_Occurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int val :arr){
            if(map.containsKey(val)){
                int value = map.get(val);
                value++;
                map.put(val,value);
            }
            else{
                map.put(val,1);
            }
        }
        HashSet<Integer>set = new HashSet<>();
        for(Map.Entry<Integer,Integer>e:map.entrySet())  {
            if(set.contains(e.getValue())){
                return false;
            }
            else{
                set.add(e.getValue());
            }}
        return true;}

}
