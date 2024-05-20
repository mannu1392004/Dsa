import java.util.Arrays;

class experiment{
    public static void main(String[] args){


        int[] arr ={3,16,8,4,2};
        System.out.println(canSortArray(arr));


    }
    public static boolean canSortArray(int[] nums) {
   int [] bits = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            int n = 16;
            int count = 0;
            while (n > 0) {
                count += n & 1;
                n >>= 1;
            }
            System.out.println(count);
            bits[i]= count;
        }
        //sort


int uns[]= nums;
        for (int i = 0;i<nums.length-1;i++){
            for (int j = 0;j<nums.length-1;j++){
                if (nums[j]>nums[j+1] && bits[j]==bits[j+1] ){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }
Arrays.sort(uns);
        for (int i = 0;i<uns.length;i++){
            if (nums[i]!=uns[i]){
                return false;
            }

        }


return true;
    }


}