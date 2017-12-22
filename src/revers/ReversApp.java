package revers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true){
            System.out.println("Введите слово:");
            System.out.flush();
            input = getString();                            // Чтение строки с клавиатуры
            if (input.equals("")){                          // Завершение, если [Enter]
                break;
            }

            Reverser reverser = new Reverser(input);        // Создание объекта Reverser
            output = reverser.doRev();
            System.out.println("Наоборот: " + output);
        }
    }

    public static String getString() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }
}
