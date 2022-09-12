import java.util.Scanner;

public class FindANodeInaLinkedList {
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
    public static int findNode(Node<Integer> head,int target){
        int index=0;
        Node<Integer> temp=head;
        while(temp!=null){
            if(temp.data==target) return index;
            temp=temp.next;
            index++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-- >0){
            Node<Integer> head=takeInput();
            int target=sc.nextInt();
            System.out.println(findNode(head,target));
        }
    }
}
