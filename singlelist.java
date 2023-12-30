import java.util.Scanner;
import javax.swing.JOptionPane;
public class singlelist {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void ins_end(int x){
        Node node=new Node(x);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }
    public void print(){
        Node curr=head;
        if(curr==null)
            System.out.println("List is empty");
        System.out.println("The List is");
        for(;curr.next!=null;curr=curr.next)
            System.out.println(curr.data+"");
        // System.out.println(curr.data+"");
        JOptionPane.showMessageDialog(null, "The last element is"+curr.data);

    }
    public static void main(String[] args) {
        singlelist sl=new singlelist();
        Scanner scan=new Scanner(System.in);
        // String a=JOptionPane.showInputDialog(scan)
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of elements"));
        int a;
        for(int i=0;i<n;i++){
            a=scan.nextInt();
            sl.ins_end(a);
        }
        sl.print();
    }
}