class node{
    int data;
    node prev;
    node next;
    node(int data){
        this.data=data;
        prev=null;
        next=null;
    }
}
      public class DoublyLinkedlist{
    
    static node head;
    void insert(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        }
        void deleteEnd(){
            if(head==null){
                System.out.println("List is empty");
                return;
                
            }
            if(head.next==null){
                head=null;
                return;
            }
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.prev.next=null;
        }
        void displayForward(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"");
                temp=temp.next;
            }
        }
        void displayBackward(){
            if(head==null)return;
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            while(temp.prev!=null)
            {
                System.out.print(temp.data+"->");
            temp=temp.prev;
            }
        }
        public static void main(String[]args){
            DoublyLinkedlist list=new DoublyLinkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Forward:");
        list.displayForward();
        list.deleteEnd();
        System.out.println();
          System.out.println("Delete at end");
          list.displayForward();
        }
}
