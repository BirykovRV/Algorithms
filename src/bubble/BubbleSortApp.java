package bubble;

public class BubbleSortApp {
    public static void main(String[] args) {
        ArrayBub bub = new ArrayBub(10);

        bub.insert(55);
        bub.insert(23);
        bub.insert(43);
        bub.insert(22);
        bub.insert(65);
        bub.insert(11);
        bub.insert(32);
        bub.insert(12);

        bub.display();
        System.out.println();

        bub.bubbleSort();

        bub.display();
    }
}
