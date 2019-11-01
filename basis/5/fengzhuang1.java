/**
 * @Author: renyi
 * @Date: 19/10/24 16:59
 */
public class fengzhuang1 {
    private String name;
    private int age;

    fengzhuang1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "My Name is" + this.getName() + ";My age is" + this.getAge();
    }
}
