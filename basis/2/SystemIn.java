import java.io.IOException;

public class SystemIn {
    public static void main(String[] args) {
        System.out.println("请输入字符");
        try {
            int input = System.in.read();
            System.out.println((char) input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
