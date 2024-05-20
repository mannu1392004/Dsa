public class insertion {
    public static void main(String[] args){
        int arr[] = {9,4,6,1,8,3};
       for (int i = 1;i<arr.length;i++){
           int curr = arr[i];
           int j = i-1;
           while (j>=0&&arr[j]>curr){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1] = curr;
       }
    }
}
