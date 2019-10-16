import java.util.Scanner;

public class InputAndSwithCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("111");
                break;
            case 2:
                System.out.println("222");
                break;
            default:
                System.out.println("666");
        }
    }
}
