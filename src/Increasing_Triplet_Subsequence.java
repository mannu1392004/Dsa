public class Increasing_Triplet_Subsequence {
    public static void main(String [] args){
        int arr []= {5,4,3,2,1};
        System.out.println(increasingTriplet(arr));

    }
    public static boolean increasingTriplet(int[] nums) {
int i = Integer.MAX_VALUE;
int j = Integer.MAX_VALUE;

for (int num:nums){
    if (num<=i){
        i = num;
    } else if (num<=j) {
        j = num;

    }
    else {
        return true;
    }

}



        return false;
    }

}
