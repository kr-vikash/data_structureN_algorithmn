package com.practice.test.doubally;

import java.util.LinkedList;

public class DouballyLinkList {
    Node head;

    public void pushList(int x){
        Node newNode=new Node(x);
        newNode.next=head;
        if (head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }
    public void print(){
        Node node=head;
        while(node!=null){
            System.out.print(node.data + " ");

            node=node.next;
        }
        System.out.println(" ");

    }
    public void reverse(){
        Node currentNode;
        Node temp=null;
        currentNode=head;
        while (currentNode!=null){
            temp=currentNode.prev;
            currentNode.prev=currentNode.next;
            currentNode.next=temp;
            currentNode=currentNode.prev;
        }
        if (temp!=null){
            head=temp.prev;
        }
    }

    public static void main(String[] args) {
        DouballyLinkList dl=new DouballyLinkList();
        LinkedList linkedList;
        dl.pushList(2);
        dl.pushList(3);
        dl.pushList(5);
        dl.print();
        dl.reverse();
        dl.print();
    }
}
