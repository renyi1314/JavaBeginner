public class test {
    test() {
        System.out.println("111");
    }



    public static void main(String[] args) {
//        String1 a = new String1();
//        String1 b = new String1();
        String1 a = String1.getInstance();
        String1 b = String1.getInstance();
        System.out.println(a.equals(b));
        Object c = a.getClass();
        System.out.println(a.toString());
        Integer d = 111;
        String e = "1111";
        System.out.println(Integer.parseInt("111122"));
        System.out.println(Integer.toString(d).getClass());
        System.out.println(Boolean.toString(false));
    }
}
