package revers;

public class Reverser {
    private String input;                   // Входная строка
    private String output;                  // Выходная строка

    public Reverser(String in) {
        this.input = in;
    }

    public String doRev(){                      // Перестановка символов
        int stackSize = input.length();         // Определение размера стека
        StackX stack = new StackX(stackSize);   // Создание стека

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);          // Чтение символа из входного потока
            stack.push(ch);                     // Занесение в стек
        }
        output = "";
        while (!stack.isEmpty()){
            char ch = stack.pop();
            output = output + ch;
        }
        return output;
    }
}
