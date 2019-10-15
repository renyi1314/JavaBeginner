public class Args1 {
    void print(int i, String... name){
        for(String n:name){
            System.out.println(n);
        }
        System.out.println(name.length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
