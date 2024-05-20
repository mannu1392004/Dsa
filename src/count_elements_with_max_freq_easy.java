import java.util.Arrays;

public class count_elements_with_max_freq_easy {
    public int maxFrequencyElements(int[] nums) {

        int arr[] = new int[101];
         for (int i : nums){
             arr[i]++;
         }
        Arrays.sort(arr);
         int max = 0;
         for (int i =0;i<=100;i++){
             max = Integer.max(arr[i],max);
         }
         int ans = 0;
         for (int i = 0;i<=100;i++){
             if (arr[i]==max){
                 ans++;
             }
         }

return max*ans;
    }
}
