package day2;

public class SortColors {

        public static void sortColors(int[] nums) {


            int low =0;
            int mid = 0;
            int high = nums.length-1;

            while (mid<high){
                if (nums[mid]==0){
                    int local = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = local;
                    low++;
                    mid++;
                } else if (nums[mid]==1){
                    mid++;
                }
                else if (nums[mid]==2){
                    int local = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = local;
                    high--;
                }
            }


        }

}
