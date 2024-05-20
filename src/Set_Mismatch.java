import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Set_Mismatch {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
       Arrays.sort(nums);
       int count =1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                value++;
                map.put(nums[i], value);

            } else {
                map.put(nums[i], 1);
            }

        }
        while (count<nums[nums.length]){
            if (!map.containsKey(count)){
                break;
            }
            count++;
        }


        int arr[] = new int[2];
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                arr[0] = e.getKey();
            }

        }
        arr[1]=count;
        return arr;
        }

}