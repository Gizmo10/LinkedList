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

    public Node partition(int k){

        Node rightPartition = new Node();
        Node leftPartition = new Node();
        Node current = this;

        while(current.next != null){

            if(current.next.data < k){

                leftPartition.appendToEnd(current.next.data);
            }else{

                rightPartition.appendToEnd(current.next.data);
            }

            current = current.next;
        }

        current = leftPartition;

        while(current.next != null){

            current  = current.next;
        }

        current.next = rightPartition;

        return leftPartition;

    }

    public Node sumLists(Node list2){

        Node list1 = this;
        Node answer = new Node();
        int remainder = 0;
        int carry = 0;

        while(list1.next != null || list2.next != null){

            if(list1.next != null && list2.next != null){

                int sum = carry + list1.next.data + list2.next.data;
                remainder = sum % 10;
                carry = sum / 10;

                answer.appendToEnd(remainder);

                list1 = list1.next;
                list2 = list2.next;

            }else if(list1.next != null){

                int sum = carry + list1.next.data;
                remainder = sum % 10;
                carry = sum / 10;

                answer.appendToEnd(remainder);
                list1 = list1.next;

            }else if(list2.next != null){

                int sum = carry + list2.next.data;
                remainder = sum % 10;
                carry = sum / 10;

                answer.appendToEnd(remainder);
                list2 = list2.next;
            }
        }

        return answer;
    }
}
