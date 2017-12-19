import java.util.*;

public class main {

    public static void main(String[] args) {

        highArray array = new highArray(10);

        array.insert(98);
        array.insert(1);
        array.insert(9);
        array.insert(2);
        array.insert(4);
        array.insert(65);

        array.display();
        System.out.println();
        System.out.println("###############");
        System.out.println(array.removeMax());
        System.out.println("###############");
        array.display();
    }
}

