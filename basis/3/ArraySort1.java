import java.util.Arrays;

public class ArraySort1 {

    static String name;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 99, 23, 12, 48, 45};
        Arrays.sort(arr);
        for (int value:arr){
            System.out.println(value);
        }
        test();
    }

    public  static void test(){
        System.out.println(name);
    }
}
