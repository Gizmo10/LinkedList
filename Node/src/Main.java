public class Main {

    public static void main(String[] args) {

        Node list1 = new Node();
        Node list2 = new Node();
        int[] arr = {1,0,6,1};
        int[] arr2 = {5,9,2};

        for (int num : arr) {

            list1.appendToEnd(num);
        }

        for(int num : arr2){

            list2.appendToEnd(num);
        }

      Node temp = list1.sumLists(list2);

        while (temp != null) {

            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}