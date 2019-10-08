public class Person {
    private String name;
    private int age;

    Person(String name) {
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

    public static void main(String[] args) {
        Person renyi = new Person("renyi");
        renyi.setAge(30);
        renyi.speak();
    }
}
