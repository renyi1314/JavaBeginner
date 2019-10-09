public class DoWhile2 {
    public static void main(String[] args) {
        int number = 1, result = 1;
        while (number <= 10) {
            System.out.println(number);
            result *= number;
            number++;
        }

        System.out.print("10阶乘结果是：" + result);
    }
}
