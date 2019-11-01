public class SingleTone1Test {
    public static void main(String[] args){
        SingleTone1 instance1 = new SingleTone1();
        SingleTone1 instance2 = new SingleTone1();
        System.out.println(instance1==instance2);
        SingleTone1 instance3 = SingleTone1.getInstance();
        SingleTone1 instance4 = SingleTone1.getInstance();
        System.out.println(instance3==instance4);
    }
}
