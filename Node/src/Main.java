public class Main {

    public static void main(String [] args){

        Node head = new Node(0);
        int [] arr = {2,2,2,3,4,1,3,4,5,6,6,6};

        for(int num: arr){

            head.appendToEnd(num);
        }

       head = head.removeDuplicates();

        while(head != null){

            System.out.print(head.data);
            head = head.next;
        }

    }
}
