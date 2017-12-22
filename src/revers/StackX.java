package revers;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int max) {
        this.maxSize = max;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char j){                   // Размещение элемента на вершине стека
        stackArray[++top] = j;
    }

    public char pop(){
        return stackArray[top--];               // Извлечение элемента с вершины стека
    }

    public char peek(){                         // Чтение элемента с вершины стека
        return stackArray[top];
    }

    public boolean isEmpty(){                   // True, если стек пуст
        return top == -1;
    }
}
