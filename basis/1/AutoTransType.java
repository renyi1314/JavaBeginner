public class AutoTransType {
//    byte,short,char—> int —> long—> float —> double

    public static void main(String[] args) {
        byte a = 1;
        short b = a;
        float c = 12211233;
        char d = (char) c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
