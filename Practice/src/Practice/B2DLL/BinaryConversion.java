package Practice.B2DLL;


class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class BinaryConversion {
    Node root;
    Node head;

    void B2DLL(Node root){

        if(root==null){
            return;
        }
        B2DLL(root.right);
        root.right=head;
        if(head!=null){
            head.left=root;
        }
        head=root;
        B2DLL(root.left);
    }
    void print(){
        Node tmp=head;
        while(head.right!=null){
            head=head.right;
            System.out.println(head.data);
        }
    }

    public static void main(String[] args) {
        BinaryConversion binaryConversion=new BinaryConversion();
        binaryConversion.root=new Node(4);
        binaryConversion.root.left=new Node(3);
        binaryConversion.root.right=new Node(5);
        binaryConversion.root.right.left=new Node(6);
        binaryConversion.root.right.right=new Node(7);
        binaryConversion.root.left.left=new Node(8);
        binaryConversion.root.left.right=new Node(9);
        binaryConversion.B2DLL(binaryConversion.root);
        binaryConversion.print();
    }
}
