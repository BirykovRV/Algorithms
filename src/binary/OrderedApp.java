package binary;

import java.util.Random;

public class OrderedApp {
    public static void main(String[] args) {
        Random random = new Random();
        OrderArray a = new OrderArray(random.nextInt(10));
        OrderArray b = new OrderArray(random.nextInt(10));

        for (int i = 0; i < a.getA().length; i++) {
            a.insert(random.nextInt(100));
        }
        for (int i = 0; i < b.getA().length; i++) {
            b.insert(random.nextInt(100));
        }

        int[] result = a.merge(b);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
