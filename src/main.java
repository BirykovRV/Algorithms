import java.util.*;

public class main {

    public static void main(String[] args) {

        highArray array = new highArray(7);
        int[] sortedArray = new int[7];

        array.insert(98);
        array.insert(1);
        array.insert(9);
        array.insert(2);
        array.insert(4);
        array.insert(65);

        System.out.println("Обычный массив:");
        array.display();
        System.out.println();

        for (int i = sortedArray.length-1; i > 0 ; i--) {
            sortedArray[i] = array.removeMax();
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}

