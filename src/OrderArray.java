public class OrderArray {

    private int[] a;
    private int nElems;

    public OrderArray(int max) {
        this.a = new int[max];
        this.nElems = 0;
    }

    /**
     * Делает вставку в массив и умеличивает его на 1
     * @param value Число которое вставить
     */
    public void insert(int value){
        a[nElems] = value;
        nElems++;
    }

    /**
     * Пузырьковая сортировка
     */
    public void bubbleSort(){
        for (int i = a.length-1; i > 1; i--){
            for (int j = 0; j < i ; j++) {
                if (a[j] > a[j+1]){
                    swap(j, j+1);
                }
            }
        }
    }

    /**
     * Перестановка элементов в массиве для пузырьковой сортровки
     * @param one первый элемент
     * @param two второй элемент
     */
    private void swap(int one, int two){
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public int[] getA() {
        return a;
    }

    /**
     * Бинарный(двоичный) поиск значения, только в упорядоченном массиве
     * @param searchNumber какое число найти
     * @return возвращает индекс найденного элемента или общее число элементов, если не найден элемент
     */
    public int find(int searchNumber){

        int lowerBound = 0;         // нижняя граница массива
        int upperBound = a.length-1;// верхняя граница массива
        int curIn;                  // положение курсора
        while (true) {
            curIn = (lowerBound + upperBound) / 2;  // текущее положение курсора
            if (a[curIn] == searchNumber) {         // число найдено?
                return curIn;                       // да, возвращаем индекс уго
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
}
