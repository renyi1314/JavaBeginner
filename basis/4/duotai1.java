class Animal {
    Animal() {

    }

    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("我今年" + this.age + "岁了");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("我是动物");
    }

}


class Cat extends Animal {
    Cat() {

    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void speak() {
        System.out.println("我是猫");
    }

    void run() {
        System.out.println("猫正在跑");
    }
}

class Dog extends Animal {
    Dog() {

    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void speak() {
        System.out.println("我是狗");
    }

    void call(){
        System.out.println("狗在叫");
    }
}
