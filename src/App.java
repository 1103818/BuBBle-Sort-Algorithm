public class App {
    public static void main(String[] args) throws Exception {
        BubbleSort b1 = new BubbleSort();
        b1.insert(2);
        b1.insert(5);
        b1.insert(3);
        b1.insert(4);
        b1.insert(1);
        System.out.println("Before sorting the array\n");
        b1.treverse();
        System.out.println("after sorting the array");
        b1.BubbleSortM();
        b1.treverse();
    }
}
