public class Node {

    Node next = null;
    int data;

    public Node(){}

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

        while(current != null){

            Node search = current;

            int data = current.data;

            while(search.next != null){

                if(search.next.data == data){

                    search = search.next;
                    head = head.deleteNode(data);
                    current = current.next;
                }else{

                    search = search.next;
                }
            }

            current = current.next;
        }

        return head;
    }

    public Node kthToLast(int k){

        Node current = this;
        Node temp = new Node();
        int indexOfElement = 0;

        while(current != null){

            indexOfElement++;

            if(indexOfElement == k){

                while(current.next != null){

                    temp.appendToEnd(current.data);
                    current = current.next;
                }
            }

            current = current.next;
        }

        return temp;
    }
}
