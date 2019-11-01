/**
 * @Author: renyi
 * @Date: 19/10/16 10:57
 */
public class Test1 {
    int a = 1;

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        System.out.println(this.a++);
        return this.toString();

    }
}
