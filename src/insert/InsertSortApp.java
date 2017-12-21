package insert;

public class InsertSortApp {
    public static void main(String[] args) {
        ArrayIns ins = new ArrayIns(10);

        ins.insert(22);
        ins.insert(44);
        ins.insert(55);
        ins.insert(11);
        ins.insert(66);
        ins.insert(99);
        ins.insert(00);
        ins.insert(77);
        ins.insert(88);

        ins.display();
        System.out.println();

        ins.insertionSort();
        ins.display();
    }
}
