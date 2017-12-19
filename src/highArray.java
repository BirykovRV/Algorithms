public class highArray {
    //Ссылка на массив а
    private int[] a;
    // Количество элементов в массиве
    private int nElems;

    public highArray(int max) {
        this.a = new int[max];
        this.nElems = 0;
    }

    public int getMax(){
        // TODO: 18.12.2017 Реализовать метод поиска максимума в массиве
        int maxNum = 1;
        if (a.length > 0){
            // Поиск максимума, сложность O(N)
            for (int i = 0; i < a.length; i++) {
                if (a[i] > maxNum){
                    maxNum = a[i];
                }
            }
        }
        else {
            maxNum = -1;
        }
        return maxNum;
    }

    public int removeMax(){
        // TODO: 18.12.2017 Потом заменить getMax на этот метод
        // TODO: 18.12.2017 Поиск не только максимума но и удаление его из массива с уменьшением последнего
        return 0;
    }

    /**
     * Поиск заданного значения
     * @param searchKey какое значение найти
     * @return если совпабение найдено true
     */
    public boolean find(long searchKey){
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
    public boolean delete(long value){
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
            System.out.println(a[i]);
        }
    }
}

