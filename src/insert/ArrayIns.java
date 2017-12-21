package insert;

public class ArrayIns {
    private long[] a;
    private int nElems;

    public ArrayIns(int max){
        this.a = new long[max];
        this.nElems = 0;
    }

    public void insert(long value){ // Вставка элемента в массив
        a[nElems] = value;
        nElems++;                   // Увеличение размера
    }

    public void display(){          // Вывод содержимого массива
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void insertionSort(){
        int in, out;

        for (out = 1; out < nElems; out++){         // out - разделительный маркер
            long temp = a[out];                     // Скопировать помеченный элемент
            in = out;                               // Начать перемещение с out
            while (in > 0 && a[in-1] >= temp){      // Пока не найден меньший элемент
                a[in] = a[in-1];                    // Сдвинуть элемент вправо
                --in;                               // Перейти на одну позицию влево
            }
            a[in] = temp;                           // Вставить помеченый элемент
        }
    }
}
