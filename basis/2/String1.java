public class String1 {
    private static String1 instance;

    public static void main(String[] args) {
        String a = "aaabbbcccaaawqe123vasd";
        String b = "bbb";
        String[] arr1 = a.split("a");

    }

    public String toString() {
        return "1111";
    }

    static String1 getInstance() {
        if (instance == null) {
            instance = new String1();
        }
        return instance;
    }
}
