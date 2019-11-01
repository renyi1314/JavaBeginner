public class test {
    test() {
        System.out.println("111");
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int numbers[] = {6, 2, 3, 2, 5};
        test.printArray(numbers);
    }
}
