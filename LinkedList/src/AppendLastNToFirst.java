import java.util.Scanner;

public class AppendLastNToFirst {
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
    public static void print(Node<Integer> head){
        while (head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head,int n){
        int length=countNodes(head);
        if (length != n && n < length) {

            int skip = length - n;
            Node<Integer> prev = null;
            Node <Integer>curr = head;

            while (skip > 0) {
                prev = curr;
                curr = curr.next;
                skip--;
            }

            prev.next = null;
            Node<Integer> tempHead = head;
            head = curr;
            while (curr.next != null)
                curr = curr.next;
            curr.next = tempHead;
        }
        return head;
    }
    public static int countNodes(Node<Integer> head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=takeInput();
        int lastN=sc.nextInt();
        System.out.println(countNodes(head));
        Node<Integer> ans=appendLastNToFirst(head,lastN);
        print(ans);
    }
}
