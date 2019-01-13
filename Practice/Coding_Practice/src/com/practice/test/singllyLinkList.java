package com.practice.test;


public class singllyLinkList{

    Node head;
    public void pushlist(int d){
        Node newNode=new Node(d);
        newNode.next=head;
        head=newNode;
    }
    public void print(){
        Node node=head;
        while (node!=null){
            System.out.print(node.data+ " ");
            node=node.next;
        }
        System.out.println();
    }
    public void print(Node node){
        //Node node=;
        while (node!=null){
            System.out.print(node.data + " " );
            node=node.next;
        }
    }

    public static void main(String[] args) {
        Node head;
        singllyLinkList list= new singllyLinkList();
        list.pushlist(1);
        list.pushlist(4);
        list.pushlist(6);
        list.pushlist(1);
        list.pushlist(1);
       // list.pushlist(10);
        //list.print();

        Node curr, prev, nextnode;
        prev=null;
        nextnode=null;
        curr=list.head;
        while (curr!=null){
            nextnode =curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        while(curr!=null){
            nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        list.print(prev);
        System.out.println();
        list.print(list.head);

        curr=list.head;
        int flag=1;

        while(curr!=null){
            if(curr.data==prev.data){
                curr=curr.next;
                prev=prev.next;
            }else{
                flag=0;
                break;
                //System.out.println(0);;
            }
        }
       // System.out.println(flag);
        //list.print(list.head);

    }

}
