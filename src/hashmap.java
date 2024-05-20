import java.util.HashMap;

public class hashmap {
    public static void main(String[] args){
        int arr[]= {1,2,3,4,3,2,1,3,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val :arr){
            if (map.containsKey(val)){
                int value = map.get(val);
                value++;
                map.put(val,value); }
            else {
                map.put(val,1);
            }

        }
        System.out.println(map);

    }
}
