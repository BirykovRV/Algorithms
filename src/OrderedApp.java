public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrderArray arr;
        arr = new OrderArray(maxSize);

        arr.insert(88);
        arr.insert(44);
        arr.insert(22);
        arr.insert(55);
        arr.insert(00);
        arr.insert(33);
        arr.insert(11);
        arr.insert(66);
        arr.insert(77);
        arr.insert(99);

        int searchKey = 55;
        if (arr.find(searchKey) != arr.size()){
            System.out.println("Найден элемент: " + searchKey);
        }
        else {
            System.out.println("Не удается найти ключ");
        }
        arr.display();

    }
}
