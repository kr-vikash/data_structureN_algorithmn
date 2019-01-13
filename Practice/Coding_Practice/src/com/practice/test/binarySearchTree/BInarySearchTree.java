package com.practice.test.binarySearchTree;

public class BInarySearchTree {

    Node root=null;

    void insert(int d){
        root=insertDataToBST(root,d);
    }

    Node insertDataToBST(Node root, int data){

        if(root==null){
            root=new Node(data);
            return root;
        }
        if (data<root.data){
            root.left=insertDataToBST(root.left,data);
        }else if (data>root.data)
        root.right=insertDataToBST(root.right,data);

        return root;
    }

    void inOrderTraversal(){
        printInOrder(root);
    }
    void preOderTraversal(){
        printpreOderTraversal(root);
    }
    void postOrderTraversal(){
        printpostOrderTraversal(root);
    }

    void printInOrder(Node node){
        if (node!=null) {
            printInOrder(node.left);
            System.out.print(node.data +" ");
            printInOrder(node.right);

        }
        //System.out.println("");
    }
    void printpreOderTraversal(Node node){

        if(node!=null){
            System.out.print(node.data + " ");
            printpreOderTraversal(node.left);
            printpreOderTraversal(node.right);
        }
        System.out.println("");

    }
    void printpostOrderTraversal(Node node){
        if(node!=null){
            printpostOrderTraversal(node.left);
            printpostOrderTraversal(node.right);
            System.out.print(node.data + " ");

        }

    }
    Node indexOfSearchData(int d){
       return searchData(root, d);
    }
    Node searchData(Node node, int x){

        if(node==null || node.data==x)
            return node;
        if(x<node.data)
            return searchData(node.left,x);
        else{
            return searchData(node.right,x);
        }
    }

    public static void main(String[] args) {
        BInarySearchTree bInarySearchTress=new BInarySearchTree();
        bInarySearchTress.insert(8);
        bInarySearchTress.insert(3);
        bInarySearchTress.insert(11);
        bInarySearchTress.insert(9);
        bInarySearchTress.insert(15);
        bInarySearchTress.insert(4);
        bInarySearchTress.insert(1);

        bInarySearchTress.printpostOrderTraversal(bInarySearchTress.root);

        Node node=bInarySearchTress.indexOfSearchData(15);
        if(node!=null)
        System.out.println(node);
        else{
            System.out.println("Not found");
        }
    }
}
