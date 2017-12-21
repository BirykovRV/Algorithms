package bubble;

public class ArrayBub {
    private long[] a;       // Ссылка на массив а
    private int nElems;     // Количество элементов данных

    public ArrayBub(int max){
        this.a = new long[max];     // Создание массива
        nElems = 0;                 // Пока нет ни одного элемента
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

    public void bubbleSort(){
        for (int i = nElems; i > 0; i--) {
            for (int j = 0; j < nElems; j++) {
                if (a[j] > a[j+1]){
                    long temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
