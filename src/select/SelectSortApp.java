package select;

public class SelectSortApp {
    public static void main(String[] args) {
        ArraySel sel = new ArraySel(10);

        sel.insert(77);
        sel.insert(66);
        sel.insert(44);
        sel.insert(55);
        sel.insert(00);
        sel.insert(22);
        sel.insert(11);
        sel.insert(33);

        sel.display();
        System.out.println();
        sel.selectionSort();
        sel.display();
    }
}
