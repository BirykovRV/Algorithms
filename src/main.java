import java.util.*;

public class main {

    public static void main(String[] args) {
        Random random = new Random();
        highArray array = new highArray(10);
        for (int i = 0; i < 10; i++){
            array.insert(random.nextInt(9));
        }
        array.display();
        System.out.println("###############");
        System.out.println(array.getMax());
    }
}

