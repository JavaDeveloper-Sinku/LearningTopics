package A_Own_DSA_Sheet;

import org.w3c.dom.ls.LSException;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val ) {
        this.val = val;
        this.next = null;
    }
    ListNode head;

    public void add(int  val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;

        }else {
            newNode.next= head;
            head = newNode;

        }

    }

    //1. Intesection point of two Linked lists
    public ListNode getIntersectionNode(ListNode headA ,ListNode headB){
        ListNode a = headA , b= headB;
        while ( a != b){
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headB : b.next;

        }
        return a;
    }

    public static void main(String[] args) {




    }
}
