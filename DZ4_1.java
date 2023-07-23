public class DZ4_1 {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Привет", "мир!", "Это", "обобщенный", "метод"};

        System.out.print("Массив типа Integer: ");
        printArray(intArray);

        System.out.print("Массив типа String: ");
        printArray(stringArray);
    }
}
