public class linklist {
    node head;
   public class node{
        String data;
        node next;

        node(String data){
            this.data = data;
            next = null;
        }
    }
public void addfirst(String data){
   node newnode =new node(data);
        if (head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
}
public void addlast(String data){
    node newnode =new node(data);
       if (head == null){
           head = newnode;
           return;
       }
       node current = head;
       while (current.next!=null){
           current =current.next;
       }
       current.next = newnode;
}
public  void deletelast (){
       if (head == null){
           System.out.println("list is empty");
           return;
       }
       if (head.next==null){
           head = null;
           return;
       }
       node secondlast =head;
       node last = head.next;
       while (last.next!=null){
           secondlast = secondlast.next;
           last = last.next;
       }
       secondlast.next=null;
}
public void deletefirst(){
       if (head ==null){
           System.out.println("list is empty");

       } head=head.next;
}
public void print(){
      if (head==null){
          System.out.println("list is empty");
     return;
      }

       node curr = head;
       while(curr!=null){
           System.out.println(curr.data);
           curr= curr.next;
       }
}

    public static void main(String[] args){
        linklist ll = new linklist();
   ll.addfirst("22");
   ll.addlast("p2");
   ll.addlast("jjjh");
ll.deletefirst();
   ll.print();
   }

}
