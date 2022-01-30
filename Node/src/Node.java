public class Node {

    Node next = null;
    int data;

    public Node(int d){

        data = d;
    }

    public void appendToEnd(int d){

        Node n = this;
        Node end = new Node(d);

        while(n.next != null){

            n = n.next;
        }

        n.next = end;
    }

    public Node deleteNode(Node head,int data){

        Node n = head;

        if(n.data == data){

            return head.next;
        }

        while(n.next != null){

            if(n.next.data == data){

                n.next = n.next.next;
                return head;
            }

            n = n.next;
        }

        return head;

    }
}
