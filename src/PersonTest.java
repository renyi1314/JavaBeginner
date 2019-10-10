public class PersonTest {
    public static void main(String[] args) {
        Trans trans = new Trans();
        Person huanghuan = Person.getInstance("huanghuan");
        huanghuan.setAge(600);
        huanghuan.speak();
        Person renyi = Person.getInstance("renyi");
        renyi.setAge(20);
        renyi.speak();
    }
}
