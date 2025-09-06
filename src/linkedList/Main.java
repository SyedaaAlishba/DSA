package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.addFirst("Alishba");
        linkedList.addFirst("name");
        linkedList.printList();
        linkedList.addFirst("My");
        linkedList.printList();
        System.out.println(linkedList.getSize());
        linkedList.deleteFirst();
        linkedList.printList();
        linkedList.deleteLast();
        linkedList.printList();
        System.out.println(linkedList.getSize());
    }
}