package Tree;

import java.util.Scanner;

public class bt {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = createTree();

        System.out.println(root.value);
    }
    static class Node{
        int value;
        Node left,right;

        Node(int value){
            this.value = value;

        }
    }
    //creating tree
    static Node createTree(){
        Node root = null;
        System.out.println("Enter value :");
        int value = sc.nextInt();

        if (value == -1) return  null;
        root = new Node(value);

        System.out.println("Enter left for "+ value);
        root.left = createTree();

        System.out.println("Enter right for "+ value);
        root.right = createTree();

        return root;
    }




}
