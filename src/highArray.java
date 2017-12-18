public class highArray {
    //Ссылка на массив а
    private long[] a;
    // Количество элементов в массиве
    private int nElems;

    public highArray(int max) {
        this.a = new long[max];
        this.nElems = 0;
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

    public void insert(int value){
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j;
        for (j=0; j<nElems; j++){
            if (a[j] == value) break;
        }
        if (value == nElems) return false;
        else {
            for (int i = j; i < nElems; i++){
                a[i] = a[i+1];
            }
            nElems--;
            return true;
        }
    }

    public void display(){
        for (int i = 0; i<nElems; i++){
            System.out.println(a[i]);
        }
    }
}
