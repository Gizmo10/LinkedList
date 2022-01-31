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

    public Node deleteNode(int data){

        Node n = this;

        if(n.data == data){

            return this.next;
        }

        while(n.next != null){

            if(n.next.data == data){

                n.next = n.next.next;
                return this;
            }

            n = n.next;
        }

        return this;
    }

    public Node removeDuplicates(){

        Node head = this;
        Node current = this;

        while(current.next != null){

            Node search = current.next;

            int data = current.data;

            while(search != null){

                if(search.data == data){

                    search = search.next;
                    head = head.deleteNode(data);
                }else{

                    search = search.next;
                }
            }

            current = current.next;
        }

        return head;
    }
}
