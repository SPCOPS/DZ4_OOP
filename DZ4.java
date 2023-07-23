public class DZ4 {
    public static <T> void printElement(T element) {
        System.out.println(element);
    }
    public static void main(String[] args) {
        Integer integerElement = 42;
        String stringElement = "Привет, мир!";
        Double doubleElement = 3.14;

        printElement(integerElement);
        printElement(stringElement);
        printElement(doubleElement); 
    }
}
