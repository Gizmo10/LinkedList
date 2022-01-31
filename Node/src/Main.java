public class Main {

    public static void main(String[] args) {

        Node head = new Node();
        int[] arr = {1,4,5,2,7,3,6,8,4,9};

        for (int num : arr) {

            head.appendToEnd(num);
        }

      Node temp = head.partition(5);

        while (temp != null) {

            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}