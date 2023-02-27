import java.util.*;
public class LinkList {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        } 

    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    // add first to the linklist
    public void addFirst(int data){

        // 1 create new node
        Node newnode = new Node(data);
        size++;

        if(head==null){
            head=tail=newnode;
            return;
        }

        //2 newnode ka next = head
        newnode.next=head;

        //3 set newnode= head
        head=newnode;
    }
    // add last to the link list
    public void addLast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    // printing the value from the link list
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //add at the middle of the link list
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    // remove at the first of linkList
    public void removeFirst(){
        if(size==0){
            System.out.println("LinkList is empty ");
            return;
        }
        else if(size==1){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        size--;
    }


    // remove at the last of the linkList
    public void removeLast(){
        if(size==0){
            System.out.println("LinkList is empty ");
            return;
        }
        else if(size==1){
            removeFirst();
            return;
        }

        int i=0;
        Node temp=head;
        while(i<size-2){
            temp=temp.next;
            i++;
        }
        tail=temp;
        tail.next=null;
        size--;

    }

    // searching an element in the LinkList

    public void search(int s){
        Node temp=head;
        for(int i=0;i<size-1;i++){

            if(temp.data==s){
                System.out.println("element found at index : "+i);
                return;
            }
            temp=temp.next;
        }

        System.out.println("element not found in our LinkList : ");
    }

    // recurssive searching an element in the LinkList
    public int recsearch(Node temp ,int search){
        if(temp==null){
            System.out.println("element not found");
            return -1;
        }
        if(temp.data==search){
            System.out.println("element found ");
            return 0;
        }
        int idx=recsearch(temp.next,search);
        if(idx==-1){
            return -1;
        }
        return idx=idx+1;

    }
    // reverse of the LinkList
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void removeMiddle(int idx){
        if(idx>=size){
            System.out.println("max index is : "+(size-1));
            return;
        }
        if(size==0){
            System.out.println("linkList is empty ");
            return;
        }
        else if(idx==0){
            removeFirst();
            return;
        }
        Node temp=head;
        Node tempd=temp.next;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
            tempd=tempd.next;
        }
        temp.next=tempd.next;
        tempd.next=null;
        size--;
    }
    public Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    public boolean palandrome(){
        
        Node prev=null;
        Node curr=middle(head);
        Node next;
        Node left=head;
        while(curr.next!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=curr;

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;
    }

    
    public static void main(String args[]){

        LinkList ll=new LinkList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
//System.out.println(ll.palandrome());
        
        ll.print();


    }

}
