public class duotai1Test {


    public static void main(String[] args) {

        Animal one = new Animal();
        Cat two = new Cat();
        Animal three = new Dog();
        one.speak();
        two.speak();
        three.speak();
//        three.call();
        two.run();
        two.speak();
        System.out.println(three instanceof Dog);
    }
}
