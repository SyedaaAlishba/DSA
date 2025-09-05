package linkedList;

public class LinkedList {
   Node head;
   private int size;
   // reference to first node
   public LinkedList(){
        this.size=0;
    }
    public class Node {
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next= null;
              size++;
        }
    }
       //add-First
       public void addFirst(String data){
           Node newNode = new Node(data);
            if(head== null){
                head= newNode;
                return;
            }
            newNode.next= head;
            head= newNode;
       }
       //add-Last
        public void addLast(String data){
            Node newNode = new Node(data);
            if(head== null){
                head= newNode;
                return;
            }
            Node currentNode= head;
            while (currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next= newNode;
        }
        //print
        public void printList(){
            if(head== null){
                System.out.println("list is empty");
                return;
            }
            Node currentNode= head;
            while (currentNode!=null){
                System.out.print(currentNode.data +"-->");
                currentNode=currentNode.next;
            }
            System.out.println("Null ");
        }
        //delete first
    public void  deleteFirst(){
        if(head== null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //delete last
    public void  deleteLast(){
        if(head== null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next== null){
            head= null;
            return;
        }

        Node secondLast= head;
        Node lastNode= head.next;
        while (lastNode.next!=null){
            lastNode= lastNode.next;
            secondLast= secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }


}
