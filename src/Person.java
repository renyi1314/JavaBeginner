public class Person {
    private static Person instance;
    private String name;
    private int age;

    private Person(String name) {
        this.name = name;
    }

    void setAge(int i) {
        age = i;
    }

    void speak() {
        System.out.println("my name is " + name);
        System.out.println(name.startsWith("111"));
        System.out.println("my age is " + age);
    }

    static Person getInstance(String name) {
        if (instance == null) {
            instance = new Person(name);
        }
        return instance;
    }

    public static void main(String[] args) {
    }
}
