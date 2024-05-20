public class queues_using_array {
    static class queues{
      static   int arr[];
      static   int size;
      static int rear = -1;
       queues(int size){
           arr = new int[size];
           this.size = size;
       }
public static void add(int data){
           if (rear==size-1){
               System.out.println("queue is full");
               return;
           }
           rear++;
           arr[rear]=data;
}
public static void delete(){
           if (rear == -1){
               System.out.println("queue is empty");
           }
           for (int i = 0;i<rear;i++){
               arr[i]= arr[i+1];
           }
           rear--;
}
    }
}
