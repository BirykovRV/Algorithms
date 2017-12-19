public class highArray {
    //Ссылка на массив а
    private int[] a;
    // Количество элементов в массиве
    private int nElems;

    public highArray(int max) {
        this.a = new int[max];
        this.nElems = 0;
    }

    public int[] getA() {
        return a;
    }

    /**
     * Поиск максимума с удалением его из списка
     * @return -1 если массив пустой
     */
    public int removeMax(){

        int maxNum = 1;
        int j;
                                                    // Массив пустой ?
        if (nElems > 0){                            // Нет
            for (int i = 0; i < nElems; i++) {      // Проходим по массиву
                if (a[i] > maxNum){                 // Текущее значение массива больше?
                    maxNum = a[i];                  // Да, записываем.
                }
            }
            for (j = 0; j < nElems; j++){
                if (a[j]==maxNum) break;            // Запоминаем положение курсора на максимальном значении
            }
            for (int k = j; k<nElems; k++){
                a[k] = a[k+1];                      // Перезаписываем ячейку с макс k на k+1 значение
            }
            nElems--;                               // и уменьшаем массив
        }
        else {                                      // Да
            maxNum = -1;
        }
        return maxNum;
    }

    /**
     * Поиск заданного значения
     * @param searchKey какое значение найти
     * @return если совпабение найдено true
     */
    public boolean find(int searchKey){
        int j;
        for (j=0; j<nElems; j++){
            if (a[j] == searchKey) break;
        }
        if (j == nElems) return false;
        else return true;
    }

    /**
     * Вставка элемента в массив
     * @param value значение которое надо вставить
     */
    public void insert(int value){
        a[nElems] = value;
        // увеличение массива
        nElems++;
    }

    /**
     * Удалить 1 элемент в массиве
     * @param value какой элемент удалить
     * @return если удален, то true
     */
    public boolean delete(int value){
        int j;
        for (j=0; j<nElems; j++){
            if (a[j] == value) break;           // найдено совпадение
        }
        if (value == nElems) return false;      // Достигнут последний элемент массива
        else {                                  // Уменьшение массива
            for (int i = j; i < nElems; i++){
                a[i] = a[i+1];
            }
            nElems--;
            return true;
        }
    }

    /**
     * Вывод массива
     */
    public void display(){
        for (int i = 0; i<nElems; i++){
            System.out.print(a[i] + " ");
        }
    }
}

