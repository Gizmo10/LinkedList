public class Main {

    public static void main(String[] args) {

        Node head = new Node();
        int[] arr = {1,2,2,3,4,5,3,6,6,7,8,7};

        for (int num : arr) {

            head.appendToEnd(num);
        }

      Node temp = head.kthToLast(4);

        while (temp != null) {

            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}