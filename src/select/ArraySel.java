package select;

public class ArraySel {
    private long[] a;                   // Ссылка на массив
    private int nElems;                 // Колличество элементов в массиве

    public ArraySel(int max) {          // Создание массива
        this.a = new long[max];
        this.nElems = 0;
    }

    /**
     * Вставка элемента в массив
     * @param value значение типа long
     */
    public void insert(long value){     // Вставка элемента в массив
        a[nElems] = value;
        nElems++;
    }

    /**
     * Вывод содержимого массива
     */
    public void display() {             // Вывод содержимово массива
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
    }

    /**
     * Метод для сортировки выбором
     */
    public void selectionSort(){                        // Сортировка методом выбора
        int in, out, min;
        for (out = 0; out < nElems-1; out++){           // Внешний цикл
            min = out;                                  // Минимум
            for (in = out+1; in < nElems; in++){        // Внутренний цикл
                if (a[in] < a[min]){                    // Если значение min больше
                    min = in;                           // значит, найден новый минимум
                }
            }
            long temp = a[out];                     // Поменять местами
            a[out] = a[min];
            a[min] = temp;
        }
    }
}
