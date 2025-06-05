package Linkedlist;

public class Linklist {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
//Printing List method
    public static void printList(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
  //String first position adding value
    public static Node InsertAtBeginning(Node head, int newData){
        Node newNode = new Node(newData);
        newNode.next =head;
        return newNode;
    }

    //Ending position adding value
    public static Node InsertEnd(Node head , int newData){
        Node newNode = new Node(newData);

        if (head == null){
            return newNode;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return  head;
    }
//Inserting AT position giving in Q.
    public static Node InsertAtPosition(Node head , int data, int pos){
        Node newNode = new Node(data);

        if (pos == 1){
            newNode.next= head;
            return newNode;
        }
        Node current = head;
        int count = 1;

        while (current != null && count < pos - 1){
            current = current.next;
            count++;
        }
        if (current == null){
            System.out.println("Invalid position.");
            return head;

        }
        newNode.next =current.next;
        current.next = newNode;
        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);

        printList(head);

        head= InsertAtBeginning(head , 100);
        printList(head);

        head = InsertEnd(head ,23);
        printList(head);

        head = InsertAtPosition(head ,40,3);
        printList(head);

    }
}
