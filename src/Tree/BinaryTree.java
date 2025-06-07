package Tree;



class Node {
    int data;
    Node left ,right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);

        tree.root = tree.insert(tree.root,50);
        tree.insert(tree.root,30);
        tree.insert(tree.root,40);


        System.out.println("InOrder traversal : ");
        tree.printInorder(tree.root);




    }

    //Root node creating
    Node root;

    //Inorder traveling
     void printInorder(Node node){
        if ( node == null) return;

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    //Node inset method
    Node insert (Node root, int value){
         if (root == null ) return  new Node(value);
         if (value < root.data){
             return root.left = insert(root.left,value);
         }else {
             root.right= insert(root.right,value);
         }
         return root;
    }

}
