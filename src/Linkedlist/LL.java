package Linkedlist;

public class LL {
    Node head;
    Node curNode;


    //Creating Node class in  single LL
    //inside node there is two parts, data and next node address colum that calling next
    //creating Node class args Constructor
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }


    //adding element in first//
    void addfist(int data){
       Node newNode = new Node(data);

        if (head == null){
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last node value
    void addlast(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }
        curNode = head;

        while (curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;

    }

    //Display whole LL
    void display(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        curNode = head;
        while (curNode.next != null){
            System.out.println(curNode.data +"-->");
            curNode = curNode.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addfist(1);
        list.addfist(2);
        list.addfist(3);
        list.addlast(43);

        list.display();

    }
}
