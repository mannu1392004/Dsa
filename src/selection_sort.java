public class selection_sort {
    public static void main(String[] args){
        int[] arr = {7,3,5,1,5};
        for (int i = 0;i<arr.length-1;i++){
         int min =i;
            for (int j = i;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] =arr[min];
            arr[min]=temp;
        }
   for (int i = 0;i<arr.length;i++){
       System.out.println(arr[i]);
   }
    }
}
