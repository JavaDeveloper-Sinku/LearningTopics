package Learing;

public class LL {
    Node head;

    static class Node{
        String data;
        Node next;

        //Constrester
        Node (String data){
            this.data=data;
            this.next=null;

        }
    }

    //Adding first
    public void  addfirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Adding last
    public void addlast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next= newNode;

    }
    //Printing
    public void print(){
        Node curNode = head;
        while (curNode.next != null){
            System.out.println(curNode.data + " -> ");
            curNode = curNode.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LL list= new LL();
        list.addfirst("aa");
        list.addfirst("bb");
        list.addfirst("33");

        list.print();





    }
}
