public class practice {
    public static int minOperations(String s) {
int x = Integer.parseInt(s);
int arr[] = new int[s.length()];
int i = arr.length-1;
while (x!=0){
    arr[i]= x%10;
    x= x/10;
    i--;
    System.out.println(x);
}
int arr1 []= new int [arr.length];
arr1[0] = arr[0];
        int arr2 []= new int [arr.length];
        if (arr1[0]==1){
            arr2[0]=0;
        }
        else {
            arr2[0]=1;
        }
for (int m =1;m<arr1.length;m++){
    if (arr1[m-1]==1){
        arr1[m]=0;
    }
    else {
        arr1[m]=1;
    }
}
        for (int m =1;m<arr1.length;m++){
            if (arr2[m-1]==1){
                arr2[m]=0;
            }
            else {
                arr2[m]=1;
            }
        }
int count = 0;
        int min =0;
for (int v = 0;v<arr1.length;v++){
    if (arr1[v]!=arr[v]){
        count++;
    }
    if (arr2[v]!=arr[v]){
        min++;
    }
}

return Integer.min(count,min);
    }
    public static void main(String[] args){
        String a ="110010";
        System.out.println( minOperations(a));
    }
}
