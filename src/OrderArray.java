public class OrderArray {

    private int[] a;
    private int nElems;

    public OrderArray(int max) {
        this.a = new int[max];
        this.nElems = 0;
    }

    public int[] getA(){
        return a;
    }

    public int size(){
        return nElems;
    }

    /**
     * Бинарный(двоичный) поиск значения, только в упорядоченном массиве, сложность O(logN)
     * @param searchNumber какое число найти
     * @return возвращает индекс найденного элемента или общее число элементов, если не найден элемент
     */
    public int find(int searchNumber){

        int lowerBound = 0;         // нижняя граница массива
        int upperBound = nElems-1;// верхняя граница массива
        int curIn;                  // положение курсора
        while (true) {
            curIn = (lowerBound + upperBound) / 2;  // текущее положение курсора
            if (a[curIn] == searchNumber) {         // число найдено?
                return curIn;                       // да, возвращаем индекс
            }
            else if (lowerBound > upperBound) {     // нет, возсращаем общее число элементов
                return nElems;
            }
            else                                    // иначе меняем границы, в зависимости от величины искомого значения
            {
                if (searchNumber < a[curIn]) {
                    upperBound = curIn - 1;

                }
                else {
                    lowerBound = curIn + 1;
                }
            }
        }
    }

    /**
     * Вставка элемента в массив
     * @param value Число которое вставить
     */
    public void insert(int value){
        int j;
        for (j = 0; j < nElems; j++){       // Линейный поиск
            if (a[j] > value) break;
        }
        for (int k = nElems; k > j; k--) {  // Перемещение последующих элементов
            a[k] = a[k-1];
        }
        a[j] = value;
        nElems++;
    }

    /**
     * Удаление из массива
     * @param value какой элемент
     * @return true если удалили
     */
    public boolean delete(int value){
        int j = find(value);                // Бинарный поиск
        if (j == nElems) return false;      // Найти не удалось
        else{
            for (int k = j; k < nElems; k++){
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }

    public int[] merge(OrderArray b){
        int length = a.length + b.size();   // Общий размер 2х массивов
        int[] temp = new int[length];       // Временный массив
        int i = 0;                          // Курсор для массива a
        int j = 0;                          // Курсор для массива b
        for (int k = 0; k < length; k++){

            if (i == a.length){             // Дошли до конца массива а?
                temp[k] = b.getA()[j++];    // Да, продолжаем перебирать массив b
            }
            else if (j == b.size()){        // Дошли до конца массива b?
                temp[k] = a[i++];           // Да, продолжаем перебирать массив a
            }
            else {
                if (a[i] < b.getA()[j]){    // Поиск мин значения
                    temp[k] = a[i++];       // Вставка его в новый массив и пеермещение курсора
                }
                else {
                    temp[k] = b.getA()[j++];
                }
            }
        }
        return temp;
    }

    /**
     * Вывод массива
     */
    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
