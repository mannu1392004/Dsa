public class doublelinklist {
    node head;
    class node{
        String data;
        node next;
        node previous;

        node(String data){
            this.data = data;
            next = null;
previous = null;
        }

    }
public void addfirst(String data){
    node newnode = new node(data);
    if (head ==null){
     head = newnode;
        }
    newnode.next=head;
    head.previous=newnode;
    head = newnode;

}
public void addlast(String data){
        node newnode = new node(data);
    if (head ==null){
        head = newnode;
    }
    node last = head;
    while (last.next!=null){
        last = last.next;
    }
    newnode.previous=last;
    last.next=newnode;
}

public static void main(String [] args){
        doublelinklist list = new doublelinklist();
        list.addfirst("6");
        list.addfirst("8");
        list.addfirst("10");
        list.addlast("09");

}

}
