public class stack {
   node head;
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            next = null;
        }
    }
     void push(int data){
       node newnode = new node(data);
        if (head == null){
            head = newnode;
        }
        newnode.next = head;
        head = newnode;
    }
    public int pop(){
int top = head.data;
        head =head.next;
        return top;
    }
    public void peek(){
        System.out.println(head.data);
    }

}
