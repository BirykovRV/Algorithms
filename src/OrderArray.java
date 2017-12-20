public class OrderArray {

    private int[] a;
    private int nElems;

    public OrderArray(int max) {
        this.a = new int[max];
        this.nElems = 0;
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
        int j = find(value);                // Бинарный поиск
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

    /**
     * Вывод массива
     */
    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
