import java.util.Scanner;

public class LinkedListUse {

    public static Node<Integer> takeInput(){
        Node<Integer> head=null;
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();

        while(data!=-1){
            Node<Integer> newNode=new Node<>(data);
            if(head==null){
                head=newNode;
            }
            else{
                Node<Integer> temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> insertAtPosition(Node<Integer> head,int pos,int data){
        Node<Integer> newNode=new Node<>(data);
        if(pos==0){
            newNode.next=head;
            return newNode;
        }
        int i=0;
        Node<Integer> temp=head;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    public static void delete(Node<Integer> head,int pos){
        int i=0;
        Node<Integer> temp=head;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
    }
    public static void print(Node<Integer> head){
        while (head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        print(head);
        head=insertAtPosition(head,0,80);
        print(head);
        delete(head,2);
        print(head);
    }
}
