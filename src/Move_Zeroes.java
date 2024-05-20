import java.util.ArrayList;
import java.util.Arrays;

public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>arr = new ArrayList<>();
        for (int i = 0;i<nums.length;i++){
            if (nums[i]!=0){
                arr.add(nums[i]);
            }
        }
        int zeroes = nums.length - arr.size();
        for (int i =0;i<nums.length;i++){
            if (i<arr.size()){
                nums[i]=arr.get(i);
            }
            else {
                nums[i]=0;
            }
        }

    }

}
