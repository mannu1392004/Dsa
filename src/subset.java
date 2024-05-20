import java.time.LocalTime;

public class subset {
    public static void main(String args[]){
long time = System.nanoTime();
int arr[] ={1,3,4,5,6,7};
int d= 15;
findSubse(arr,d);
long finish = System.nanoTime();
        System.out.println(time +" "+ finish);

    }
    public  static  void findSubse(int arr[],int d){
        for(int i =0;i< arr.length-1;i++){
int x =arr[i];
            for (int j = i+1;j<arr.length;j++){
    x+=arr[j];
    if (x==d){
        System.out.println(i +" "+j);
    }
            }
        }

    }

}
