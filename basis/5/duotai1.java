/**
 * @Author: renyi
 * @Date: 19/10/24 17:34
 */

class Animal {
    private String name;
    private Integer age;

    Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog(String name, Integer age) {
        super(name, age);
    }
}

class Cat extends Animal {
    Cat(String name, Integer age) {
        super(name, age);
    }
}